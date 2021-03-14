package Arrays.CCC.CCC2014;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class S2_Assigning_Partners {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int people = a.nextInt();
        a.nextLine();
        String b = a.nextLine();
        ArrayList<String> d = new ArrayList<String>(Arrays.asList(b.split(" ")));
        String c = a.nextLine();
        ArrayList<String> e = new ArrayList<String>(Arrays.asList(c.split(" ")));
        int match = 0;

        for(int i = 0; i < people; i++) {
            for(int j = 0; j < people; j++) {
                if((d.get(i).equals(e.get(j))) && i != j) {
                    if(e.get(i).equals(d.get(j))) {
                        match++;
                    }
                }
            }
        }
        if(match == people){
            System.out.println("good");
        }
        else{
            System.out.println("bad");
        }
    }
}
