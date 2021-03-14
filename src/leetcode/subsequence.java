package leetcode;

public class subsequence {
    public static void main(String[] args) {
        int[] b = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(longestSequence(b));
    }
    public static int longestSequence(int[] nums) {
        int a = 1;
        if (nums.length <= 1) {
            return nums.length;
        }
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j <= i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    // this step is basically counting
                    // the numbers in the list up until that point
                    // i.e. 7 > 2 so dp[index7] = 2 since 2 for list are found
                    // 7 > 5 so dp[index7] is incremented from 2 to 3 since 3 for list are found
                    // 101 > 2, 101 > 5, 101 > 7 so ends up with 4
                    // if a number isn't used in a list it will be ignored bc dp[its index] will not increment
                    a = Math.max(dp[i], a);
                }
            }
        }
        return a;
    }
}


