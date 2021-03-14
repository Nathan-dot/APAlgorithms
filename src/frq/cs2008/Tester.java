package frq.cs2008;
import java.util.Arrays;
public class Tester {
    public static void main(String[] args) {
        Checker broccoliChecker = new SubstringChecker();
        System.out.println(broccoliChecker.accept("Broccoli Bonanza"));
        String a = "I like broccoli";
        System.out.println(Arrays.toString(a.split(" ")));
        String[] b = a.split(" ");
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}


