package frq.cs2008;

public class AndChecker implements Checker {
    private Checker bChecker;
    private Checker cChecker;

    public AndChecker(Checker bChecker, Checker cChecker) {
        this.bChecker = bChecker;
        this.cChecker = cChecker;
    }

    @Override
    public boolean accept(String text) {
        boolean beetCheck = false;
        boolean carrotCheck = false;
        String[] a = text.split( " ");
        for(int i = 0; i < a.length; i++) {
            if(a[i].equals("beet")) {
                beetCheck = true;
            }
            if(a[i].equals("carrot")) {
                carrotCheck = true;
            }
        }
        return beetCheck && carrotCheck;
    }
}
