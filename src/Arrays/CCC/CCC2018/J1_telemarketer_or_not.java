package Arrays.CCC.CCC2018;

import java.util.Scanner;

public class J1_telemarketer_or_not {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String b = a.next();
        String c = a.next();
        String d = a.next();
        String e = a.next();

        if(b.equals("8") || b.equals("9")) {
            if(e.equals("8") || e.equals("9")) {
                if(c.equals(d)) {
                    System.out.println("Ignore");
                }
            }
        }
        else{
            System.out.println("Answer");
        }
    }
}
