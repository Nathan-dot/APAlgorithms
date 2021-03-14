package Arrays.CCC.CCC2016;

import java.util.Scanner;
import java.util.Arrays;

public class S2_Tandem_Bicycle {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int question = b.nextInt();
        int n = b.nextInt();
        int[] d = new int[n];
        int[] c = new int[n];

        for(int i = 0; i < d.length; i++)
            d[i] = b.nextInt();
        for(int i = 0; i < c.length; i++)
            c[i] = b.nextInt();

        Arrays.sort(d);
        Arrays.sort(c);
        int e = 0;
        int[] f = new int[c.length];
        int placeholder = c.length;
        if(question == 1) {
            for(int i = 0; i < c.length; i++) {
                if(c[i] >= d[i]) {
                    e += c[i];
                }
                else{
                    e += d[i];
                }
            }
            System.out.println(e);
        }
        else{
            for(int i = 0; i < c.length; i++) {
                f[placeholder - 1] = c[i];
                placeholder--;
            }
            for(int i = 0; i < c.length; i++) {
                if(f[i] >= d[i]) {
                    e += f[i];
                }
                else {
                    e += d[i];
                }
            }
            System.out.println(e);
        }
    }
}
