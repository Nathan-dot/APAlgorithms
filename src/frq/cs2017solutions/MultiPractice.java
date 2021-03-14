package frq.cs2017solutions;

public class MultiPractice implements StudyPractice {
    private int first;
    private int second;

    public MultiPractice(int n1, int n2) {
        this.first = n1;
        this.second = n2;
    }

    @Override
    public String getProblem() {
        return first + " TIMES " + second;
    }

    @Override
    public void nextProblem() {
        second++;
    }
}
