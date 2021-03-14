package Arrays.CCC.CCC2019;

import java.util.Scanner;

public class J1_winning_score {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int apples_threes = a.nextInt();
        int apples_twos = a.nextInt();
        int apples_ones = a.nextInt();
        int banana_threes = a.nextInt();
        int banana_twos = a.nextInt();
        int banana_ones = a.nextInt();
        if((apples_threes*3 + apples_twos*2 + apples_ones) > (banana_threes*3 + banana_twos*2 + banana_ones)) {
            System.out.println("A");
        }
        else if((banana_threes*3 + banana_twos*2 + banana_ones) > (apples_threes*3 + apples_twos*2 + apples_ones)) {
            System.out.println("B");
        }
        else{
            System.out.println("T");
        }

    }
}
