package frq.cs2009;

import java.util.ArrayList;

public class findLocation {
    public int findLocation(ArrayList<String> a, String target) {
        int first = 0, last = a.size()-1;
        while(first <= last) {
            int middle = (first + last) / 2;
            int compResult = target.compareTo(a.get(middle));
            if(compResult == 0) {
                return middle;
            }
            if(compResult < 0) {
                last = middle - 1;
            }
            else{
                first = middle + 1;
            }
        }
        return -1;
    }
}
