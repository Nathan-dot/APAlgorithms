package frq.cs2015;

public class Driver {
    public static void main(String[] args) {
        HiddenWord a = new HiddenWord("HARPS");
        System.out.println(a.getHint("AAAAA"));
        System.out.println(a.getHint("HELLO"));
        System.out.println(a.getHint("HEART"));
        System.out.println(a.getHint("HARMS"));
        System.out.println(a.getHint("HARPS"));
    }
}
