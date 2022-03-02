import java.util.Scanner;

public class FrogSimulation
{
  /** Distance, in inches, from the starting position to the goal. */
  private int goalDistance;
  
  /** Maximum number of hops allowed to reach the goal. */
  private int maxHops;
  
  /** Extra variable for implementation of hopDistance. */
  private int exampleNum = -1;
  private int randomHopIndex = -1;
  
  /** Constructs a FrogSimulation where dist is the distance, in inches, from the starting
    * position to the goal, and numHops is the maximum number of hops allowed to reach the goal.
    * Precondition: dist > 0; numHops > 0
    */
  public FrogSimulation(int dist, int numHops)
  {
    goalDistance = dist;
    maxHops = numHops;
    
    // Object initialization of extra variable for implementation of hopDistance.
    randomHopIndex = 0;
  }
  
  /** Returns an integer representing the distance, in inches, to be moved when the frog hops.
    */
  private int hopDistance()
  { /* implementation not originally shown */
    if (exampleNum == -1) {
      Scanner userInput = new Scanner(System.in);
      System.out.println("What example would you like to simulate? (Type a number 1-6.)");
      System.out.println("Examples 1-5 are taken from the lab directions.  Example 6 is for random siumlations.");
      exampleNum = userInput.nextInt();
    }
    
    int[] example = null;
    if (exampleNum == 1) {
      int[] exampleElements = {5, 7, -2, 8, 6};
      example = exampleElements;
    } else if (exampleNum == 2) {
      int[] exampleElements = {6, 7, 6, 6};
      example = exampleElements;
    } else if (exampleNum == 3) {
      int[] exampleElements = {6, -6, 31};
      example = exampleElements;
    } else if (exampleNum == 4) {
      int[] exampleElements = {4, 2, -8};
      example = exampleElements;
    } else if (exampleNum == 5) {
      int[] exampleElements = {5, 4, 2, 4, 3};
      example = exampleElements;
    } else {
      int[] exampleElements = new int[1000];
      for (int i = 0; i < 1000; i++) {
        exampleElements[i] = (int)(Math.random() * 45 - 10);
      }
      example = exampleElements;
    }
    
    int output = example[randomHopIndex];
    randomHopIndex++;
    return output;
  }
  
  /** Simulates a frog attempting to reach the goal as described in part (a).
    * Returns true if the frog successfully reached or passed the goal during the simulation;
    *         false otherwise.
    */
  public boolean simulate() {
    int position = 0;
    for (int hop = 0; hop < maxHops; hop++) {
      int distance = hopDistance();
      position += distance;
      if (position >= goalDistance) {
        return true;
      } else if (position < 0) {
        return false;
      }
    }
    return false;
  }
  
  
  /** Runs num simulations and returns the proportion of simulations in which the frog
    * successfully reached or passed the goal.
    * Precondition: num > 0
    */
  public double runSimulations(int num) {
    int passed = 0;
    for (int i = 0; i < num; i++) {
      if (simulate()) {
        passed += 1;
      }
    }
    return (double) passed / num;
  }
}
