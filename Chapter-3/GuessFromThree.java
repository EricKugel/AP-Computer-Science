import java.util.Scanner;

public class GuessFromThree {
  public static void main (String[] arg0) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Pick a number from 1 to 3.");
    
    int guess = scanner.nextInt();
    if (guess > 3) {
      System.out.println("Your guess is larger than 3");
    } else if (guess < 1) {
      System.out.println("Your guess is lower than 1");
    } else {
      int answer = (int) (Math.random() * 3 + 1);
      
      if (guess == answer) {
        System.out.println("Correct: the number was " + answer + ".");
      } else if (guess < answer) {
        System.out.println("Incorrect: your guess " + guess + " was less than the answer " + answer);
      } else {
        System.out.println("Incorrect: your guess " + guess + " was greater than the answer " + answer);
      }
    }
  }
}