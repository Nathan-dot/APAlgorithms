package frq.barrons;

public class Contestant {
    private String name;
    private int score;
    private Location loc;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Location getLoc() {
        return loc;
    }

    public void updateLocation(int newRow, int newCol) {
        loc = new Location(newRow, newCol);
    }
}
