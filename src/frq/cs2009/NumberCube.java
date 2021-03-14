package frq.cs2009;

public class NumberCube {
    private int numTosses;

    public int toss() {
        return ((int) (Math.random() * 6));
    }

    public NumberCube(int numTosses) {
        this.numTosses = numTosses;
    }

    public static int[] getCubeTosses(NumberCube cube, int numTosses) {
        int[] arr = new int[numTosses];
        for(int i = 0; i < numTosses; i++) {
            arr[i] = cube.toss();
        }
        return arr;
    }

    public static int getLongestRun(int[] values) {
        int maxRun = 0;
        int current = 0;
        int startindex = -1;
        for(int i = 0; i < values.length - 1; i++) {
            if(values[i] == values[i+1]){
                current++;
                if(current > maxRun) {
                    startindex = i;
                    maxRun = current;
                }
            }
        }
        if(maxRun == 0) {
            return -1;
        }
        else {
            return startindex;
        }
    }
}
