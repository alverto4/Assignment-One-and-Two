package assignment.oneC;

public class Time {
    private int second = 0;
    private int minite = 0;
    private int hour = 0;

    public Time() {

    }

    public Time(int sec, int min, int hor) {
        second = sec;
        minite = min;
        hour = hor;

    }

    public int getHour() {
        return hour;
    }

    public int getMinite() {
        return minite;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minite = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString() {
        return "Time:" +Integer.toString(getHour())+ ":" +Integer.toString(getMinite())+ ":" +Integer.toString(getSecond());
    }

}
