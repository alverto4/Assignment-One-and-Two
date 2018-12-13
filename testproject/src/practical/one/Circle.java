package practical.one;

public class Circle {
    private double radius;
    private String color;

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
}
