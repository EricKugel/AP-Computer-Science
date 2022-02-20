import java.util.Scanner;

public class LessSmartTest {
  
  public static void main (String[] arg0) {
    Scanner scanner = new Scanner(System.in);
    boolean easy = askQuestion(0, scanner);
    boolean hard = askQuestion(1, scanner);
    int score = 0;
    String[] grades = {"D","C","B","A"};
    
    if (easy) {
      score += 1;
    }
    if (hard) {
      score += 2;
    }
    
    System.out.println("You got a " + grades[score]);
  }
  
  private static boolean askQuestion(int questionNum, Scanner scanner) {
    int[] answers = {4, 3};
    System.out.println(new String[]{"What is 12 / 3?", "What is 1200 / 400?"}[questionNum]);
    boolean correct = false;

    int response = scanner.nextInt();
    correct = response == answers[questionNum];

    System.out.println();
    return correct;
  }
}