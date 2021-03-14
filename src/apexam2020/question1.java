//AP Exam Page 1:
// 8UVYXWW0
// N.K.
//
//Question 1:
// a.)
//  public int findMinPartIndex() {
//      int index = activitiesList.get(0).getNumParticipants();
//      for(int i = 1; i < activitiesList.size(); i++) {
//          if(index > activitiesList.get(i)) {
//              index = i;
//          }
//      }
//      return index;
//  }
//
// b.)
//  public Activity[] getLowestActivities(int n) {
//      Activity[] lowPart = new Activity[n];
//      for(int i = 0; i < n; i++) {
//          int j = findMinPartIndex();
//          lowPart[i] = activitiesList.get(j);
//          activitiesList.remove(j);
//      }
//      return lowPart;
//
//  }
//
// c.) getAllGroupActivities - returns list of activities designated as group activities.
//
//  Header: public Activity[] getAllGroupActivities() {}
//  In the Activity constructor, I would add a boolean value as a parameter so that each Activity
// would have a true or false value indicating whether or not it is designed as a "group activity". In the
// Activity class, I would also include a public getter/accessor for the group activity boolean value
// mentioned previously. This would return a boolean value. (The boolean value would also be declared as
// a private instance variable right below the class header).
//
//(Would modify Activity Constructor by adding parameter and would modify Activity class by adding a
// getter for the private boolean variable)
//
// (The list of activities returned could just be added locally in the getAllGroupActivities method so no
// need to add any list elsewhere).
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//

