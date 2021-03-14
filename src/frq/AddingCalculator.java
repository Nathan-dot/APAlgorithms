package frq; // tells you what package you are in
// imports go here
// Alt + Enter will automatically import if you need

import java.util.Scanner;

public class AddingCalculator { // Class Header
    private int number1; //Global Variable initialization
    private int number2;

    public AddingCalculator(int number1, int number2) { // Function Header - summary of what you want to do
        this.number1 = number1; // Function Body - where you actually give the commands
        this.number2 = number2;
    }

    public int addTogether() {
        return number1 + number2;
    }

    public int multiplyTogether() {
        return number1 * number2;
    }

    public boolean evenNumbers() {
        // % = modulus (to find remainder)
        // && = and, || = or
        if(number1 % 2 == 0 && number2 % 2 == 0) {
            return true;
        }
        else{
            return false;
        }
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public static void main(String[] args) {
        AddingCalculator a = new AddingCalculator(2, 4);
        System.out.println(a.evenNumbers());

    }
}
