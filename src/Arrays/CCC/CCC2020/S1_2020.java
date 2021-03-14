package Arrays.CCC.CCC2020;

import java.util.Scanner;

public class S1_2020 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int days = a.nextInt();
        String[] swifts = a.next().split(" ");
        String[] sem = a.next().split(" ");
        int swifts_total = 0, sem_total = 0;
        for(int i = 0; i < days; i++) {
            swifts_total += Integer.parseInt(swifts[i]);
            sem_total += Integer.parseInt(sem[i]);
            if(swifts_total == sem_total) {
                System.out.println(i);
                break;
            }
        }
    }
}
