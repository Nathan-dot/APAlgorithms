package frq.cs2017solutions;

public class Phrase {
    private String currentPhrase;

    public Phrase(String p) {
        this.currentPhrase = p;
    }

    /**
     * Returns the index of the nth occurrence of str in the current phrase;
     * returns -1 if the nth occurrence does not exist.
     * @param str
     * @param n
     * @return
     */
    public int findNthOccurrence(String str, int n) {
        if (n <= 0) return -1;
        if (currentPhrase.length() < str.length()) {
            return -1;
        }
        int i = currentPhrase.indexOf(str);
        while (n --> 1 && i != -1) {
            i = currentPhrase.indexOf(str, i + 1);
        }
        return i;
    }

    public void replaceNthOccurrence(String str, int n, String repl) {
        int pos = findNthOccurrence(str, n);
        if (pos != -1) {
            currentPhrase = currentPhrase.substring(0, pos)
                    + repl + currentPhrase.substring(pos + str.length());
        }
    }

    /**
     * Returns the index of the last occurrence of str in the current phrase;
     * return -1 if str is not found.
     * @param str
     * @return
     */
    public int findLastOccurrence(String str) {
        int n = 1;
        while (findNthOccurrence(str, n + 1) != -1) {
            n++;
        }
        return findNthOccurrence(str, n); // 2
    }

    public String toString() {
        return currentPhrase;
    }
}
