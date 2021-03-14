//package exam;
//
//public class WordScrambler {
//    private String[] scrambledWords;
//    public WordScrambler(String[] wordArr) {
//        scrambledWords = mixedWords(wordArr);
//    }
//
//    private String recombine(String word1, String word2) {
//        String result = "";
//        result = word1.substring(0, (word1.length()/2)) + word2.substring(word2.length()/2);
//        return result;
//    }
//    private boolean checkValidLength(String word1, String word2) {
//        if(recombine(word1, word2).length() < word1.length() || recombine(word1, word2).length() < word2.length()) {
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//
//    // private boolean checkValidLength(String word1, String word2) {}
//    // the method would use the recombine method using the word1 and word2 strings as parameters. It would return
//    // a combined version of the string, then compare this combined version's length with the length of word1 and word2.
//    // The length would be checked using the .length property of the String type and if word1 or word2 had a shorter length
//    // than the created word, the method would return false while if word1/word2 has a longer length than the generated
//    // string, the method would return true as the string is "valid"
//
//    // I would call the recombine(String word1, String word2) method from the WordScrambler class and take String
//    // parameters of word1 and word2, which would be used to compare lengths with the combined word.
//
//    // In checkValidLength, there would be no local variables required as the method recombine provides the combined
//    string's length while the combined strings are taken as parameters. The method now merely has to compare lengths
//    and return true or false accordingly.
//}
