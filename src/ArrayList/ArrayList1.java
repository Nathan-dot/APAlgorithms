package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            arrayList.add(-113);
        }

        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println("Slot " + i + " contains a " + arrayList.get(i));
        }
    }
}
