package frq.hwork;

public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int numRows, int numCols) {
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                if (Math.random() <= 0.4) {
                    lights[r][c] = true;
                } else {
                    lights[r][c] = false;
                }
            }

        }
    }

    public boolean evaluateLight(int row, int col) {
        int numColumn = 0;
        int numColumn1 = 0;
        if (lights[row][col]) {
            for (int i = 0; i < lights.length; i++) {
                if (lights[i][col]) {
                    numColumn++;
                }
            }
            if (numColumn % 2 == 0) {
                return false;
            }
        }
        if (!lights[row][col]) {
            for (int i = 0; i < lights.length; i++) {
                if (lights[i][col]) {
                    numColumn1++;
                }
            }
            if (numColumn1 % 3 == 0) {
                return true;
            }
        }
        return lights[row][col];
    }
}
