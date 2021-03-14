package leetcode;

import java.util.List;

public class countItms {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int a = 0;
        int count = 0;
        if(ruleKey.equals("color")) {
            a = 1;
        }
        else if(ruleKey.equals("name")) {
            a = 2;
        }
        for(int i = 0; i < items.size(); i++) {
            if(items.get(i).get(a).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
