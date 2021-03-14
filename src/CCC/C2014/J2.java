package CCC.C2014;

import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int votes = Integer.parseInt(in.nextLine());
        String[] c = in.nextLine().split("");
        int a = 0;
        int b = 0;
        for(int i = 0; i < c.length; i++) {
            if(c[i].equals("A")) {
                a++;
            }
            else if (c[i].equals("B")){
                b++;
            }
        }
        if(a == b) {
            System.out.println("Tie");
        }
        else {
            if(a > b) {
                System.out.println("A");
            }
            else {
                System.out.println("B");
            }
        }
    }
}
