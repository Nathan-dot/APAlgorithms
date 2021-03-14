package inheritance.Comparable;

// Every Java class is a subclass of 'Object' class
// in 'Object' class
// - toString(): returns the string representation of the object
// - equals(): contains what's equal for the objects
public class Student implements Comparable {
    // instance variables (fields)
    private String id;
    private String name;
    private String school;
    private int year;
    private int grade;

    // constructors
    public Student(String id, String name, String school, int year) {
        // initialize instance variables
        this.id = id;
        this.name = name;
        this.school = school;
        this.year = year;
        this.grade = 0;
    }

    // methods
    public void writeTest(int result) {
        this.grade += result;
    }

    @Override
    public int compareTo(Object o) {
        // negative int: 'this' object is 'less than' o
        // zero (0) : 'this' object is 'equal to' o
        // positive int: 'this' object is 'greater than' o
        Student other = (Student) o;
        return other.grade - this.grade;
    }

    @Override
    public String toString() {
        //  returns the string representation of the object from this class.
        return name + "(" + school + ", year=" + year + ", grade=" + grade + ")";
    }

    @Override
    public boolean equals(Object obj) {
        Student other = (Student) obj;
        return this.id.equals(other.id);
    }

    // getters setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
