package leetcode;

import java.util.Scanner;

public class squareNumbers {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println(squareNumber(a.nextInt()));
    }
    public static boolean squareNumber(int n) {
        for(long a = 0; a * a <= n; a++) {
            double b = Math.sqrt(n - a * a);
            if (b == (int) b)
                return true;
        }
        return false;

    }
}
