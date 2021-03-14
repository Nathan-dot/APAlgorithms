package Arrays.CCC.CCC2017;

import java.util.Scanner;

public class J4_2017 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int hour = 12;
        int minute = 0;
        long count = 0;
        long b = input.nextInt();
        for(long i = 0; i < b; i++){
            minute++;
            if(minute >= 60){
                minute = 0;
                hour++;
                hour = hour % 12;
            }
            String minuteZero = "";
            if(minute < 10){
                minuteZero = "0";
            }
            String time = hour + ":" + minuteZero + minute;
            if(check(time)){
                System.out.println(time);
                count++;
            }

        }
        System.out.println(count);
    }
    public static boolean check(String time){
        time = time.replaceAll(":", "");
        int[] digits = new int[time.length()];
        for(int i = 0; i < time.length(); i++){
            digits[i] = Integer.parseInt(String.valueOf(time.charAt(i)));
        }
        int firstDifference = digits[1] - digits[0];
        boolean isDifferent = false;
        for(int i = 1; i < digits.length - 1; i++){
            int newDifference = digits[i + 1] - digits[i];
            if(newDifference != firstDifference){
                isDifferent = true;
                break;
            }
        }
        return !isDifferent;
    }
}
