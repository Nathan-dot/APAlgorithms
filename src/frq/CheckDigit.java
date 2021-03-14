//package frq;
//
//public class CheckDigit {
//    public static int getCheck(int num) {
//        int length = 0;
//        int value = 1;
//        int sum = 0;
//        int multiply = 7;
//        while(value <= num) {
//            length++;
//            value *= 10;
//        }
//        //getNumberOfDigits(num)
//        for(int i = 0; i < length; i++) {
//            sum += (int) (num % (Math.pow(10, i))) * multiply;
//            multiply--;
//        }
//        return sum % 10;
//        // getDigit(sum, 6)
//    }
//
//    public static boolean isValid(int numWithCheckDigit) {
//        int checkDigit = numWithCheckDigit % 10;
//        int num = numWithCheckDigit/ 10;
//    }
//
//    public static int getNumberOfDigits(int num) {
//        int value = 1;
//        int length = 0;
//        while(value <= num) {
//            length++;
//            value *= 10;
//        }
//        return length;
//    }
//
//    public static int getDigit(int num, int n) {
//        return ((int) (num % (Math.pow(10, 7-n))));
//    }
//}
