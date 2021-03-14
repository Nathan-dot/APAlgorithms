package Arrays;
import java.util.Scanner;
public class Array5 {
    public static void main(String[] args) {
        int[] array = new int[6];
        Scanner input = new Scanner(System.in);
        System.out.println("Name (first last):");
        String name = input.nextLine();
        System.out.println("Filename:");
        String filename = input.nextLine();
        for(int i = 1; i < 6; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        for(int i = 1; i < 6; i++) {
            System.out.println("Grade " + i + ": " + array[i]);
        }
    }
}
