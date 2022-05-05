/**
 * StepTrackerTester contains a main method to test a StepTracker object.
 * 
 * The tester constructs a StepTracker object, invokes the activeDays, 
 * averageSteps, and addDailySteps methods, and prints the results.
 */
public class StepTrackerTester {
  public static void main(String[] args) {
    // tests constructor, active days and averageSteps methods
    // Day 1
    StepTracker tr = new StepTracker(10000);
    System.out.println(tr.activeDays());
    System.out.println(tr.averageSteps());
    
    // tests addDailySteps, active days and averageSteps methods
    // Days 2-3
    tr.addDailySteps(9000);
    tr.addDailySteps(5000);
    System.out.println("\n" + tr.activeDays());
    System.out.println(tr.averageSteps());
    
    // Day 4
    tr.addDailySteps(13000);
    System.out.println("\n" + tr.activeDays());
    System.out.println(tr.averageSteps());
    
    // Days 5-6
    tr.addDailySteps(23000);
    tr.addDailySteps(1111);
    System.out.println("\n" + tr.activeDays());
    System.out.println(tr.averageSteps());
  } 
}