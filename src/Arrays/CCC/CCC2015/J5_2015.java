package Arrays.CCC.CCC2015;

import java.util.Scanner;

public class J5_2015 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int k = a.nextInt();
        int[] c = new int[k];
        for(int i = 0; i < c.length - 1; i++) {
            c[i] = 1;
            c[c.length - 1] = k - c[i];
        }
        int[] d = new int[k];
        int count = 0;
        d[c.length - 1] = c[c.length - 1] - n/k;
        for(int i = 0; i < n/k; i++){
            d[i] = n/k;
            count++;
        }
        System.out.println(count + 2);

    }
}
