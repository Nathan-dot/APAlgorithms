package Arrays.CCC.CCC2015;

import java.util.Scanner;

public class J4_2015 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int m = a.nextInt();
        a.nextLine();
        int[] b = new int[100];
        int c = 0;

        for(int i = 0; i < m; i++){
            String d = a.nextLine();
            char e = d.split(" ")[0].charAt(0);
            int number = Integer.parseInt(d.split(" ")[1]);
            if(e == 'W'){
                c += number - 1;
            }
            else{
                c++;
                if(e == 'R'){
                    b[number - 1] -= c;
                }
                else{
                    b[number - 1] += c;
                }
            }
        }

        for(int i = 0; i < b.length; i++){
            if(b[i] > 0) {
                System.out.println(i + 1 + " " + b[i]);
            }
            else if(b[i] < 0) {
                System.out.println(i + 1 + " " + "-1");
            }
        }
    }
}
