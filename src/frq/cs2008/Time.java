package frq.cs2008;

public class Time {
    private int hour;
    private int minutes;
    public Time(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }
    public int minutesUntil(Time other) {
        int hourdifference = Math.abs(other.hour - this.hour);
        int minutedifference = Math.abs(other.minutes - this.minutes);
        return hourdifference*60 + minutedifference;
    }
}
