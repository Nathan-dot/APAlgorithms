package frq.cs2017;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Integer> digitList;
        Digits digit = new Digits(65310);
        int n = 1704;
        digitList = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            digitList.add(0,n%10);
            n = n / 10;
        }
        System.out.println(digitList);
        System.out.println(digit.isStrictlyIncreasing());
    }
}
