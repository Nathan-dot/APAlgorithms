package frq.hwork2;

public class CodeWordChecker {
    private int interval1;
    private int interval2;
    private String notAllowed;

    public CodeWordChecker(int interval1, int interval2, String notAllowed) {
        this.interval1 = interval1;
        this.interval2 = interval2;
        this.notAllowed = notAllowed;
    }

    public boolean valid(String code) {
        if(code.length() <= interval2 && code.length() >= interval1 && !toString().contains(notAllowed)) {
            return true;
        }
        return false;
    }
}
