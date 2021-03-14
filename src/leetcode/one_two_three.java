package leetcode;

import java.util.Scanner;

public class one_two_three {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int d[] = new int[b];
        for(int i = 0; i < b; i++) {
            d[i] = sumFinder(a.nextInt());
        }
        for(int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
    }

    public static int sumFinder(int n) {
        if (n == 1) {
            return 1;
        }
        else if (n == 2){
            return 2;
        }
        else if (n == 3) {
            return 4;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i-3];
        }
        return dp[n];
    }
}
