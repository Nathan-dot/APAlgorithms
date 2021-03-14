package leetcode;

import java.util.Arrays;

public class stoneWeight {
    public static void main(String[] args) {
        int[] a = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(a));
    }

    public static int lastStoneWeight(int[] stones) {
        // [1, 1, 2, 4, 7, 8] -> [1, 1, 2, 4, 1] -> [1, 1, 1, 2, 4] -> [1, 1, 1, 2] -> [1, 1, 1] -> [1]
        // 8 - 7 = 1, 4 - 2 = 2, 2 - 1 = 1
        for(int i = 0; i < stones.length; i++) {
            if(stones.length > 1) {
                Arrays.sort(stones);
                stones[stones.length - 1] = stones[stones.length - 1] - stones[stones.length - 2];
                stones[stones.length - 2] = 0;
            }
        }
        return stones[stones.length - 1];
    }
}
