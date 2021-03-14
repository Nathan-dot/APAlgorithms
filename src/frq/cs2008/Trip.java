package frq.cs2008;

import java.util.ArrayList;

public class Trip {
    private ArrayList<Flight> flights;
    public int getDuration() {
        if(flights.size() > 0) {
            Time first = flights.get(0).getDepartureTime();
            Time last = flights.get(flights.size()-1).getArrivalTime();
            return first.minutesUntil(last);
        }
        else{
            return 0;
        }
    }

    public int getShortestLayover() {
        int shortLayover = 5000;
        for(int i = 0; i < flights.size() - 1; i++) {
            Time departure = flights.get(i).getDepartureTime();
            Time arrival = flights.get(i+1).getArrivalTime();
            int duration = departure.minutesUntil(arrival);
            if(duration < shortLayover) {
                shortLayover = duration;
            }
        }
        return shortLayover;
    }

}

///import java.util.ArrayList;
//​
//public class Trip {
//    private ArrayList<Flight> flights;
//​
//    public int getDuration() {
//        if (flights.size() == 0) {
//            return 0;
//        } else {
//            Time start = flights.get(0).getDepartureTime();
//            Time end = flights.get(flights.size() - 1).getArrivalTime();
//            return start.minutesUntil(end);
//        }
//    }
//​
//    public int getShortestLayover() {
//        if (flights.size() <= 1) {
//            return -1;
//        } else {
//            int min = getDuration();
//            for (int i = 0; i < flights.size() - 1; i++) {
//                Time arrive = flights.get(i).getArrivalTime();
//                Time depart = flights.get(i+1).getDepartureTime();
//                int layover = arrive.minutesUntil(depart);
//                if (layover < min) {
//                    min = layover;
//                }
//            }
//            return min;
//        }
//    }