/*
GROUP MEMBERS:
CATHERINE APOLINARY  10644/T.2017
JULIANA R. MUSHI     10667/T.2017
KWAY, ERICK A.       10656/T.2017
NKYA, ALBERT ERIC    11315/T.2017
KENETH JOHN PETER    10673/T.2017
*/

package assignment.three;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';

    public static void main(String[] args) throws Exception{

        String csvFile = "assignmentThree/ASSIGNMENT_3_DATA.csv";

        Scanner scanner = new Scanner(new File(csvFile));
        int i = 0;
        int count = 0;
        double j,k,total,highest=0,lowest=100,sDevi, stDeviation=0;
        double[] stuMarks = new double[26];
        double clsmarks = 0;
        String grade = "";
        while (scanner.hasNext()){
            List<String> line = parseLine(scanner.nextLine());
            if(i > 0){
                j = Double.parseDouble(line.get(2));
                k = Double.parseDouble(line.get(3));
                total = j + k;

                if(total>highest){
                    highest = total;
                }
                if(total<lowest){
                    lowest = total;
                }

                clsmarks = clsmarks + total;
                stuMarks[i-1] = total;

                if (total > 70 && total <= 100) {
                    grade = "A";

                } else if (total > 60 && total <= 69) {
                    grade = "B+";

                } else if (total > 50 && total <= 59) {
                    grade = "B";

                } else if (total > 40 && total <= 49) {
                    grade = "C";

                } else if (total > 35 && total <= 39) {
                    grade = "D";
                    count++;

                } else if (total> 0 && total <= 34) {
                    grade = "E";
                    count++;
                }

                System.out.println(line.get(0)+"\t"+total+"\t"+grade);
            }
            else{
                System.out.println(line.get(0)+"\tTOTAL\tGRADE");
            }
            i++;
        }

        double clsAverage = clsmarks / (i-1);

        for(int a = 0; a < 26; a++){
            sDevi = Math.pow((stuMarks[a] - clsAverage),2);
            stDeviation = stDeviation + sDevi;
        }
        stDeviation = stDeviation / (i-1);
        stDeviation = Math.sqrt(stDeviation);

        System.out.println("Class average "+clsAverage);
        System.out.println("Class standard deviation "+stDeviation);
        System.out.println("Students below Pass mark "+count);
        System.out.println("Highest mark "+highest);
        System.out.println("Lowest mark "+lowest);
    }

    public static List<String> parseLine(String cvsLine){
        return parseLine(cvsLine, DEFAULT_SEPARATOR, DEFAULT_QUOTE);
    }

    public static List<String> parseLine(String cvsLine, char separators){
        return parseLine(cvsLine, separators, DEFAULT_QUOTE);
    }

    public static List<String> parseLine(String cvsLine, char separators, char customQuote) {

        List<String> result = new ArrayList<>();

        //if empty, return!
        if (cvsLine == null && cvsLine.isEmpty()) {
            return result;
        }

        if (customQuote == ' ') {
            customQuote = DEFAULT_QUOTE;
        }

        if (separators == ' ') {
            separators = DEFAULT_SEPARATOR;
        }

        StringBuffer curVal = new StringBuffer();
        boolean inQuotes = false;
        boolean startCollectChar = false;
        boolean doubleQuotesInColumn = false;

        char[] chars = cvsLine.toCharArray();

        for (char ch : chars) {

            if (inQuotes) {
                startCollectChar = true;
                if (ch == customQuote) {
                    inQuotes = false;
                    doubleQuotesInColumn = false;
                } else {

                    //Fixed : allow "" in custom quote enclosed
                    if (ch == '\"') {
                        if (!doubleQuotesInColumn) {
                            curVal.append(ch);
                            doubleQuotesInColumn = true;
                        }
                    } else {
                        curVal.append(ch);
                    }

                }
            } else {
                if (ch == customQuote) {

                    inQuotes = true;

                    //Fixed : allow "" in empty quote enclosed
                    if (chars[0] != '"' && customQuote == '\"') {
                        curVal.append('"');
                    }

                    //double quotes in column will hit this!
                    if (startCollectChar) {
                        curVal.append('"');
                    }

                } else if (ch == separators) {

                    result.add(curVal.toString());

                    curVal = new StringBuffer();
                    startCollectChar = false;

                } else if (ch == '\r') {
                    //ignore LF characters
                    continue;
                } else if (ch == '\n') {
                    //the end, break!
                    break;
                } else {
                    curVal.append(ch);
                }
            }

        }

        result.add(curVal.toString());

        return result;
    }

}