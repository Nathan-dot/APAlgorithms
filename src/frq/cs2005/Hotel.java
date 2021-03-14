package frq.cs2005;

import java.util.ArrayList;

public class Hotel {
    private Reservation[] rooms;
    // if rooms[index] = null, room is empty
    private ArrayList waitList;

    public Reservation requestRoom(String guestName) {
        for(int i = 0; i < rooms.length; i++) {
            if(rooms[i] == null) {
                rooms[i] = new Reservation(guestName, i);
                return rooms[i];
            }
        }
        waitList.add(guestName);
        return null;
    }

    public Reservation cancelAndReassign(Reservation res) {
        int b = res.getRoomNumber();
        Reservation a = null;
        if(waitList.size() != 0) {
            a = new Reservation((String) waitList.get(0), b);
            waitList.remove(0);
        }
        rooms[b] = a;
        return a;


    }
}
