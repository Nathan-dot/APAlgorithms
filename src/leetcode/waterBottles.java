package leetcode;

public class waterBottles {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(2, 3));
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        // 9 + 9/3 + 3/3
        // 15 + int(15/4) + int((3+3)/4)
        int a = numBottles;
        int b = a;
        int empty = 0;
        while(b >= numExchange) {
            empty = (b % numExchange);
            a += (b / numExchange);
            b = empty + (b / numExchange);
        }
        return a;
    }
}
