package Arrays.CCC.CCC2017;

import java.util.Scanner;

public class J1_2017 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = a.nextInt();
        if(b > 0 && c > 0) {
            System.out.println("1");
        }
        else if(b > 0 && c < 0) {
            System.out.println("4");
        }
        else if(b < 0 && c > 0) {
            System.out.println("2");
        }
        else{
            System.out.println("3");
        }
    }
}
