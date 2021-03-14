package frq.hwork;

public class StepTracker {
    private int a;
    private int activeDays;
    private int averageSteps;
    private int totalDays;
    private int totalSteps;

    public StepTracker(int minSteps) {
        a = minSteps;
        activeDays = 0;
        averageSteps = 0;
        totalDays = 0;
        totalSteps = 0;
    }

    public void addDailySteps(int steps) {
        if(steps >= a) {
            activeDays++;
        }
        totalDays++;
        totalSteps += steps;
    }

    public int activeDays() {
        return activeDays;
    }

    public int averageSteps() {
        if(totalDays == 0  || totalSteps == 0) {
            return 0;
        }
        averageSteps = totalSteps / totalDays;
        return averageSteps;
    }

}

