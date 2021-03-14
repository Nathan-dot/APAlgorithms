package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class leafValues {
    public int mctFromLeafValues(int[] arr) {
        // Convert array to list
        List<Integer> list = new ArrayList<Integer>(arr.length);
        for (int i : arr) {
            list.add(i);
        }
        int result = 0;
        while(list.size() != 1 ) {
            int index = minIndex(list);
            if (index == 0) {
                // First element in the list, take right neighbour
                result = result + list.get(index) * list.get(index + 1);
            }
            else if (index == list.size() - 1) {
                // Last element in the list, take left neighbour
                result = result + list.get(index) * list.get(index - 1);
            }
            else {
                // In the middle take the smallest
                if (list.get(index + 1) > list.get(index - 1)) {
                    result = result + list.get(index) * list.get(index - 1);
                }
                else {
                    result = result + list.get(index) * list.get(index + 1);
                }
            }
            // remove the smallest and keep the largest.
            list.remove(index);
        }
        return result;
    }
    // index of minimum element.
    public int minIndex(List<Integer> list){
        int minIndex = 0;
        int minimum = list.get(0);
        for(int i = 0; i < list.size(); i++){
            if (list.get(i) < minimum){
                minIndex = i;
                minimum = list.get(i);
            }
        }
        return minIndex;
    }
}

