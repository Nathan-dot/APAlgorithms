package frq.cs2008;

public class NotChecker implements Checker {
    private Checker a;
    private Checker b;
    public NotChecker(Checker a, Checker b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean accept(String text) {
        String a[] = text.split(" ");
        for(int i = 0; i < a.length; i++) {
            if(a[i].equals("artichokes") || a[i].equals("kale")) {
                return false;
            }
        }
        return true;
    }
}
