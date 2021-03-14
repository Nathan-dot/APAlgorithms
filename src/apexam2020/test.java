package apexam2020;

import exam.Hailstone;

import java.util.ArrayList;

class test {
    private int count;
    private String load;

    public test(int count, String load) {
        this.count = count;
        this.load = load;
    }

    public int getCount() {
        return count;
    }

    public String getLoad() {
        return load;
    }

    public boolean verify(String[] a) {
        for (int i = 0; i < a.length; i++) {
            load = load.toLowerCase();
            if (a[i].equals(load)) {
                return true;
            }
        }
        return false;
    }

    public int compareTo(String b) {
        int c = b.compareTo(load);
        return c;
    }

    public int getLowestActivity() {
        return 0;
    }
}

// can use Integer.parseInt() to convert from String to Integer
// can use Integer.toString to convert from Integer to String
// compareTo(Object a) compares two objects. If they are equal, returns 0. The method compares reverse of
// alphabetical order and compares Object a to the other Object(i.e. if the first letter of a is "h" while
// the first letter of the other object is "c", the method will return 5). The other way would print a negative number.
