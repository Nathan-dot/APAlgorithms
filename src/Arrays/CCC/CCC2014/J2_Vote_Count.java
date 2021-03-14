package Arrays.CCC.CCC2014;
import java.util.Scanner;

public class J2_Vote_Count {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        String c = a.next();
        int a_count = 0;
        int b_count = 0;
        for(int i = 0; i < c.length(); i++) {
            if(c.substring(i, i+1).equals("A")) {
                a_count++;
            }
            else{
                b_count++;
            }
        }
        if(a_count > b_count) {
            System.out.println("A");
        }
        else if(a_count < b_count) {
            System.out.println("B");
        }
        else {
            System.out.println("Tie");
        }
    }
}
