package frq.hwork2;

public class ArrayTester {
    public static int[] getColumn(int[][] arr2D, int c) {
        int[] a = {};
        for(int i = 0; i < arr2D.length; i++) {
            a[i] = arr2D[i][c];
        }
        return a;
    }
    public static boolean hasAllValues(int[] arr1, int[] arr2) {
        for(int i = 0; i < arr1.length; i++) {
            boolean flag = false;
            for(int j = 0; i < arr2.length; i++) {
                if(arr1[i] == arr2[j]) {
                    flag = true;
                }
            }
            if (!flag) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsDuplicates(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; i < arr.length; i++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isLatin(int[][] square) {
        if(!containsDuplicates(square[0])) {
            return false;
        }
        for(int r = 1; r < square.length; r++) {
            if(!hasAllValues(square[0], square[r])) {
                return false;
            }
        }
        return true;
    }
}
