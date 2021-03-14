package frq.cs2008;

public class SubstringChecker implements Checker {

    @Override
    public boolean accept(String text) {
        String[] a = text.split( " ");
        for(int i = 0; i < a.length; i++){
            if(a[i].equals("broccoli")) {
                return true;
            }
        }
        return false;
    }
}
