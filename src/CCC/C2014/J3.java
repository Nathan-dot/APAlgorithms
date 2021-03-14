package CCC.C2014;

import java.util.ArrayList;
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<String> rounds = new ArrayList<String>();

        for(int i = 0; i < n; i++) {
            rounds.add(in.nextLine());
        }
        int antonia = 100;
        int david = 100;
        for(String a : rounds) {
            int roll1 = Integer.parseInt(a.split(" ")[0]);
            int roll2 = Integer.parseInt(a.split(" ")[1]);
            if(roll1 == roll2) {
                continue;
            }
            if(roll1 < roll2) {
                antonia -= roll2;
            }
            else {
                david -= roll1;
            }
        }
        System.out.println(antonia);
        System.out.println(david);

    }
}
