package leetcode;

public class splitString {
    public static void main(String[] args) {
        String a = "RLRRRLLRLL";
        System.out.println(balancedStringSplit(a));
    }

    public static int balancedStringSplit(String s) {
        int r = 0;
        int l = 0;
        int output = 0;
        for(int i = 0; i < s.toCharArray().length; i++) {
            // RLRRLLRLRL - 4
            // RLLLLRRRLR - 3
            // LLLLRRRR - 1
            // RLRRRLLRLL - 2
            if(s.toCharArray()[i] == 'R') {
                r++;
            }
            if(s.toCharArray()[i] == 'L') {
                l++;
            }
            if(r == l) {
                output++;
            }
        }
        return output;
    }
}
