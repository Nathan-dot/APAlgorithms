package frq.cs2004;

import java.util.ArrayList;

public class WordList {
    private ArrayList myList;

    public int numWordsOfLength(int len) {
        int count = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (((String) myList.get(i)).length() == len) {
                count++;
            }
        }
        return count;
    }

    public void removeWordsOfLength(int len) {
        for (int i = myList.size() - 1; i >= 0; i--) {
            if (((String) myList.get(i)).length() == len) {
                myList.remove(i);
            }
        }
    }
}
