package frq.hwork2;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        for(int i = 0; i < words.length-1;i++) {
            for(int j = i+1; j < words.length; j++) {
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }

    public int numMatches() {
        int count = 0;
        for(int i = 0; i < allPairs.size() - 2; i++) {
            if(allPairs.get(i).equals(allPairs.get(i+1))) {
                count++;
            }
        }
        return count;
    }
}
