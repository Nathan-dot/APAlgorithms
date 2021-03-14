package leetcode;

public class maximumSubarray {
    public static void main(String[] args) {
        int[] b = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(b));
    }
    public static int maxSubArray(int[] nums) {
        int a = nums[0];
        int sum = 0;
        for(int number : nums) {
            if(sum < 0) {
                sum = 0;
            }
            sum += number;
            a = Math.max(a, sum);
        }
        return a;
    }
}
