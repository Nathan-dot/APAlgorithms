package Arrays.CCC.CCC2021;

import java.text.DecimalFormat;
import java.util.Scanner;

public class crazyFencing {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        a.nextLine();
        String c = a.nextLine();
        String e = a.nextLine();
        System.out.println(fenceArea(b, c, e));
    }
    public static String fenceArea(int b, String c, String e) {
        String[] d = c.split(" ");
        String[] f = e.split(" ");
        double sum = 0;

        for(int i = 0; i < b; i++) {
            // width * (right height + left height)/2
            sum +=  Double.parseDouble(f[i]) * ((Double.parseDouble(d[i]) + Double.parseDouble(d[i+1]))/2);
        }
        DecimalFormat format = new DecimalFormat("0.#");
        return format.format(sum);
    }
}
