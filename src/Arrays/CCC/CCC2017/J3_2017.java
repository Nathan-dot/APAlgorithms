package Arrays.CCC.CCC2017;

import java.util.Scanner;

public class J3_2017 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String[] b = a.nextLine().split(" ");
        String[] c = a.nextLine().split(" ");
        int charges = a.nextInt();
        int distance = Math.abs(Integer.parseInt(b[0]) - Integer.parseInt(c[0])) +
                Math.abs(Integer.parseInt(b[1]) - Integer.parseInt(c[1]));
        if((charges % 2  == distance % 2) && distance <= charges) {
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
    }
}
