package frq.cs2009;

public class airplane {
    private int fuel;
    public airplane() {
        fuel = 0;
    }
    public airplane(int g) {
        fuel = g;
    }
    public void addFuel() {
        fuel++;
    }
    public String toString() {
        return fuel + " ";
    }
    public int getDuration() {
        return 3;
    }
}
