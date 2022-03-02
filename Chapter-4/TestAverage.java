// Eric Kugel

import java.util.Scanner;

public class TestAverage {
  public static void main (String[] arg0) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("How many test scores would you like to average? Input 0 for an indefinite amount of test scores.");
    int numberOfScores = userInput.nextInt();
    while (numberOfScores < 0) {
      System.out.println("The number of tests must be a positive number or 0.");
      numberOfScores = userInput.nextInt();
    }
    int sum = 0;
    double average = 0;
    
    if (numberOfScores > 0) {
      for (int i = 0; i < numberOfScores; i++) {
        System.out.println("Test score:");
        int score = userInput.nextInt();
        sum += score;
      }
      average = (double) sum / numberOfScores;
    } 
    
    else {
      int testsInputted = 0;
      System.out.println("Test score (input -1 to stop):");
      int score = userInput.nextInt();
      while (score != -1) {
        testsInputted++;
        sum += score;
        System.out.println("Test score (input -1 to stop):");
        score = userInput.nextInt();
      }
      average = (double) sum / testsInputted;
      numberOfScores = testsInputted;
    }
    
    System.out.println("Your test average of " + numberOfScores + " tests is " + average);
  }
}