package frq.cs2006;

public class Appointment {
    TimeInterval a;
    int time;
    public Appointment(TimeInterval a, int time) {
        a = new TimeInterval(time);
    }
    public TimeInterval getTime() {
        return a;
    }

    public boolean conflictsWith(Appointment other) {
        return getTime().overlapsWith(other.getTime());
    }
}
