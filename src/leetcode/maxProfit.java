package leetcode;

public class maxProfit {
    public static void main(String[] args) {
        int[] b = {7, 1, 5, 3, 6, 4};
        System.out.println(maximumProfit(b));
    }
    public static int maximumProfit(int[] prices) {
        if(prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int currentMaxProfit = 0;

        for(int i = 1; i < prices.length; i++) {
            //lowest selling price, highest buying price (Day 2, Day 5)
            if(min <= prices[i]) {
                currentMaxProfit = Math.max(currentMaxProfit, prices[i] - min);
            }
            else{
                min = prices[i];
            }
        }
        return currentMaxProfit;
    }
}
