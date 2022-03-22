import java.util.Scanner;

public class ReactionTimes {
  public static void main(String[] args) {
    // 1. Create a Scanner object.
    Scanner scanner = new Scanner(System.in);
    
    
    // 2. Declare and instantiate an array called "times" that contains 5 double elements.
    //    Don't initialize any values yet.
    double[] times = new double[5];
    
    // 3. Create a for loop that will fill the times array with values.
    //    Each time the for loop is iterated, ask the user for their reaction time.
    for (int i = 0; i < times.length; i++) {
      System.out.println("What's your reaction time?");
      double time = scanner.nextDouble();
      times[i] = time;
    }
    
    // 4. Create a double variable called firstAverage that will contain the average reaction time of the user.
    //    Use a for/while loop to calculate and store firstAverage.
    double firstAverage = 0.0;
    for (double time : times) {
      firstAverage += time;
    }
    firstAverage /= times.length;
    
    // 5. Print a message stating the first average reaction times of the user.
    System.out.println("Your average reaction time is " + firstAverage);
                       
    // 6. Create a for loop that will fill the times array with new values.
    //    Each time the for loop is iterated, ask the user for their reaction time.
    for (int i = 0; i < times.length; i++) {
      System.out.println("What's your reaction time?");
      double time = scanner.nextDouble();
      times[i] = time;
    }
        
    // 7. Create a double variable called secondAverage that will contain the new average reaction time of the user.
    //    Use a for-each loop to calculate and store secondAverage.
    double secondAverage = 0.0;
    for (double time : times) {
      secondAverage += time;
    }
    secondAverage /= times.length;
    
    // 8. Print a message stating the second average reaction times of the user.
    System.out.println("Your second average reaction time is " + secondAverage);
    
    scanner.close();
  }
}