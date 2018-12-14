package assignment.oneD;

public class Point {
    private int x=0;
    private int y=0;

    public Point()
    { }

    public Point(int a, int b){
        this.x = a;
        this.y = b;
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {

        this.x = x;
    }

    public int getY() {

        return y;
    }

    public void setY(int y) {

        this.y = y;
    }

    public String toString() {

        return "("+Integer.toString(this.x)+","+Integer.toString(this.y)+")";
    }

    public int[] getXY(){
        int[] array = new int[2];
        array[0] = x;
        array[1] = y;
        return array;
    }

    public void  setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y)
    {
        int a = this.x - x;
        int b = this.y - y;
        double dist = Math.sqrt((Math.pow(a,2))+(Math.pow(b,2)));
        return dist;
    }

    public double distance(Point another)
    {
        int a = this.x - another.x;
        int b = this.y - another.y;
        double dist = Math.sqrt((Math.pow(a,2))+(Math.pow(b,2)));
        return dist;
    }

    public double distance(){
        int a = this.x;
        int b = this.y;
        double dist = Math.sqrt((Math.pow(a,2))+(Math.pow(b,2)));
        return dist;
    }


}

