package frq.cs2016;
import java.util.List;

public class StringFormatter {
    public static int totalLetters(List<String> wordList) {
        int letters = 0;
        for(String word : wordList) {
            letters += word.length();
        }
        return letters;
    }

    public static int basicGapWidth(List<String> wordList, int formattedLen) {
        int gaps = wordList.size() - 1;
        int spaces = formattedLen - totalLetters(wordList);
        return spaces/gaps;
    }


}
