package frq.cs2005;

public class StudentRecord {
    private int[] scores;

    private double average(int first, int last) {
        int average = 0;
        for(int i = first; i <= last; i++) {
            average += scores[i];
        }
        return average / (last - first + 1);
    }

    private boolean hasImproved() {
        int lastScore = 0;
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] >= lastScore) {
                lastScore = scores[i];
            }
            else{
                return false;
            }
        }
        return true;
    }

    public double finalAverage() {
        if(hasImproved()) {
            return average(scores.length/2, scores.length-1);
        }
        else{
            return average(0, scores.length-1);
        }
    }
}
