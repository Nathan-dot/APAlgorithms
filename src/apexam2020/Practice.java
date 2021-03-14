package apexam2020;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
    private int a;

    public Practice() {
        this.a = 3;
    }

    public String random() {
        if(a == 2){
            return "correct";
        }
        else if(a == 4) {
            return "wrong";
        }
        else {
            return null;
        }
    }
    public static void main(String[] args) {
        System.out.println("What is your number?");
        Scanner a = new Scanner(System.in);
        int number = a.nextInt();
        System.out.println("here is your number: " + number);
        // Hello World -> IF/ELSE -> FOR/WHILE Loops -> CLASSES() -> INTERFACES/ABSTRACT
        // -> Built-In Functions -> INHERITANCE -> SORTING/SEARCHING -> RECURSION
        // Class 1 d = new Class 1();
        Practice d = new Practice();
        d.random();

    }


}
