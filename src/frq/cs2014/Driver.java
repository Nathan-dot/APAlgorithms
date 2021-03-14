package frq.cs2014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        Student student = new Student("Karen", 3);
        studentList.add(student);

        Student student1 = new Student("Liz", 1);
        studentList.add(student1);

        Student student2 = new Student("Paul", 4);
        studentList.add(student2);

        Student student3 = new Student("Lester", 1);
        studentList.add(student3);

        Student student4 = new Student("Henry", 5);
        studentList.add(student4);

        Student student5 = new Student("Renee", 9);
        studentList.add(student5);

        SeatingChart seatingChart = new SeatingChart(studentList, 2, 3);
        Student[][] seats = seatingChart.getSeats();
        System.out.println(seatingChart.removeAbsentStudents(2));
        for(int i = 0; i < 3; i++) {
            System.out.print(seats[0][i].getName() + " ");
        }
        System.out.println("");
        for(int j = 0; j < 3; j++) {
            System.out.print(seats[1][j].getName() + " ");
        }

    }
}
