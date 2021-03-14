package frq.cs2012;

public class ClimbInfo {
    private String peakName;
    private int climbTime;

    public ClimbInfo(String peakName, int climbTime) {
        this.peakName = peakName;
        this.climbTime = climbTime;
    }

    @Override
    public String toString() {
        return peakName;
    }

    public String getName() {
        return peakName;
    }

    public int getTime() {
        return climbTime;
    }


}
