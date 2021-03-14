package frq.cs2010;

public class APLine {
    private int a;
    private int b;
    private int c;

    public APLine(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getSlope(int a, int b) {
        return (-1 * a) / (b);
    }

    public boolean isOnLine(int x, int y) {
        if((a * x) + (b * y) + c == 0) {
            return true;
        }
        return false;
    }
}
