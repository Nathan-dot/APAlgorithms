package Arrays.CCC.CCC2021;

import java.util.Scanner;

public class modernArt {
    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
       int rows = a.nextInt();
       int columns = a.nextInt();
       int colorChange = a.nextInt();
        int[][] canvas = new int[rows][columns];
        int sum = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                canvas[i][j] = 0;
            }
        }
        a.nextLine();
       for(int i = 0; i < colorChange; i++) {
           goldCells(rows, columns, canvas, a.nextLine());
       }
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(canvas[i][j] == 1) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
    public static void goldCells(int rows, int columns, int[][] canvas, String choice) {
        // 0 = black, 1 = gold
        String[] a = choice.split(" ");
        if(a[0].equals("R")) {
            for(int i = 0; i < columns; i++) {
                if(canvas[Integer.parseInt(a[1])-1][i] == 0) {
                    canvas[Integer.parseInt(a[1])-1][i] = 1;
                }
                else {
                    canvas[Integer.parseInt(a[1])-1][i] = 0;
                }
            }
        }
        else {
            for(int i = 0; i < rows; i++) {
                if (canvas[i][Integer.parseInt(a[1])-1] == 0) {
                    canvas[i][Integer.parseInt(a[1])-1] = 1;
                }
                else {
                    canvas[i][Integer.parseInt(a[1])-1] = 0;
                }
            }
        }
    }
}
