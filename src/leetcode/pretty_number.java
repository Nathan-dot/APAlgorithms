package leetcode;

public class pretty_number {
    public static void main(String[] args) {
        System.out.println(prettyNumber(5));
        System.out.println(prettyNumber(10));
    }
    // incorrect
    public static int prettyNumber(int n) {
        if (n == 1) {
            return 9;
        }
        else if (n == 2){
            return 17;
        }
        else if (n == 3) {
            return 32;
        }
        int[] dp = new int[n + 1];
        dp[1] = 9;
        dp[2] = 17;
        dp[3] = 32;
        for(int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3] + dp[i - 4];
        }
        return dp[n];
    }
}
