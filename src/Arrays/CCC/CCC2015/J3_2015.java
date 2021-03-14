package Arrays.CCC.CCC2015;

import java.util.Scanner;

public class J3_2015 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
        char[] chars = b.toCharArray();
        char[] alphabet = "bcdfghjklmnpqrstvwxyz".toCharArray();
        String c = null;

        for(int i = 0; i < chars.length; i++){
            if(chars[i] != 'a' || chars[i] != 'e' || chars[i] != 'i'|| chars[i] != 'o'|| chars[i] != 'u' ){
                char nearestVowel = nearestVowel(chars[i]);
                char consonants = 0;
                boolean d = false;
                int count = 0;

                while(!d){
                    System.out.println(chars[i]);
                    System.out.println(count);

                    if(chars[i] == alphabet[count]){
                        d = true;
                        consonants = alphabet[count + 1];
                    }
                    else{
                        count++;
                    }
                }
                c = c + chars[i] + nearestVowel + consonants;
            }else{
                c = c + chars[i];
            }
        }
        System.out.println(c);

    }
    public static char nearestVowel(char a){
        if(a == 'b' || a == 'c'){
            return 'a';
        }
        else if(a == 'd' || a == 'f'|| a == 'g'){
            return 'e';
        }
        else if(a == 'h'|| a == 'j'|| a == 'k'|| a == 'l'){
            return  'i';
        }
        else if(a == 'm'|| a == 'n'|| a == 'p' || a == 'q'|| a == 'r'){
            return 'o';
        }
        else if(a == 's'|| a == 't'|| a == 'v'|| a == 'w'|| a == 'x'|| a == 'y'|| a == 'z'){
            return 'u';
        }
        else{
            return 'E';
        }
    }
}
