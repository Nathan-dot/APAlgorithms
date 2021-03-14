package frq.cs2010;
public class Trail {
    private int[] markers;

    public boolean isLevelTrailSegment (int start, int end) {
        int max = markers[start];
        int min = markers[start];
        for(int i = start + 1; i <= end; i++) {
            if(markers[i] > max) {
                max = markers[i];
            }
            if(markers[i] < min) {
                min = markers[i];
            }
        }
        if(Math.abs(max - min) <= 10) {
            return true;
        }
        return false;
    }

    public boolean isDifficult() {
        int difficultyCounter = 0;
        for(int i = 0; i < markers.length - 1; i++) {
            if(Math.abs(markers[i] - markers[i+1]) >= 30) {
                difficultyCounter++;
            }
        }
        if(difficultyCounter >= 3) {
            return true;
        }
        return false;
    }
}
