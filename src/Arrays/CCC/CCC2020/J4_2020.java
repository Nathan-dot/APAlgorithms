package Arrays.CCC.CCC2020;

import java.util.Scanner;

public class J4_2020 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String phrase = a.nextLine();
        String cyclic = a.nextLine();
        String newstring = cyclic.substring(1) + cyclic.substring(0, 1);
        for(int i = 0; i < phrase.length(); i++) {
            if(phrase.contains(newstring)) {
                System.out.println("yes");
                System.exit(0);
            }
            newstring = newstring.substring(1) + newstring.substring(0, 1);
        }
        System.out.println("no");
    }
}
