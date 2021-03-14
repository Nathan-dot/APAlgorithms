package frq.cs2015;


public class DiverseArray {

    public static void main(String[] args) {
        int[][] mat1 = {{1, 10, 5, 7}, {3, 10, 3, 6}, {2, 4, 5, 4}, {7, 6, 9, 2}, {3, 2, 6, 1}};
        int[][] mat2 = {{1, 12, 8, 3}, {1, 7, 11, 2}, {5, 6, 10, 3}, {3, 1, 2, 0},{4, 9, 5, 6}};
        System.out.println(isDiverse(mat2));
    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        return sum;
    }

    public static int[] rowSums(int[][] arr2D) {
        int[] rowSum = new int[arr2D.length];
        for(int i = 0; i < arr2D.length; i++) {
            rowSum[i] = arraySum(arr2D[i]);
        }
        return rowSum;
    }

    public static boolean isDiverse(int[][] arr2D) {
         int[] sum = rowSums(arr2D);
         for(int i = 0; i < sum.length; i++) {
             for(int j = i + 1; j < sum.length; j++) {
                 if(sum[i] == sum[j]) {
                     return false;
                 }
             }
         }
         return true;
    }
}
