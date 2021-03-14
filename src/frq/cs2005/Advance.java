package frq.cs2005;

public class Advance {
    private int daysInAdvance;
    public Advance(int daysInAdvance) {
        this.daysInAdvance = daysInAdvance;
    }

    public int getDaysInAdvance() {
        return daysInAdvance;
    }

    public int getCost() {
        if(daysInAdvance >= 10) {
            return 30;
        }
        else{
            return 40;
        }
    }


}
