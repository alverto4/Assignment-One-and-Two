package assignment.twoA;

public class GeometricObj {

    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        c1.setRadius(4.0);
        c1.setColor("blue");

        System.out.println(c1.getArea());
        System.out.println(c1.toString());

        //For cylinder

        Cylinder cyl = new Cylinder(2,2);
        cyl.setColor("gray");
        System.out.println(cyl.getVolume());
        System.out.println(cyl.toString());


    }
}
