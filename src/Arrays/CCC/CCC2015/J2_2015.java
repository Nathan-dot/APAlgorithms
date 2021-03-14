package Arrays.CCC.CCC2015;

import java.util.Scanner;

public class J2_2015 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
        int originalLength = b.length();
        int happyCount = (originalLength - b.replaceAll(":-\\)", "").length()) / 3;
        int sadCount = (originalLength - b.replaceAll(":-\\(", "").length()) / 3;

        if((happyCount == sadCount) && (happyCount == 0)){
            System.out.println("none");
        }
        else if(happyCount > sadCount){
            System.out.println("happy");
        }
        else{
            System.out.println("sad");
        }
    }
}
