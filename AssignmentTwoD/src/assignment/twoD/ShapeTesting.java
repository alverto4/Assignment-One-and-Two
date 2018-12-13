package assignment.twoD;

public class ShapeTesting {

    public static void main(String[] args)
    {
        Shape circle = new Shape();
        circle.setColor("blue");
        circle.setFilled(false);
        System.out.println(circle.toString());

        //Circle testing
        Circle c1 = new Circle(3.0,"white",true);
        System.out.println(c1.getColor());
        System.out.println(c1.toString());


    }
}
