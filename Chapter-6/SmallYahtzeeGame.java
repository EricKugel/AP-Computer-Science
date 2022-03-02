import java.util.Scanner;

public class SmallYahtzeeGame {
  public static void main(String[] args) { 
    Scanner myScanner = new Scanner(System.in);
    
    // Welcome message
    System.out.println("Welcome to YAHTZEE!");
    System.out.println("The game of risk and chance!");
    
    // Each turn can have a maximum of three rolls ... rollsAvailable is the number of rolls still available.
    // When this boolean value is turned to false, the turn is over.
    boolean turn = true;      
    while (turn) {
      int rollsAvailable = 2;
      Set mySet = new Set();
      
      // While there are rolls still available
      while (rollsAvailable >= 0) {
        // Roll the whole set
        mySet.roll();
        
        // Reset all the statuses
        mySet.resetStatus();
        
        // Print the hand for the player to view
        System.out.println(mySet);
        
        // If the player has another possible roll
        if (rollsAvailable > 0) {
          // *******************************************************************************
          // Ask the user what they want to do - roll some of the dice or add up their score
          System.out.println("\nDo you want to keep rolling or tally your score? ");
          System.out.println("roll (r) or tally (t)");
          String input = myScanner.next(); 
          
          // Check for valid input
          while (!input.equals("r") && !input.equals("t")) {
            System.out.println("\nPlease input an (r) for roll or (t) for tally.");
            input = myScanner.next();
          }
          
          // **************************************************************************************
          // If the player picks tally: break out of the loop (we're not going to work on this part)
          if (input.equals("t")) {
            break; // this breaks out of the loop
          }
          
          // *****************************************************************************
          // If the player chooses roll: ask the player how many to keep and roll the rest
          System.out.println("\nHow many dice do you want to keep? ");
          int numToKeep = myScanner.nextInt();
          
          // Check for valid input
          while (numToKeep < 0 || numToKeep > 5) {
            System.out.println("\nPlease select a number 1 through 5.");
            numToKeep = myScanner.nextInt();
          }
          
          // If the player doesn't want to keep any dice, go back to the start of this while loop
          if (numToKeep == 0) {
            System.out.println("\nOkay, let'mySet roll again!");
          }
          // Select the dice to keep
          else {
            System.out.println("\nOkay, which dice do you want to keep?");
            
            for (int k = 0; k < numToKeep; k++) {    
              System.out.println("Keep: ");
              int keep = myScanner.nextInt();
              
              //check for valid input
              while (keep <= 0 || keep > 5) {
                System.out.println("\nPlease select a number 1 through 5.");
                keep = myScanner.nextInt();
              }
              
              mySet.getDice(keep-1).pick();
            }
          }
        }
        
        rollsAvailable--;
      }
      
      System.out.println("\nAlright, here is your final set!");
      System.out.println(mySet);
      System.out.println("--------------------------------");
      
      System.out.println("\nWould you like to play again?");
      System.out.println("yes (y) or no (n)");
      String input2 = myScanner.next(); 
          
      // Check for valid input
      while (!input2.equals("y") && !input2.equals("n")) {
        System.out.println("\nPlease input a (y) for yes or (n) for no.");
        input2 = myScanner.next();
      }
      
      if(input2.equals("n")) {
        turn = false;
      }
      
    }
  }
}