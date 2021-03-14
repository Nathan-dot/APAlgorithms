package leetcode;

import java.util.ArrayList;
import java.util.List;

public class letterCombination {
        String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        public List<String> letterCombinations(String digits) {
            List<String> a = new ArrayList<>();
            if (digits.length() == 0) {
                return a;
            }
            recursion("", digits, 0, a);
            return a;
        }
        private void recursion(String b, String c, int num, List<String> d){
            if (num == c.length()){
                d.add(b);
            }
            else{
                String a = this.letters[Integer.parseInt(c.substring(num,num+1))];
                for (int i = 0; i < a.length(); i++) {
                    recursion(b + a.substring(i,i+1), c, num + 1, d);
                }
            }
            return;
        }
}

