package Arrays.CCC.CCC2021;

import java.util.Scanner;

public class lunchConcert {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int[][] cost = new int[b][];
        if(b == 1) {
            a.next();
            String[] d = a.nextLine().split(" ");
            System.out.println(d[0]);
            System.exit(1);
        }
        int slowest = 0;
        int index = 0;
        for(int i = 0; i < b; i++) {
            for(int j = 0; j < 3; j++) {
                a.next();
               cost[i][j] = Integer.parseInt((a.nextLine().split(" ")[j]));
            }
        }
        for(int i = 0; i < b; i++) {
            //checking each distance and comparing
            if(slowest < cost[i][1]) {
                slowest = cost[i][1];
                index = i;
            }
        }
        int distance = 0;
        int sum1 = 0;
        int min = 0;
        for(int i = 0; i < 10; i++) {
            distance = cost[index][0] + i;
            sum1 += (Math.abs(distance - cost[index][0])) * cost[index][1];
            if(sum1 < min) {
                min = sum1;
                System.out.println(min);
            }
        }

    }

}
