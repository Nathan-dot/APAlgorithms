package Arrays.CCC.CCC2018;

import java.util.ArrayList;
import java.util.Scanner;

public class J2_occupy_parking {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        ArrayList<Integer> e = new ArrayList<>();
        int b = a.nextInt();
        String c = a.next();
        String d = a.next();
        for(int i = 0 ; i < b; i++) {
            if(c.substring(i, i+1).equals("C")) {
                e.add(i);
            }
        }
        int count = 0;
        for(int j = 0; j < e.size(); j++) {
            if(d.charAt(e.get(j)) == 'C') {
                count++;
            }
        }
        System.out.println(count);
    }
}
