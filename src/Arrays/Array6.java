package Arrays;


import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()* 50);
        }

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        Scanner input = new Scanner(System.in);
        System.out.println("\nValue to find: ");
        int value = input.nextInt();
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                System.out.println(value + " is in the array.");
            }
        }
     }
}
