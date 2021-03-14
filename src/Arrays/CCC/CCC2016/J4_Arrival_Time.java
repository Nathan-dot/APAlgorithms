package Arrays.CCC.CCC2016;
import java.util.Scanner;

public class J4_Arrival_Time {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        final int distance = 120;
        int speed = 10;

        String departureTime = a.nextLine();

        int hour = Integer.parseInt(departureTime.substring(0, departureTime.indexOf(":")));
        int minutes = Integer.parseInt(departureTime.substring(departureTime.indexOf(":") + 1, departureTime.length()));

        int distanceTravelled = 0;

        while(distanceTravelled < distance){
            if(!(((hour >= 7 && (hour <= 9 && minutes <= 50)) || (hour == 10 && minutes == 0))  || ((hour >= 15 && (hour <= 18 && minutes <= 50)) || (hour == 19 && minutes == 0)))  ){
                distanceTravelled += speed;
            }
            else{
                distanceTravelled += speed / 2;
            }

            if(distanceTravelled <= distance){
                minutes += 10;
            }

            if(minutes >= 60){
                minutes = minutes - 60;
                hour++;
                if(hour == 24){
                    hour = 00;
                }
            }
        }

        String b = "";
        if(hour < 10 && minutes == 0){
            b += "0" + hour + ":0" + minutes;
        }
        else if(hour < 10){
            b += "0" + hour + ":" + minutes;
        }
        else if(minutes == 0){
            b += hour + ":0" + minutes;
        }
        else{
            b += hour + ":" + minutes;
        }

        System.out.println(b);
    }
}
