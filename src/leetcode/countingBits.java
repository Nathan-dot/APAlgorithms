package leetcode;

import java.util.Arrays;

public class countingBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(6)));
    }

    public static int[] countBits(int num) {
        int[] a = new int[num + 1];
        if(num == 0) {
            return a;
        }
        a[1] = 1;
        for(int i = 2; i <= num; i++) {
            a[i] = a[i / 2] + i % 2;
        }
        return a;
    }
}
