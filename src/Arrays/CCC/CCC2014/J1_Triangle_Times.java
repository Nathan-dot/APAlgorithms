package Arrays.CCC.CCC2014;
import java.util.Scanner;

public class J1_Triangle_Times {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int angle1 = a.nextInt();
        int angle2 = a.nextInt();
        int angle3 = a.nextInt();
        if(angle1 + angle2 + angle3 == 180) {
            if(angle1 == angle2 && angle1 == angle3 && angle2 == angle3) {
                System.out.println("Equilateral");
            }
            else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
                System.out.println("Isosceles");
            }
            else{
                System.out.println("Scalene");
            }
        }
        else{
            System.out.println("Error");
        }
    }
}
