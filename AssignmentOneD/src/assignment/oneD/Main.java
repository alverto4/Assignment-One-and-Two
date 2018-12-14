package assignment.oneD;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(1,0);
        Point p2 = new Point(5,0);

        //Distance from (0,0)
        System.out.println(p1.distance());

        //Distance from this to given(x,y)
        System.out.println(p1.distance(3,0));

        //Distance from this to another point
        System.out.println(p1.distance(p2));
    }
}
