package frq.cs2017;

public class Phrase {
    private String currentPhrase;
    public Phrase(String p) {
        currentPhrase = p;
    }
    public int findNthOccurrence(String str, int n) {
        int count = 0;
        int index;
        for(int i = 0; i < str.length(); i++) {
            if(str.length() > currentPhrase.length()) {
                return -1;
            }
            else{
                if(currentPhrase.substring(i, i + str.length()-1).equals(str)){
                    count++;
                    if(count == n) {
                        index = i;
                        return index;
                    }
                }
            }

        }
        return -1;
    }
    public void replaceNthOccurrence(String str, int n, String repl) {
        int index = findNthOccurrence(str, n);
        if(index != -1) {
            currentPhrase = currentPhrase.substring(0, index) + repl + currentPhrase.substring(index + str.length());
        }
    }
    public int findLastOccurrence(String str) {
        int n = 0;
        while(findNthOccurrence(str, n) != -1) {
            n++;
        }
        return findNthOccurrence(str, n);
    }
}
