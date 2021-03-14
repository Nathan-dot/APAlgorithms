package Contacts;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;
import static java.lang.System.exit;

public class App {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("+=== Contact App ===+");
        System.out.println("|  1. List all Contacts  |");
        System.out.println("|  2. Add new Contact  |");
        System.out.println("|  3. Remove Contact  |");
        System.out.println("|  4. Update Contact  |");
        System.out.println("|  5. Quit  |");
        System.out.println("+======================+");
        InputCollector data = new InputCollector();
        data.greet();
        while(count < 5) {
            data.getOption();
            count++;
        }

    }
}
