import java.util.ArrayList;

public class StepTracker {
    private ArrayList<Integer> steps = new ArrayList<Integer>();
    private int goal = 0;

    public StepTracker(int goal) {
        this.goal = goal;
    }

    public int activeDays() {
        int activeDays = 0;
        for (int dailySteps : steps) {
            if (dailySteps > goal) {
                activeDays++;
            }
        }
        return activeDays;
    }

    public double averageSteps() {
        if (steps.size() == 0) {
            return 0;
        }
        
        int sum = 0;
        for (int dailySteps : steps) {
            sum += dailySteps;
        }
        return sum / (double) steps.size();
    }

    public void addDailySteps(int steps) {
        this.steps.add(steps);
    }
}
