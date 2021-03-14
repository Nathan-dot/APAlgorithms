package leetcode;

import java.util.Scanner;

public class blueTiles2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        System.out.println(tiles(n));
    }

    public static int tiles(int n) {
        if (n == 1) {
            return 1;
        }
        else if (n == 2) {
            return 3;
        }
        else if (n == 3) {
            return 5;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 3;
        dp[3] = 5;
        for(int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + 2*dp[i - 2];
            // don't understand fully - knew I needed to 2* something because two 2*1s
            // or two 1*2s on top of each other could be replaced with one 2*2.
        }
        return dp[n];
    }
}
