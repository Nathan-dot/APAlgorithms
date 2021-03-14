package Arrays.CCC.CCC2020;
import java.util.Scanner;

public class J2_2020 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int threshold_patients = a.nextInt();
        int initial_patients = a.nextInt();
        int total_patients = initial_patients;
        int next_day_infected = a.nextInt();
        int day_count = 0;
        while(total_patients <= threshold_patients) {
            initial_patients = initial_patients * next_day_infected;
            total_patients += initial_patients;
            day_count++;
        }
        System.out.println(day_count);
    }
}
