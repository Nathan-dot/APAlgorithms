package frq.cs2017;

public class Position {

    public Position(int r, int c) {
        int[][] array = new int[r][c];
    }

    public static Position findPosition(int num, int[][] intArr) {
        for(int i = 0; i < intArr.length; i++) {
            for(int j = 0; j < intArr[0].length;j++) {
                if(intArr[i][j] == num) {
                    return new Position(i, j);
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] intArr) {
        Position[][] a = new Position[intArr.length][intArr[0].length];
        for(int i = 0; i < intArr.length; i++) {
            for(int j = 0; j < intArr.length; j++) {
                a[i][j] = findPosition(intArr[i][j] + 1, intArr);
            }
        }
        return a;
    }
}
