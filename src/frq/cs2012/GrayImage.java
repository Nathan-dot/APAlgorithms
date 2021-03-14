package frq.cs2012;

public class GrayImage {
    private int[][] pixelValues;
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    public GrayImage(int[][] pixelValues){
        this.pixelValues = pixelValues;
    }

    public int countWhitePixels()
    {
        int whitePixels = 0;
        for(int row = 0; row < pixelValues.length; row++)
            for(int col = 0; col < pixelValues[row].length; col++)
                if(pixelValues[row][col] == WHITE)
                    whitePixels++;
        return whitePixels;
    }

    public void processImage() {
        for(int row = 0; row < pixelValues.length - 2; row++) {
            for(int col = 0; col < pixelValues[row].length - 2; col++) {
                pixelValues[row][col] -= pixelValues[row + 2][col + 2];
                if(pixelValues[row][col] < BLACK)  {
                    pixelValues[row][col] = BLACK;
                }
            }
        }
    }
}
