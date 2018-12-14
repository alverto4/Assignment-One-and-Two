package assignment.twoD;

public class Square extends Rectangle
{
    public Square()
    {}

    public Square(double side)
    {
        setWidth(side);
        setLength(side);
    }

    public Square(double side, String color, boolean filled)
    {
        setWidth(side);
        setLength(side);
        setColor(color);
        setFilled(filled);
    }

    public double getSide()
    {
        return getLength();
    }

    public void setSide(double side)
    {
        setLength(side);
        setWidth(side);
    }

    public void setWidth(double side)
    {
        super.setWidth(side);
    }

    public void setLength(double side)
    {
        super.setLength(side);
    }

    public String toString()
    {
        return "Square Area=" + getArea() + ", Perimeter=" + getPerimeter();
    }


}
