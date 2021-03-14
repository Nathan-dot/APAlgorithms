package frq.cs2017;

public class MultPractice implements StudyPractice{
    private int numOne;
    private int numTwo;

    public MultPractice(int value1, int value2) {
        numOne = value1;
        numTwo = value2;
    }
    public String getProblem() {
        return numOne + " TIMES " + numTwo;
    }

    public void nextProblem() {
        numTwo++;
    }
}
