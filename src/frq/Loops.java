package frq;

import java.util.ArrayList;

public class Loops {
    //For, For-Each, and While Loops
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        // Hard to change each individual element, but automatically will change length of list for you
        // Way more built-in functions for ArrayList than Array
        a.add(3);
        a.add(5);
        //For-Each Loops:
        // -cannot actually alter the value, only used for checking the value
        for(Integer c : a) {
            System.out.println(c);
        }
        int x = 3;
        //For Loops:
        // You can change the value more easily, will automatically count index
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // While Loops:
        while(x < 5) {
            System.out.println(x);
            x++;
        }
    }
}
