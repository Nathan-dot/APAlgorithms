package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minimumSubsequence {
    public static void main(String[] args) {
        int[] a =  {4, 4, 7, 6, 7};
        System.out.println(minSubsequence(a));
    }

    public static List<Integer> minSubsequence(int[] nums) {
        // [4, 3, 10, 9, 8] -> [10, 9]
        // [4, 4, 7, 6, 7] -> [7, 6, 7]
        // [6] -> 6
        int sum = 0;
        int sum2 = 0;
        List<Integer> a = new ArrayList<>();
        Arrays.sort(nums);
        // [3, 4, 8, 9, 10] -> Start testing from the back
        for(int j = 0; j < nums.length; j++) {
            sum2 += nums[j];
        }
        for(int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            a.add(nums[i]);
            sum2 -= nums[i];
            // sum is the current total of numbers in the list, sum2 is the added sum of all numbers in the subsequence
            if(sum > sum2) {
                break;
            }
        }
        return a;
    }
}
