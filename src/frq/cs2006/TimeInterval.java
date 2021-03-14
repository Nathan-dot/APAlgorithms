package frq.cs2006;

public class TimeInterval {
    private int time;
    public TimeInterval(int time) {
        this.time = time;
    }

    public boolean overlapsWith(TimeInterval interval) {
        if(this.time == interval.time) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TimeInterval a = new TimeInterval(530);
        TimeInterval b = new TimeInterval(530);
        System.out.println(a.overlapsWith(b));
    }
}
