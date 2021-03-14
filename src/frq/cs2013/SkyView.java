package frq.cs2013;

public class SkyView {
    private double[][] view;
    public SkyView(int numRows, int numCols, double[] scanned) {
        view = new double[numRows][numCols];
        int index = 0;

        for(int row = 0; row < numRows; row++) {
            for(int col = 0; col < numCols; col++) {
                if(row % 2 == 0) {
                    view[row][col] = scanned[index];
                }
                else {
                    view[row][numCols - col - 1] = scanned[index];
                }
            }
            index++;
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        int sum = 0;
        int count = 0;

        for(int r = startRow; r <= endRow; r++) {
            for(int c = startCol; c <= endCol; c++) {
                sum += view[r][c];
                count++;
            }
        }
        return sum/count;
    }
}
