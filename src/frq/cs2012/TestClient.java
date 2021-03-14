package frq.cs2012;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClient {
    public static void main(String[] args) {
        ActualHorse horse1 = new ActualHorse("Trigger", 1340);
        ActualHorse horse2 = new ActualHorse(null, 0);
        ActualHorse horse3 = new ActualHorse("Silver", 1210);
        ActualHorse horse4 = new ActualHorse("Lady", 1575);
        ActualHorse horse5 = new ActualHorse(null, 0);
        ActualHorse horse6 = new ActualHorse("Patches", 1350);
        ActualHorse horse7 = new ActualHorse("Duke", 1410);
        Horse[] spaces = {horse1, horse2, horse3, horse4, horse5, horse6, horse7};
        HorseBarn sweetHome = new HorseBarn(spaces);
        System.out.println(sweetHome.findHorseSpace("Duke"));
        System.out.println(sweetHome.findHorseSpace("Patches"));
        System.out.println(sweetHome.findHorseSpace("Phone"));



        ClimbingClub club = new ClimbingClub();
        club.addClimb("Monadnock", 274);
        club.addClimb("Whiteface", 301);
        club.addClimb("Algonquin", 225);
        club.addClimb("Monadnock", 344);
        System.out.println(club.getClimbList());

        int[][] pixelValue = {{221, 184, 178, 84, 135}, {84, 255, 255, 130, 84}, {78, 255,0, 0, 78}, {84, 130, 255, 130, 84}};
        GrayImage pixelValues = new GrayImage(pixelValue);
        System.out.println(pixelValues.countWhitePixels());
        pixelValues.processImage();
        for(int[] row : pixelValue) {
            System.out.println(Arrays.toString(row));
        }
    }
}
