package frq.cs2014;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(scrambleWord("ABRACADABRA"));
        List<String> wordList = new ArrayList<String>();
        wordList.add("TAN");
        wordList.add("ABRACADABRA");
        wordList.add("WHOA");
        wordList.add("APPLE");
        wordList.add("EGGS");
        scrambleOrRemove(wordList);
        System.out.println(wordList);

    }
    public static String scrambleWord(String word) {
        int i = 0;
        String result = "";
        while(i < word.length() - 1) {
            if(word.substring(i, i+1).equals("A") && !word.substring(i+1, i+2).equals("A")) {
                result += word.substring(i+1,i+2);
                result += "A";
                i += 2;
            } else {
                result += word.substring(i, i+1);
                i++;
            }
        }
        if(i < word.length()) {
            result += word.substring(i);
        }
        return result;
    }

    public static void scrambleOrRemove(List<String> wordList) {
        int i = 0;
        while(i < wordList.size()) {
            String word = wordList.get(i);
            String scrambled = scrambleWord(word);
            if(word.equals(scrambled)) {
                wordList.remove(i);
            } else {
                wordList.set(i, scrambled);
                i++;
            }
        }
    }
}
