import java.util.Scanner;

public class SmartTest {

  private static String[] questions = {
    "In what year was the Proclamation of 1763 passed?",
    "Who was the leader of the militia army that fought in the French-Indian war?",
    "The British East India Company was waived British taxes because of their oversupply of tea. How did this lead to the Boston Tea Party in 1773?",
    "What color was George Washington's white horse?",
    "Who's philosophies inspired much of the Declaration of Independence?",
    "Which of the following was NOT a founding father?"
  };

  private static String[][] options = {
    {"2006", "1914", "1865", "1763"},
    {"Benjamin Franklin", "George Washington", "Joe Biden", "Eric Kugel"},
    {"It didn't", "It drove colonial tea merchants out of business", "It drove British tea merchants out of business", "The beginning of World War 1 led all tea to be shipped directly to the men on the front lines, and any tea in the colonies was unacceptable."},
    {"White", "Black", "Gray", "A sort of magenta-electric-blue with green highlights. It also had a toupee."},
    {"John Locke", "Eric Kugel", "Paul Revere", "Paul Bunyan"},
    {"James Madison", "Samuel Adams", "Eric Kugel", "Abraham Lincoln"}
  }; 

  private static int[] answers = {4, 2, 2, 1, 1, 4};

  public static void main (String[] arg0) {
    Scanner scanner = new Scanner(System.in);
    int score = 0;

    // difficulty 1
    if (askQuestion(0, scanner)) {
      score += 1;
      if (askQuestion(1, scanner)) {
        score += 3;
      } else {
        score -= 3;
      }
    } else {
      score -= 1;
    }

    // difficulty 2
    if (askQuestion(2, scanner)) {
      score += 3;
    } else {
      score -= 3;
      if (askQuestion(3, scanner)) {
        score += 1;
      } else {
        score -= 1;
      }
    }

    // bonus round!!!
    if (score >= 0) {
      if (askQuestion(4, scanner)) {
        score += 2;
        if (askQuestion(5, scanner)) {
          score += 4;
        } else {
          score -= 4;
        }
      } else {
        score -= 2;
      }
    }

    System.out.println("Test complete. You scored " + score + ".");
  }

  private static boolean askQuestion(int questionNum, Scanner scanner) {
    System.out.println(questions[questionNum]);
    boolean correct = false;

    for (int i = 0; i < options[questionNum].length; i++) {
      System.out.println("\t" + (i + 1) + ". " + options[questionNum][i]);
    }
    System.out.println();

    int response = scanner.nextInt();
    correct = response == answers[questionNum];

    System.out.println();
    return correct;
  }
}