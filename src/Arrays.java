public class Arrays {
    //forloops and whileloops
    public static void main(String[] args) {
        //forloops
        int j = 5;
        boolean a = true;
        for(int i = 0; i < 10; i++) {
        //i++ - "increments" the number, so it increases it by 1
            // break - when you want to exit loop early
            // if and else statements
            // if statements will always get checked
            //
            if(i < 6) {
                a = false;
            }
            else if(i == 8) {
                a = true;
            }
            else{
                a = false;
            }
        }
        while(j < 10) {
            // 9 < 10 - this is always true
            j++;
        }
    }
}
