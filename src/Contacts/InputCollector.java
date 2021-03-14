package Contacts;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class InputCollector{
    public int creation = 0;
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    ArrayList<Contact> contact = new ArrayList<Contact>();
    private ContactList contactlist;
    private String prompt;
    private String username;


    public InputCollector() {
        contactlist = new ContactList();

    }

    public String greet() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Username");
        String name = in.nextLine();
        System.out.println("Hello " + name);
        return name;
    }

    public String getOption() {
        System.out.println("+=== Contact App ===+");
        System.out.println("|  1. List all Contacts  |");
        System.out.println("|  2. Add new Contact  |");
        System.out.println("|  3. Remove Contact  |");
        System.out.println("|  4. Update Contact  |");
        System.out.println("|  5. Quit  |");
        System.out.println("+======================+");
        Scanner input = new Scanner(System.in);
        System.out.println("What option would you like to choose? ");
        String username = input.nextLine();
        if(username.equals("Quit") || username.equals("5")) {
            System.out.println("Bye");
            exit(0);
        }
        if(username.equals("1")) {
            if(creation == 0){
                System.out.println("No Contacts in ContactList yet");
            }
            else{
                System.out.println(contactlist.getContactList());
            }

        }
        if(username.equals("2")) {
            System.out.println("New Contact Creation: Please enter their name, mobile, age, and location.(Each on a new line.)");
            creation++;
            Scanner contactName = new Scanner(System.in);
            String name = contactName.nextLine();
            Scanner contactMobile = new Scanner(System.in);
            String mobile = contactMobile.nextLine();
            Scanner contactAge = new Scanner(System.in);
            Integer age = contactAge.nextInt();
            Scanner contactLocation = new Scanner(System.in);
            String location = contactLocation.nextLine();
            if(!contactlist.findContact(name)) {
                contactlist.addContact(new Contact(name, mobile, age, location));
            }
            else{
                System.out.println("Error : This contact  already exists and cannot be created.");
            }
        }
        if(username.equals("3")) {
            System.out.println("Enter Contact Name for removal");
            Scanner removal = new Scanner(System.in);
            String toRemove = removal.nextLine();
            contactlist.removeContact(toRemove);
        }
        if(username.equals("4")) {
            System.out.println("Enter Contact Name for Update");
            Scanner update = new Scanner(System.in);
            String toUpdate = update.nextLine();
            contactlist.updateContact(toUpdate);

        }
        return null;
    }

    public static String getUserInput(String prompt) {
        return prompt;
    }
}
