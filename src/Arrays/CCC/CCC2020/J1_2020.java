package Arrays.CCC.CCC2020;
import java.util.Scanner;

public class J1_2020 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int small_treats = a.nextInt();
        int medium_treats = a.nextInt();
        int large_treats = a.nextInt();
        if((small_treats) + (2 * medium_treats) + (3 * large_treats) >= 10) {
            System.out.println("happy");
        }
        else{
            System.out.println("sad");
        }

    }
}
