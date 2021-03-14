package leetcode;

public class minCost {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(minCostToMoveChips(a));
    }

    public static int minCostToMoveChips(int[] position) {
        int even_count = 0;
        int odd_count = 0;
        // [2, 2, 2, 3, 3] -> 2 odds, total cost: 2
        // [1, 2, 3] -> 1 even, total cost: 1
        for(int i = 0; i < position.length; i++) {
            if(position[i] % 2 == 0) {
                even_count++;
            }
            else {
                odd_count++;
            }
        }
        return Math.min(even_count, odd_count);
    }
}
