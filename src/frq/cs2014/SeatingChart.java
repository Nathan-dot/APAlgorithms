package frq.cs2014;

import java.util.List;
public class SeatingChart {
    private Student[][] seats;

    public SeatingChart(List<Student> studentList, int rows, int cols) {
        int count = 0;
        seats = new Student[rows][cols];
        for(int c = 0; c < seats[0].length; c++) {
            for(int r = 0; r < seats.length; r++) {
                if(count < studentList.size()) {
                    seats[r][c] = studentList.get(count);
                } else {
                    seats[r][c] = null;
                }
                count++;
            }
        }
    }

    public int removeAbsentStudents(int allowedAbsences) {
        int count = 0;
        for(int r = 0; r < seats.length; r++) {
            for(int c = 0; c < seats[0].length; c++) {
                if(seats[r][c] != null && seats[r][c].getAbsenceCount() > allowedAbsences) {
                    seats[r][c] = null;
                    count++;
                }
            }
        }
        return count;
    }

    public Student[][] getSeats() {
        return seats;
    }
}
