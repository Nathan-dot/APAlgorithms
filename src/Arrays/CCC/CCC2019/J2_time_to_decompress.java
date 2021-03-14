package Arrays.CCC.CCC2019;
import java.util.ArrayList;
import java.util.Scanner;
public class J2_time_to_decompress {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int lines = a.nextInt();
        int k = 0;
        ArrayList<String> b = new ArrayList<String>();
        for(int i = 0; i < lines; i++) {
            int number = a.nextInt();
            String symbol = a.next();
            String symbolinitial = symbol;
            for(int j = 0; j < number - 1; j++) {
                symbol = symbol.concat(symbolinitial);
            }
            b.add(symbol);
        }
        while(k < lines) {
            System.out.println(b.get(k));
            k++;
        }
    }
}
