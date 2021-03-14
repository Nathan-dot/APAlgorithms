package frq.cs2009;

import java.util.ArrayList;

public class NumberTile {
    private int a;
    private int b;
    private int c;
    private int d;
    private int[] arr = {a, b, c, d};

    public NumberTile(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void rotate() {
        arr[0] = d;
        arr[1] = a;
        arr[2] = b;
        arr[3] = c;
    }

    public int getLeft(int[] arr) {
        return arr[3];
    }

    public int getRight() {
        return arr[1];
    }
}
