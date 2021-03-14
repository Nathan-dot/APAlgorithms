package frq.barrons;

import java.util.ArrayList;
import java.util.List;

public class FormLetter {
    private List<String> lines;

    private List<Customer> customers;

    public List<String> makeCopy() {
        List<String> newLines = new ArrayList<String>();
        for(String line: lines) {
            newLines.add(line);
        }
        return newLines;
    }

    public String replaceAll(String line, String sub, String repl) {
        String a[] = line.split(" ");
        String b = "";
        for(int i = 0; i < a.length -1; i++) {
            if(a[i].equals(sub)) {
                a[i] = repl;
            }
        }
        for(int i = 0; i < a.length-1; i++) {
            b = b.concat(a[i]);
        }
        return b;
    }

    public void writeLetter(List<String> customerLines) {

    }

    public void createPersonalizedLetters() {
        for(int i = 0; i < customers.size(); i++) {
            List<String> a = makeCopy();
            for(int j = 0; j < makeCopy().size(); j++) {
                replaceAll(a.get(j), "@", customers.get(i).getName());
                replaceAll(a.get(j), "&", customers.get(i).getCity());
                replaceAll(a.get(j), "$", customers.get(i).getState());
            }

            writeLetter(a);
        }
    }
}
