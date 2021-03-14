package frq.barrons;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WordSet {
    private ArrayList<String> a = new ArrayList<String>();
    public WordSet(ArrayList<String> a) {
        this.a = a;
    }

    public int size() {
        return a.size();
    }

    public void insert(String word) {
        if(!a.contains(word)) {
            a.add(word);
        }
    }

    public void remove(String word) {
        for(int i = 0; i < a.size()-1; i++) {
            if(a.get(i).equals(word)) {
                a.remove(i);
            }
        }
    }

    public String findkth(int k) {
        return null;
    }

    public boolean contains(String word) {
        for(int i = 0; i < a.size()-1; i++) {
            if(a.get(i).equals(word)) {
                return true;
            }
        }
        return false;
    }

    public static int countA(WordSet s) {
        int count = 0;
        for(int i = 0; i < s.size()-1; i++) {
            if(s.a.get(i).substring(0, 1).equals("A")) {
                count++;
            }
        }
        return count;
    }

    public static void removeA(WordSet s) {
        for(int i = 0; i < s.size()-1; i++) {
            if(s.a.get(i).substring(0, 1).equals("A")) {
                s.remove(s.a.get(i));
            }
        }
    }

    public static WordSet commonElements(WordSet s1, WordSet s2) {
        ArrayList<String> c = new ArrayList<String>();
        WordSet a = new WordSet(c);
        for(int i = 0; i < s1.size()-1; i++) {
            for(int j = 0; j < s2.size()-1; j++) {
                if(s1.a.get(i).equals(s2.a.get(j))) {
                    a.insert(s1.a.get(i));
                }
            }
        }
        return a;
    }
}
