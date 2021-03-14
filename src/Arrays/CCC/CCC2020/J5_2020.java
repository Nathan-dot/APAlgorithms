package Arrays.CCC.CCC2020;

import java.util.Scanner;
public class J5_2020 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = Integer.parseInt(in.nextLine());
        int n = Integer.parseInt(in.nextLine());
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            String[] rowInput = in.nextLine().split(" ");
            int[] rowInt = new int[n];
            for (int j = 0; j < n; j++) {
                rowInt[j] = Integer.parseInt(rowInput[j]);
            }
            grid[i] = rowInt;
        }
        if (!calculate(grid, grid.length-1, grid[0].length-1)) {
            System.out.println("no");
        }
    }
    public static boolean calculate(int[][] grid, int m, int n) {
        // intended value is grid[0][0]
        // (m * n)
        return false;
    }
}