package ArrayList;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> copy = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            arrayList.add((int)(Math.random() * 100));
        }

        for(int i = 0; i < arrayList.size(); i++) {
            copy.add(arrayList.get(i));
        }
        arrayList.set(arrayList.size()-1, -7);
        System.out.println("ArrayList 1: " + arrayList);
        System.out.println("ArrayList 2: " + copy);

    }
}
