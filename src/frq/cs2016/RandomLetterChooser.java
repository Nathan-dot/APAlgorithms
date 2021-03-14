package frq.cs2016;

public class RandomLetterChooser extends RandomStringChooser{
    public RandomLetterChooser(String str){
        super(getSingleLetters(str));
    }

    public static String[] getSingleLetters(String str){
        String[] str1 = new String[str.length()];
        for(int i = 0; i < str.length(); i++) {
            str1[i] = str.substring(i, i+1);
        }
        return str1;
    }
}
