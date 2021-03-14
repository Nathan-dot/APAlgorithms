package CCC.C2014;

import java.util.ArrayList;
import java.util.Scanner;

public class J4 {
    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
       int b = a.nextInt();
       ArrayList<Integer> friends = new ArrayList<>();
       ArrayList<Integer> friends1 = new ArrayList<>();
       int c = a.nextInt();
       int[] d = new int[c];

       for(int i = 0; i < c; i++) {
           d[i] = a.nextInt();
       }
       for(int i = 0; i < b; i++) {
           friends.add(i + 1);
       }

       for(int round = 0; round < c; round++) {
           for(int i = 1; i < friends.size() + 1; i++) {
               if(i % d[round] != 0) {
                   friends1.add(friends.get(i-1));
               }
           }
           friends = friends1;
           friends1 = new ArrayList<>();
       }
       for(int i = 0; i < friends.size(); i++) {
           System.out.println(friends.get(i));
       }
    }
}
