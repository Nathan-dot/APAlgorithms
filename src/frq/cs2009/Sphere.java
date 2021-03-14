package frq.cs2009;

public class Sphere {
    public static final double PI = 3.14159;
    public static double volume(int r) {
        System.out.println(4 / 3 * PI * Math.pow(r, 3));
        return 4 / 3 * PI * Math.pow(r, 3);
    }
}
