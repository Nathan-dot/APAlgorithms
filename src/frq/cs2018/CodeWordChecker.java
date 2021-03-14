package frq.cs2018;

public class CodeWordChecker {
    private int min;
    private int max;
    private String notAllowed;

    public CodeWordChecker(int min, int max, String notAllowed) {
        this.min = min;
        this.max = max;
        this.notAllowed = notAllowed;
    }

    public CodeWordChecker(String notAllowed) {
        this.notAllowed = notAllowed;
    }

    public boolean valid(String code) {
        if(code.length() <= max && code.length() >= min &&!toString().contains(notAllowed)) {
                return true;
            }
        return false;
        }
}

