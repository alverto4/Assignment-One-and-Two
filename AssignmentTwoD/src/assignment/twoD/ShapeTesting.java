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

        //Rectangle testing
        Rectangle r1 = new Rectangle();
        r1.setLength(4.0);
        r1.setWidth(2.0);
        r1.setColor("gold");
        System.out.println(r1.getColor());
        System.out.println(r1.toString());

        //Square testing
        Square s1 = new Square(5.0);
        s1.setColor("black");
        System.out.println(s1.getColor());
        System.out.println(s1.toString());


    }
}
