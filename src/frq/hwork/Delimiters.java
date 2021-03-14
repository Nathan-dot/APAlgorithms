package frq.hwork;

import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> b = new ArrayList<String>();
        for(String a : tokens) {
            if(a.equals(openDel) || a.equals(closeDel)) {
                b.add(a);
            }
        }
        return b;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int openDelimiter = 0;
        int closeDelimiter = 0;
        for(int i = 0; i < delimiters.size()-1; i++) {
            if(delimiters.get(i).equals(openDel)) {
                openDelimiter++;
            }
            if(delimiters.get(i).equals(closeDel)) {
                closeDelimiter++;
            }
            if(closeDelimiter > openDelimiter) {
                return false;
            }
        }
        if(closeDelimiter == openDelimiter) {
            return true;
        }
        return false;
    }
}
