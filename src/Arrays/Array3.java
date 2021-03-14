package Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }
    }
}
