package leetcode;

public class arraysEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "";
        String b = "";
        for(String i : word1) {
            a += i;
        }
        for(String i : word2) {
            b += i;
        }
        if(a.equals(b)) {
            return true;
        }
        return false;
    }
}
