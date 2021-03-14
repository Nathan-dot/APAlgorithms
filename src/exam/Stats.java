//package exam;
//
//import java.util.ArrayList;
//
//public class Stats {
//    private ArrayList<ScoreInfo> scoreList;
//​
//
//    public boolean record(int score) {
//        for (int i = 0; i < scoreList.size(); i++) {
//            if (scoreList.get(i).getScore() == score) {
//                scoreList.get(i).increment();
//                return false;
//            }
//        }
//        for (int i = 0; i < scoreList.size(); i++) {
//            if (scoreList.get(i).getScore() > score) {
//                ScoreInfo info = new ScoreInfo(score);
//                scoreList.add(i, info);
//                return true;
//            }
//        }
//​
//        ScoreInfo info = new ScoreInfo(score);
//        scoreList.add(info);
//        return true;
//    }
//​
//
//    public void recordScores(int[] stuScores) {
//        for (int score : stuScores) {
//            record(score);
//        }
//    }
//​
//
//    public double getSeniorPercent(int score) {
//        // ScoreInfo: add a new private int variable(field) to store the number of senior students
//        //            add a new public method (getter) int getSeniorStudents that returns the number of senior students
//​
//        // increment method should check if the student is senior or not when incrementing
//        // so we can modify the increment method to take a boolean value to identify the student
//        // such as `void increment(boolean isSenior)`
//        // if isSenior is true, increment both numStudents and numSeniorStudents
//        // otherwise, just increment numStudents
//        return 0.0;
//    }
//​
//}


