package Contacts;

public class Contact {
    private String name;
    private String mobile;
    private int age;
    private String location;

    public Contact(String name, String mobile, int age, String location) {
        this.name = name;
        this.mobile = mobile;
        this.age = age;
        this.location = location;
    }

    public String getName(Contact contact){
        return contact.name;
    }

    public String getMobile(Contact contact) {
        return contact.mobile;
    }
}
