package Contacts;

import java.util.Scanner;

public class OptionCollector {
    private int chosen;

    public OptionCollector(int chosen) {
        this.chosen = chosen;
    }

    public static void getOption() {
        Scanner option = new Scanner(System.in);
        System.out.println("Please enter an option.");
        int chosen = option.nextInt();
    }



}
