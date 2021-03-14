package Arrays.CCC.CCC2016;
import java.util.Scanner;

public class J3_Hidden_Palindrome {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String palindrome = a.nextLine();
        int count = 1;

        for(int i = 0; i < palindrome.length(); i++) {
            String compare = "";
            String reversed = "";
            for(int j = 0; j < palindrome.length() - i; j++) {
                compare += palindrome.charAt(i + j);
                reversed = palindrome.charAt(i + j) + reversed;
                if(compare.equals(reversed)) {
                    if(compare.length() > count) {
                        count = compare.length();
                    }
                }
            }
        }
        System.out.println(count);
    }
}
