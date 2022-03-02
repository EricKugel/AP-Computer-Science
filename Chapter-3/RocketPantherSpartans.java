// Eric Kugel

import java.util.*;

public class RocketPantherSpartans {
  
  public static void main (String[] arg0) {
    boolean hardMode = false;
    boolean realMode = false;
    
    // Getting the number of rounds and hard mode or realistic mode
    Scanner scanner = new Scanner(System.in);
    System.out.print("Welcome to Rocket-Panther-Spartans!\nHow many matches won should be required to win? Input 0 for more options.\n");
    int gamesToWin = scanner.nextInt();
    while (gamesToWin == 0) {
      System.out.println("For hard mode, press 1. For ultra-realistic mode, press 2. Press anything else to go back.");
      int choice = scanner.nextInt();
      hardMode = choice == 1;
      realMode = choice == 2;
      if (!(hardMode || realMode)) {
        System.out.println("How many matches won should be required to win? Input 0 for more options");
        gamesToWin = scanner.nextInt();
      } else {
        String output = "You chose ";
        if (hardMode) {
          output += "hard mode. How many matches won should be required to win?";
        } else {
          output += "ultra-realistic mode. How many matches won should be required to win?";
        }
        System.out.println(output);
        gamesToWin = scanner.nextInt();
      }
    }
    while (gamesToWin < 1) {
      System.out.println("You can't have no games or negative games. How many matches should be required?");
      gamesToWin = scanner.nextInt();
    }
    
    int playerGamesWon = 0, computerGamesWon = 0;
    int gameNumber = 1;
    String computerChoiceAnalysis = "";
    while (playerGamesWon < gamesToWin && computerGamesWon < gamesToWin) {
      System.out.println("Round " + gameNumber);
      System.out.println("Choose 'Rocket', 'Panther', or 'Spartan'");
      
      // Getting player choice
      String playerChoice = scanner.next().toUpperCase();
      while (!(playerChoice.equals("ROCKET") || playerChoice.equals("PANTHER") || playerChoice.equals("SPARTAN"))) {
        System.out.println("Your choice can only be 'Rocket', 'Panther', or 'Spartan'");
        playerChoice = scanner.next().toUpperCase();
      }
      
      // Getting computer choice
      String computerChoice = "";
      if (!hardMode) {
        int computerChoiceInt = (int) (Math.random() * 3);
        if (computerChoiceInt == 0) {
          computerChoice = "ROCKET";
        } else if (computerChoiceInt == 1) {
          computerChoice = "PANTHER";
        } else {
          computerChoice = "SPARTAN";
        }
      } else {
        if (playerChoice.equals("ROCKET")) {
          computerChoice = "PANTHER";
        } else if (playerChoice.equals("PANTHER")) {
          computerChoice = "SPARTAN";
        } else {
          computerChoice = "ROCKET";
        }
      }
      
      // Computer choice analysis
      int choiceAnalysisIndex = computerChoiceAnalysis.indexOf(computerChoice);
      if (choiceAnalysisIndex == -1) {
        computerChoiceAnalysis += computerChoice + " ";
      } else {
        computerChoiceAnalysis = computerChoiceAnalysis.substring(0, choiceAnalysisIndex) + computerChoice + " " + computerChoiceAnalysis.substring(choiceAnalysisIndex);
      }
      
      // Determining winner
      System.out.println("You chose " + playerChoice + " and the computer chose " + computerChoice);
      if (realMode) {
        if (playerChoice.equals(computerChoice)) {
          System.out.println("Tie game");
        } else if (playerChoice.equals("SPARTAN")) {
          System.out.println("You win because Spartans always win!");
          playerGamesWon++;
        } else if (computerChoice.equals("SPARTAN")) {
          System.out.println("You lose because Spartans always win.");
          computerGamesWon++;
        }
        else {
          System.out.println("I'm not sure who wins. Does it matter if it doesn't involve the Spartans?");
        }
      } else {
        if (playerChoice.equals(computerChoice)) {
          System.out.println("Tie game");
        } else if (playerChoice.equals("SPARTAN") && computerChoice.equals("PANTHER") ||
                   playerChoice.equals("ROCKET") && computerChoice.equals("SPARTAN") ||
                   playerChoice.equals("PANTHER") && computerChoice.equals("ROCKET")) {
          System.out.println("You win! " + playerChoice + " beats " + computerChoice);
          playerGamesWon++;
        } else {
          System.out.println("You lost. " + computerChoice + " beats " + playerChoice);
          computerGamesWon++;
        }
      }
      
      System.out.println("You've won " + playerGamesWon + " and the computer's won " + computerGamesWon + ". " + gamesToWin + " rounds won are needed to win.");
      System.out.println();
      gameNumber++;
    }
    
    // Game end
    if (playerGamesWon > computerGamesWon) {
      System.out.println("Congratualations, you won! You won " + playerGamesWon + " and the computer won " + computerGamesWon);
    } else {
      System.out.println("Sorry, the computer won. It won " + computerGamesWon + " and you only won " + playerGamesWon + ". ");
    }
    
    System.out.println("Computer choice analysis: " + computerChoiceAnalysis);
  }
}