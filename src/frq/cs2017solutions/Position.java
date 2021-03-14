package frq.cs2017solutions;

import java.util.ArrayList;

public class Position {
    private int[][] array;

    public Position(int r, int c) {
        this.array = new int[r][c];
    }

    public static Position findPosition(int num, int[][] intArr) {
        for(int i = 0; i < intArr.length; i++) {
            for(int j = 0; j < intArr[0].length; j++) {
                if(intArr[i][j] == num) {
                    return new Position(i, j);
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorsArray(int[][] intArr) {
        Position[][] successors = new Position[intArr.length][intArr[0].length];
        for(int i = 0; i < intArr.length; i++) {
            for(int j = 0; j < intArr[0].length; j++) {
                successors[i][j] = findPosition(intArr[i][j] + 1, intArr);
            }
        }
        return successors;
     }
}
