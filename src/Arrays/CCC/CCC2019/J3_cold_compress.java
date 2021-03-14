package Arrays.CCC.CCC2019;
import java.util.ArrayList;
import java.util.Scanner;

public class J3_cold_compress {
    public static void main(String[] args) {
        ArrayList<String> d = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0) {
            String s = sc.next();
            int i = 0;
            for(i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int count = 0;
                while(i < s.length()) {
                    if(s.charAt(i) != c) {
                        i--;
                        break;
                    }
                    i++;
                    count++;
                }
                System.out.print(count + " " + c + " ");
            }
            System.out.println();
        }
    }
}
