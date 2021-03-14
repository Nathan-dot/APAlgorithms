package Arrays.CCC.CCC2016;

import java.util.Scanner;

public class J1_Tournament_Selection {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int countWins = 0;
        for(int i = 0; i < 6; i++) {
            if(a.nextLine().equals("W")) {
                countWins++;
            }
        }
        if(countWins > 4) {
            System.out.println(1);
        }
        else if(countWins > 2) {
            System.out.println(2);
        }
        else if(countWins > 0) {
            System.out.println(3);
        }
        else{
            System.out.println(-1);
        }
    }
}
