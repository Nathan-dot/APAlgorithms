package apexam2020;

public class Secret {
    public static String newLetter(String letter, String rule) {
        int a = rule.indexOf(letter);
        if(a == rule.length() - 1) {
            a = 0;
            return rule.substring(a, a+1);
        }
        if(a == -1) {
            return letter;
        }
        else{
           return rule.substring(a+1, a+2);
        }
    }
}

// When declaring the String rule in the class, I would ensure that it is declared a
// private static String variable so that it can be used in the static method(as if it were an a normal
// instance variable without the keyword static, it would not be able to be used in the method).
// The logic of the newLetter() method and the rest of the Secret class
// would be kept the same.

// (Also when trying to run the newLetter() method, I would ensure that I use the
// format: Secret.newLetter(String letter, String rule))