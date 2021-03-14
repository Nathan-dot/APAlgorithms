package Arrays.CCC.CCC2016;
import java.util.Scanner;

public class J2_Magic_Squares {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        boolean f = true;
        String[] b = a.nextLine().split(" ");
        String[] c = a.nextLine().split(" ");
        String[] d = a.nextLine().split(" ");
        String[] e = a.nextLine().split(" ");
        int total = Integer.parseInt(b[0]) + Integer.parseInt(c[0]) + Integer.parseInt(d[0]) + Integer.parseInt(e[0]);
        String[][] array = {b, c, d, e};

        for(int i = 0; i < 4; i++) {
            if((Integer.parseInt(b[i]) + Integer.parseInt(c[i]) + Integer.parseInt(d[i]) + Integer.parseInt(e[i])) != total) {
                f = false;
                break;
            }
            int count = 0;
            for(String value : array[i]) {
                count += Integer.parseInt(value);
            }
            if(count != total) {
                f = false;
                break;
            }
        }
        if(f) {
            System.out.println("magic");
        }
        else {
            System.out.println("not magic");
        }
    }
}
