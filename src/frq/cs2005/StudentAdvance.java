package frq.cs2005;

public class StudentAdvance extends Advance{
    private int daysInAdvance;
    public StudentAdvance(int daysInAdvance) {
        super(daysInAdvance);
    }

    public int getPrice() {
        return super.getCost()/2;
    }

    public String toString() {
        return super.toString() + "(student ID required)";
    }
}
