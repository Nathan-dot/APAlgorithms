package frq.cs2007;

import java.util.ArrayList;

public class TestResults {
    private ArrayList<StudentAnswerSheet> sheets;

    public String highestScoringStudent(ArrayList<String> key) {
        // if multiple students with same score, any one can be returned
        StudentAnswerSheet bestStudent = sheets.get(0);
        for(StudentAnswerSheet a : sheets) {
            if(a.getScore(key) > bestStudent.getScore(key)) {
                bestStudent = a;
            }
        }
        return bestStudent.getName();
    }

}
