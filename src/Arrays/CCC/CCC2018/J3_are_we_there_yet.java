package Arrays.CCC.CCC2018;

import java.util.Scanner;

public class J3_are_we_there_yet {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int[] cities = new int[5];
        for(int i = 0; i < cities.length; i++) {
            if(i == 0) {
                cities[i] = 0;
            }
            else {
                cities[i] = a.nextInt();
            }
        }
        for(int i = 0; i < cities.length; i++) {
            if(i == 0) {
                cities[i] = 0;
            }
            else {
                cities[i] += cities[i - 1];
            }
        }

        for(int i = 0; i < 5; i++){
            System.out.print(Math.abs(cities[i] - cities[0]) + " ");
            System.out.print(Math.abs(cities[i] - cities[1]) + " ");
            System.out.print(Math.abs(cities[i] - cities[2]) + " ");
            System.out.print(Math.abs(cities[i] - cities[3]) + " ");
            System.out.print(Math.abs(cities[i] - cities[4]) + "\n");
        }
    }
}
