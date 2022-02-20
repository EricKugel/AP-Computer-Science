//import jeliot.io.*;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] arg0) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number bigger than 1.");
        int max = scanner.nextInt();
        while (max <= 1) {
            System.out.println("That's not bigger than 1.");
            max = scanner.nextInt();
        }
        System.out.println("Okay, now give me a low value.");
        int min = scanner.nextInt();
        while (min >= max) {
          System.out.println("Your min has to be less than " + max);
          min = scanner.nextInt();
        }
        
        int answer = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Okay, I'm thinking of a number between " + min + " and " + max + ". What's your guess?");
        int guess = scanner.nextInt();
        int guesses = 1;
        while (answer != guess) {
            if (guess < answer) {
                System.out.println(guess + " is too low. That's " + guesses + " guesses. Guess again!");
                guess = scanner.nextInt();
            } else {
                System.out.println(guess + " is too high. That's " + guesses + " guesses. Guess again!");
            }
            guess = scanner.nextInt();
            guesses++;
        }
        
        System.out.println("You're right! " + guess + " is the correct answer. You got that in " + guesses + " guesses.");
    }
}