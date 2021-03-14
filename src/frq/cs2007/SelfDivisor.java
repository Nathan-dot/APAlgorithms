package frq.cs2007;

import java.util.Arrays;
public class SelfDivisor {
    public static boolean isSelfDivisor(int number) {
        int n = number;
        while(n > 0) {
            // when digit is zero, when number is not perfectly divisible by a digit
            if(n % 10 == 0 || number % (n % 10) != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static int[] firstNumSelfDivisors(int start, int num) {
        int count = 0;
        int[] result = new int[num];
        while(num > count) {
            if(isSelfDivisor(start)) {
                result[count] = start;
                count++;
            }
            start++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isSelfDivisor(13));
        System.out.println(Arrays.toString(firstNumSelfDivisors(10, 3 )));
    }
}
