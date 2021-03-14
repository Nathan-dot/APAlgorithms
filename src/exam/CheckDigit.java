package exam;

//public class CheckDigit {
//	public static int getCheck(int num) {
//		int numDigits = getNumberOfDigits(num);
//		int result = 0;
//		for (int i = 1; i <= numDigits; i++) {
//			result += getDigit(num, i) * (8 - i);
//		}
//		return result;
//	}
//	public static boolean int isValid(int numWithCheckDigit) {
//		return numWithCheckDigit % 10 == getCheck(numWithCheckDigit / 10);
//	}
//	public static int getNumberOfDigits(int num) {
//		int count = 0;
//		while (num != 0) {
//			num /= 10;
//			count++;
//		}
//		return count;
//		// return String.valueOf(num).length();
//	}
//	public static int getDigit(int num, int n) {
//		int numTimesToDivide = getNumberOfDigits(num) - n;
//		while (numTimesToDivide > 0) {
//			num /= 10;
//			numTimesToDivide--;
//		}
//		return num % 10;
//		// return Integer.parseInt(String.valueOf(num).substring(n - 1, n));
//	}
//}
// public static boolean isValid(int numWithCheckDigit) {}
// I could add a count variable in the constructor for CheckDigit and then increment that count by 1
// every time before isValid return false.
// I would initialize an private static variable to 0.
// i.e. private static int count (below the class header)


