package leetcode;

public class countVowel {
    public static void main(String[] args) {
        System.out.println(countVowelStrings(33));
    }

    public static int countVowelStrings(int n) {
        int[] dp = new int[6];
        dp[0] = 0;
        for(int k = 1; k < 6; k++) {
            dp[k] = 1;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= 5; j++) {
                dp[j] += dp[j-1];
            }
        }
        return dp[5];
    }
}
