package Arrays.CCC.CCC2018;

import java.util.Scanner;

public class J4_flipper {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        Scanner b = new Scanner(System.in);
        String flip_orders = b.next();
        boolean vertical_flip = false;
        boolean horizontal_flip = false;
        int horizontal_count = 0;
        for(int i = 0; i < flip_orders.length(); i++) {
            if(flip_orders.substring(i, i+1).equals("H")) {
                horizontal_count++;
            }
        }
        int vertical_count = flip_orders.length() - horizontal_count;
        if(vertical_count % 2 == 0) {
            vertical_flip = true;
        }
        if(horizontal_count % 2 == 0) {
            horizontal_flip = true;
        }
        if(!vertical_flip & !horizontal_flip) {
            System.out.println(4 + " " + 3);
            System.out.println(2 + " " + 1);
        }
        else if(!vertical_flip) {
            System.out.println(2 + " " + 1);
            System.out.println(4 + " " + 3);
        }
        else if(!horizontal_flip) {
            System.out.println(3 + " " + 4);
            System.out.println(1 + " " + 2);
        }
        else {
            System.out.println(1 + " " + 2);
            System.out.println(3 + " " + 4);
        }
    }
}
