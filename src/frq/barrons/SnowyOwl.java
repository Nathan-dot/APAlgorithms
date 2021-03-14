package frq.barrons;

public abstract class SnowyOwl extends Bird{
    private static int a = 0;
    public SnowyOwl(String snowyOwlName) {
        super(snowyOwlName, "hoot");
    }
    @Override
    public String getFood() {
        int a = (int) (Math.random() * 3);
        if(a == 1) {
            return "hare";
        }
        else if(a == 2) {
            return "lemming";
        }
        else{
            return "small bird";
        }
    }

    @Override
    public String getNoise() {
        return super.getNoise();
    }
}

// can use Integer.parseInt() to convert from String to Integer
// can use Integer.toString to convert from Integer to String
// compareTo(Object a) compares two objects. If they are equal, returns 0. The method compares reverse of
// alphabetical order and compares Object a to the other Object(i.e. if the first letter of a is "h" while
// the first letter of the other object is "c", the method will return 5). The other way would print a negative number.

// you need to override all abstract methods if extending from an abstract class. getNoise() is not necessary to implement
// super() is used in a subclass to essentially call a method in the parent class. In this case, getNoise()
// just calls its version in the parent class.