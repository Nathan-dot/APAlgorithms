package leetcode;

import java.util.Scanner;

public class longestPalindrome {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String s = a.nextLine();
        System.out.println(palindrome(s));

    }
    public static String palindrome(String s) {
        if(s == null || s.length() == 0) {
            return s;
        }
        int n = s.length();
        boolean [][] dp = new boolean[n][n];
        int max = 0;
        String ans = "";
        for(int j = 0; j < n; j++) {
           for(int i = 0; i <= j; i++)  {
               if(j - i > 2) {
                   dp[i][j] = dp[i+1][j-1] && (s.charAt(i) == s.charAt(j));
               }
               else {
                   dp[i][j] = (s.charAt(i) == s.charAt(j));
               }
               int len = j - i + 1;
               if(dp[i][j] && len > max) {
                   max = len;
                   ans = s.substring(i, j + 1);
               }
           }
        }
        return ans;
    }

    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (chars[i] != chars[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
