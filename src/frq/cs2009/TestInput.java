package frq.cs2009;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestInput {
    public static void main(String[] args) {
//        List<Integer> lst = new ArrayList<Integer>();
//        int k = 2;
//        while(lst.size() < 5) {
//            boolean found = false;
//            for(Integer n : lst) {
//                if (k % n.intValue() == 0) {
//                    found = true;
//                }
//                if (!found) {
//                    lst.add(new Integer(k));
//                    k++;
//                }
//            }
//        }
//        System.out.println(lst);
//
////        int[] a = {0, 1};
////        int[] b = a;
////        a[0] = 1;
////        System.out.println(Arrays.toString(a));
////        System.out.println(Arrays.toString(b));
////        b[0] = 2;
////        System.out.println(Arrays.toString(a));
////        System.out.println(Arrays.toString(b));
////        System.out.println(a[0]);
////        System.out.println(a[0] + b[0] + a[1] + b[1]);
//
//          int[][] m = {{2, 4, 6, 8}, {3, 2, 1, 5}};
//          int numRows = m.length;
//          int numCols = m[0].length;
////          for(int k = 0; k < numRows; k++) {
////              m[k][0] = 0;
////              m[k][numCols-1] = 0;
////          }
////          for(int k = 0; k < numCols; k++) {
////              m[0][k] = 0;
////              m[numRows-1][k] = 0;
////          }
////        System.out.println(Arrays.toString(m[0]));
////        System.out.println(Arrays.toString(m[1]));
////        for(int k = 0; k < numRows - 1; k++) {
////            m[k][0] = 0;
////            m[numRows - k - 1][numCols - 1] = 0;
////        }
////        for(int k = 0; k < numCols - 1; k++) {
////            m[0][numCols - k - 1] = 0;
////            m[numRows - 1][k] = 0;
////        }
////        System.out.println(Arrays.toString(m[0]));
////        System.out.println(Arrays.toString(m[1]));
////        for(int k = 0; k < numCols; k++) {
////            m[0][k] = 0;
////            m[numRows - 1][k] = 0;
////        }
////        for(int[] r : m) {
////            r[0] = 0;
////            r[numCols-1] = 0;
////        }
////        System.out.println(Arrays.toString(m[0]));
////        System.out.println(Arrays.toString(m[1]));
////        int a = 3;
////        int b = 2;
////        int c = 4;
////        int d;
////        int temp = b / a;
////        d = c * temp;
////        System.out.println(d);
////        int[] arr = {2, 1, 3, 4, 5};
////        int n = 5;
////        int sum = 0;
////        for(int i = 0; i < n; i++) {
////            if(arr[i] > 0 && arr[i] % 2 != 0) {
////                sum += arr[i];
////                System.out.println(arr[i]);
////            }
////        }
////        Question a = new Question();
////        a.flip(a);
////        A obj = new B();
////        int x = 0;
////        int y = 3;
////        if((x <= y) || (y > 0)) {
////            System.out.println("works");
//////        }
////        double amt = 5.3;
////        System.out.println((int) (amt * 100 + 0.5) % 100);
////        int sum = 0;
////        int d = -1;
////        for(int count = 10; count > 0; count--) {
////            sum += d;
////            if(d > 0) {
////                d++;
////            }
////            else{
////                d--;
////            }
////            d = -d;
////        }
////        System.out.println(sum);
//////        System.out.println(0x10 + 10);
////        int count = 0, sum = 0;
////        while (count < 20) {
////            sum += count;
////        }
////        System.out.println(sum);
////        Integer n = new Integer(Integer.MIN_VALUE);
////        Double x = new Double(n.intValue());
//////        System.out.println(x);
////        String str1 = "hi";
////        String str2 = "hi";
////        if(str1.compareTo(str2) == 0) {
////            System.out.println(true);
////        int a = 12;
////        int b = 15;
////        int d = a;
////        int count = 0;
////        if(b < d) {
////            d = b;
////        }
////        while(a % d != 0 || b % d != 0) {
////            count++;
////            d--;
////        }
////        System.out.println(d);
////        System.out.println(count);
////        Sphere a = new Sphere();
////        a.volume(3);
////        String[] a = {"A", "B"};
////        String[] b = a;
////        String[] c = {a[0], a[1]};
////        String letter = a[0]; a[0] = a[1]; a[1] = letter;
////        System.out.println(a[0] + a[1] + b[0] + b[1] + c[0] + c[1]);
////        int[] a = {3};
////        int[] b = {4};
////        int t =a[0];
////        a[0]=b[0];
////        a[0] = t;
////        System.out.println(a[0]);
////        System.out.println(b[0]);
////
//        // Casting higher priority than multiplication/division
//        //i.e. (double)q/2
          String a = "hi";
          String b = "hiadsz";
        System.out.println(b.indexOf(a));


    }
}
