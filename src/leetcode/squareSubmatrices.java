package leetcode;

public class squareSubmatrices {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}};
        System.out.println(countSquares(matrix));
    }

    public static int countSquares(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int count = 0;
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] == 1) {
                count++;
            }
        }
        for(int i = 1; i < matrix[0].length; i++) {
            if(matrix[0][i] == 1) {
                count++;
            }
        }

        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j] == 1) {
                    int a = Math.min(matrix[i-1][j-1], Math.min(matrix[i-1][j], matrix[i][j-1]));
                    matrix[i][j] = a + 1;
                    count += matrix[i][j];
                }
            }
        }
        return count;
    }
}
