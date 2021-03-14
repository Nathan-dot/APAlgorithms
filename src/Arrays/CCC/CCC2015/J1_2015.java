package Arrays.CCC.CCC2015;

import java.util.Scanner;

public class J1_2015 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int month = a.nextInt();
        int day = a.nextInt();

        if((month >= 2 && day > 18) || month >= 3){
            System.out.println("After");
        }else if((month == 2 && day < 18) || month < 2){
            System.out.println("Before");
        }else{
            System.out.println("Special");
        }
    }
}
