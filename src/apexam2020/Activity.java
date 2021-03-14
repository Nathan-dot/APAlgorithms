//package apexam2020;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Activity {
//    private ArrayList<Activity> activitiesList;
//    public int findMinPartIndex() {
//      int index = activitiesList.get(0).getNumParticipants();
//      for(int i = 1; i < activitiesList.size(); i++) {
//          if(index > activitiesList.get(i).getNumParticipants()) {
//              index = i;
//          }
//      }
//      return index;
//  }
//
//    public Activity[] getLowestActivities(int n) {
//      Activity[] lowPart = new Activity[n];
//      for(int i = 0; i < n; i++) {
//          int j = findMinPartIndex();
//          lowPart[i] = activitiesList.get(j);
//          activitiesList.remove(j);
//      }
//      return lowPart;
//
//  }
//}
