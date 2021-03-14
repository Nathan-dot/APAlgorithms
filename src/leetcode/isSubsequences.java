package leetcode;

public class isSubsequences {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }
    public static boolean isSubsequence(String s, String t) {
        int b = 0;
        for(int i = 0; i < s.length(); i++) {
            int a = t.indexOf(s.charAt(i), b);
            if(a == -1) {
                return false;
            }
            else {
                b = a + 1;
            }
        }
        return true;
    }
}
