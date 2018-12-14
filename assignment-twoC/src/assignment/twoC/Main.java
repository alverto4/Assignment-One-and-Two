package assignment.twoC;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person P1 = new Person("kilango","Kijichi");
        Student S1 = new Student("kelvin","makongo","ISM",2016,24000);
        Staff S2 = new Staff("Winstone","Mbezi","Jamhuri",20500);
        System.out.println(P1.toString());
        System.out.print(S1.toString());
        System.out.println(S2.toString());
    }
}
