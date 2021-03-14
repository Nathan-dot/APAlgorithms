package exam;

public class Hailstone {

    public static int hailstoneLength(int n) {
        int length = 0;
        while(n != 1) {
            if(n % 2 == 0) {
                n = n/2;
            }
            else{
                n = 3*n + 1;
            }
            length++;
        }
        return length + 1;
    }

    public static boolean isLongSeq(int n) {
        if(hailstoneLength(n) > n) {
            return true;
        }
        return false;
    }

   // public static double propLong(int n) {}
    // hailstoneLength(int n) and isLongSeq(int n) would be useful methods in the Hailstone class

    // these two methods would be used to determine the number of long  hailstone sequences
    // the precise number could be found by creating a variable: private int longNumbers and private int shortNumbers
    // in the isLongSeq(int n) method, before returning true, the longNumbers variable would be incremented and before
    // returning true, the shortNumbers variable would be incremented.

    // The isLongSeq(int n) would also be run multiple times through a forloop to ensure that every number in the sequence
    // is either identified as a longNumber or shortNumber. By using these two variables, the propLong method would
    // determine the ratio by dividing longNumber by the total amount of numbers(longNumber + shortNumber)
    // propLong would divide the two numbers and downcast? it to the double type and then return the double value found
}
