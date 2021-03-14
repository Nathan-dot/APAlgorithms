package frq.cs2016;
import java.util.ArrayList;
public class RandomStringChooser {
    private ArrayList<String> count;
    public RandomStringChooser(String[] wordArray) {
        for(String word : wordArray) {
            count.add(word);
        }
    }
    public String getNext() {
        if(count.size() == 0) {
            return "NONE";
        }
        int index = (int) (Math.random() * count.size());
        return count.remove(index);
    }
}
