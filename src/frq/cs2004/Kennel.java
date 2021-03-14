package frq.cs2004;

import java.util.ArrayList;

public class Kennel {
    private ArrayList petList;

    public void allSpeak() {
        for(int i = 0; i < petList.size(); i++) {
            System.out.println((((Pet) petList.get(i)).getName() + " " + (((Pet) petList.get(i)).speak())));
        }
    }


}
