package Contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    private ArrayList<Contact> contacts = new ArrayList<Contact>(0);
    private ArrayList<String> strings = new ArrayList<String>();
    public ContactList() {
        contacts = new ArrayList<Contact>(0);
    }

    public void addContact(Contact newContact) {
        contacts.add(newContact);
    }

    public ArrayList<Contact> getContactList() {
        for(int i = 0; i < contacts.size(); i++) {
            System.out.println("Contact " + i +" : " + contacts.get(i).getName(contacts.get(i)) +
                     ", " + contacts.get(i).getMobile(contacts.get(i)));
        }
        return null;
    }

    public ArrayList<Contact> removeContact(String contactName) {
        for(int i = 0; i < contacts.size(); i++) {
            if(contactName.equals(contacts.get(i).getName(contacts.get(i)))) {
                contacts.remove(i);
            }
            else{
                System.out.println("No Such Contact available for removal.");
            }
        }
        return contacts;
    }

    public ArrayList<Contact> updateContact(String contactName) {
        for(int i = 0; i < contacts.size(); i++) {
            if(contactName.equals(contacts.get(i).getName(contacts.get(i)))){
                System.out.println("Add new contact here - Format: Name, Mobile, Age, Location");
                Scanner a = new Scanner(System.in);
                String name = a.nextLine();
                Scanner contactMobile = new Scanner(System.in);
                String mobile = contactMobile.nextLine();
                Scanner contactAge = new Scanner(System.in);
                Integer age = contactAge.nextInt();
                Scanner contactLocation = new Scanner(System.in);
                String location = contactLocation.nextLine();
                contacts.set(i, new Contact(name, mobile, age, location));
            }
        }
        return contacts;
    }
    public boolean findContact(String contactName) {
        for(int i = 0; i < contacts.size(); i++) {
            if(contactName.equals(contacts.get(i).getName(contacts.get(i)))) {
                return true;
            }
        }
        return false;
    }

}
