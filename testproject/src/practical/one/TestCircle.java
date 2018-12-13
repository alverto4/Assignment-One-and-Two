package practical.one;

public class TestCircle {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(12.5);
        System.out.println(c1.getArea());
        c1.setColor("red");
        System.out.println(c1.getColor());
    }
}
