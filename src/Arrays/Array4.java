package Arrays;

public class Array4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] copy = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        for(int i = 0; i < copy.length; i++) {
            copy[i] = array[i];
            array[copy.length-1] = -7;
        }

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for(int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
