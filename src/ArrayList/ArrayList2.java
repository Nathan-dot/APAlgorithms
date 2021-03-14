package ArrayList;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10 ; i++) {
            arrayList.add((int)(Math.random() * 100));
        }
        System.out.println("ArrayList: " + arrayList);
    }
}
