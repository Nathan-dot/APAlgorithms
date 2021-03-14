package frq;

public class FRQIterations {
    public static int mostFrequentElement(int[] arr) {
        int frequency = 1;
        int maxfrequency = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    frequency++;
                }
            }
            if(frequency > maxfrequency) {
                maxfrequency = frequency;
            }
            frequency = 0;
        }
        return maxfrequency;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3, 5, 1, 1, 1, 2, 3, 2, 2, 2, 1, 1, 1};
        System.out.println(mostFrequentElement(arr));
    }
}
