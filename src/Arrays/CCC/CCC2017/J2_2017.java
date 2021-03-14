package Arrays.CCC.CCC2017;

import java.util.Scanner;

public class J2_2017 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int number = a.nextInt();
        int c = number;
        int shifts = a.nextInt();
        for(int i = 0; i < shifts; i++) {
            number = number * 10;
            c += number;
        }
        System.out.println(c);
    }
}
