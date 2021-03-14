package frq.cs2008;

import java.util.ArrayList;

public class StringCoder {
    private String masterString;

    public StringCoder(String master) {
        masterString = master;
    }

    public String decodeString(ArrayList<StringPart> parts) {
        String obtained = "";
        for(StringPart a : parts) {
            int partStart = a.getStart();
            obtained += masterString.substring(partStart, partStart + a.getLength());
        }
        return obtained;
    }

    private StringPart findPart(String str) {
        int count = 0;
        ArrayList<String> a = new ArrayList<String>();
        for(int i = 0; i < masterString.length(); i++) {
            while(str.substring(i, i+count).equals(masterString.substring(i, i+count))) {
                count++;
            }
            a.add(masterString.substring(i, i+count));
            count = 0;
        }
        return null;
    }

    public ArrayList<StringPart> encodeString (String word) {
        ArrayList<StringPart> parts = new ArrayList<StringPart>();
        while(word.length() > 0) {
            StringPart a = findPart(word);
            parts.add(a);
            word = word.substring(a.getLength());
        }
        return parts;
    }
}
