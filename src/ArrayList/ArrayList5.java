package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++ ) {
            arrayList.add((int)(Math.random() * 50)+1);
        }
        System.out.println("ArrayList : " + arrayList);

        Scanner input = new Scanner(System.in);
        System.out.println("Value to find: ");
        int value = input.nextInt();
        for(int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) == value) {
                System.out.println(value + " is in the ArrayList");
            }
        }
    }
}
