package inheritance.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// abstract class (class -> no instance, can have abstract methods -> methods without body)
// - without creating subclasses, no need to have abstract classes.

// interface (a set of abstract methods) - 'implements' keyword
// - contract (no need to call super class's constructor)
// - all you need to do is to implement all abstract methods in the class that implements the interface.

// 'Object' class - super class for all Java class
// - toString(): returns the string representation
// - equals(): defines what's 'equals()'

// 'Comparable' interface - in order to make objects comparable (sorting, ordering)
// - class needs to 'implements' Comparable
// - it has only one method needs to be implemented.
// - int compareTo(Object o)
//   - three possible return value
//     - pos: this object is greater than other (this placed after other)
//     - 0: the same (equal order)
//     - neg: this object is less than other (placed before other)



public class Driver {
    public static void main(String[] args) {
        Student st1 = new Student("s124", "Jared", "VC", 11);
        Student st2 = new Student("s325", "Mike", "VC", 10);
        Student st3 = new Student("s35", "Nathan", "VC", 11);
        Student st4 = new Student("s3225", "Josh", "VC", 12);
        Student st5 = new Student("s1325", "Eric", "VC", 10);
        Student st6 = new Student("s1325", "Eric", "VC", 10);
        System.out.println(st5.equals(st6));

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        for (Student student: students) {
            int randScore = (int) (Math.random() * 30) + 70; // 70 < <= 100
            student.writeTest(randScore);
        }

        for (Student student: students) {
            System.out.println(student.getGrade());
        }

        Collections.sort(students);
        System.out.println(students);

    }
}
