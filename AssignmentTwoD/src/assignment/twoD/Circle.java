package assignment.twoD;

public class Circle extends Shape
{
    private double radius = 1.0;


    public Circle()
    {}

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter()
    {
        return Math.PI * 2 * this.radius;
    }

    public String toString()
    {
        return "Circle Area="+Double.toString(getArea())+", Perimeter="+Double.toString(getPerimeter());
    }
}
