import java.util.Scanner;

public class DoubleFlip {
  public static void main (String[] arg0) {
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Heads (1) or tails (2)?");
    int firstGuess = userInput.nextInt();
    System.out.println("Second coin: Heads (1) or tails (2)?");
    int secondGuess = userInput.nextInt();
    
    int firstCoin = (int) (Math.random() * 2) + 1;
    int secondCoin = (int) (Math.random() * 2) + 1;
    
    if (firstGuess > 2) {
      System.out.println("Invalid entry");
    } else if (firstGuess < 1) {
      System.out.println("Invalid entry");
    } else if (secondGuess > 2) {
      System.out.println("Invalid entry");
    } else if (secondGuess < 1) {
      System.out.println("Invalid entry");
    } else {
      System.out.println("Computer flipped a " + firstCoin + " and a " + secondCoin + ".");
      if (firstGuess == firstCoin) {
        if (secondGuess == secondCoin) {
          System.out.println("Congratulations! You correctly guessed both coins!");
        } else {
          System.out.println("Good job. You got the first coin right.");
        }
      } else {
        if (secondGuess == secondCoin) {
          System.out.println("Good job. You got the second coin right.");
        } else {
          System.out.println("Sorry. Both guesses are incorrect.");
        }
      }
    }
  }
}