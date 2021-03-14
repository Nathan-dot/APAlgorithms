package CCC.C2014;

import java.util.Scanner;

public class J1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        if(first + second + third != 180) {
            System.out.println("Error");
        }
        else if(first != second && second != third && third != first) {
            System.out.println("Scalene");
        }
        else if(first == second && second == third) {
            System.out.println("Equilateral");
        }
        else{
            System.out.println("Isosceles");
        }
    }
}
