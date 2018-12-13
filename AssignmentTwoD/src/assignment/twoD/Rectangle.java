package assignment.twoD;

public class Rectangle extends Shape
{
    private double width = 1.0;
    private double length = 1.0;


    public Rectangle()
    {}

    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double widht, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth()
    {
        return this.width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getLength()
    {
        return this.length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getArea()
    {
        return this.width * this.length;
    }

    public double getPerimeter()
    {
        return (this.length * 2) + (this.width * 2);
    }

    public String toString()
    {
        return "Rectangle Area="+Double.toString(getArea())+", Perimeter="+Double.toString(getPerimeter());
    }

}
