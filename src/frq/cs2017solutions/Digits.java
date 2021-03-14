package frq.cs2017solutions;

import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num) {
        this.digitList = new ArrayList<>();
        if (num == 0) {
            digitList.add(0);
        }
        while (num > 0) {
            digitList.add(0, num % 10);
            num = num / 10;
        }
    }

    public boolean isStrictlyIncreasing() {
        for (int i = 0; i < digitList.size() - 1; i++) {
            if (digitList.get(i) >= digitList.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
