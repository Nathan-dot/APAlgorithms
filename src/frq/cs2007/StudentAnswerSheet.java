package frq.cs2007;

import frq.cs2014.Student;

import java.util.ArrayList;

public class StudentAnswerSheet {
    private ArrayList<String> answers;
    //key and answers are same length
    private String studentName;
    public StudentAnswerSheet(String studentName, ArrayList<String> answers) {
        this.studentName = studentName;
        this.answers = answers;
    }
    public double getScore(ArrayList<String> key) {
        double score = 0.0;
        for(int i = 0; i < key.size(); i++) {
            if(answers.get(i).equals(key.get(i))) {
                score += 1.0;
            }
            else if(!answers.get(i).equals("?")) {
                score -= 0.25;
            }

        }
        return score;
    }

    public String getName(){
        return studentName;
    }

    public static void main(String[] args) {
        ArrayList<String> answers = new ArrayList<>();
        answers.add("?");
        answers.add("C");
        answers.add("X");
        answers.add("E");
        answers.add("?"); // 1.75 points
        StudentAnswerSheet a = new StudentAnswerSheet(" ", answers);
        ArrayList<String> key = new ArrayList<>();
        key.add("A");
        key.add("C");
        key.add("D");
        key.add("E");
        key.add("B");
        System.out.println(a.getScore(key));

    }
}
