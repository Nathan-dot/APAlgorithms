package Arrays.CCC.CCC2014;

import java.util.Scanner;

public class J3_Double_Dice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int david_score = 100;
        int antonia_score = 100;
        for(int i = 0 ; i < a; i ++) {
            int b = input.nextInt();
            int c = input.nextInt();
            if(b > c)
                antonia_score -= b;
            else if (c > b)
                david_score -= c;
        }
        System.out.println(david_score);
        System.out.println(antonia_score);
    }
}
