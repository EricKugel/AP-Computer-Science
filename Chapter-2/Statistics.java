import java.util.Scanner;

public class Statistics
{
  public static void main (String[] arg0)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input some text:");
    String text = scanner.nextLine();
    System.out.println("Now input a word to find in your text:");
    String word = scanner.nextLine();
    System.out.println("And one more:");
    String word1 = scanner.nextLine();
    
    System.out.println("The index of your word \"" + word + "\" is " + text.indexOf(word));
    System.out.println("You might of thought it was " + (text.indexOf(word) + 1) + ", not realizing computers start counting at zero.");
    System.out.println("The index of your second word \"" + word1 + "\" is " + text.indexOf(word1));
    System.out.println("You might of thought it was " + (text.indexOf(word1) + 1) + ", not realizing computers start counting at zero.");
    System.out.println("The length of your text is " + text.length());
    System.out.println("And the combined length of your two words \"" + word + "\" and \"" + word1 + "\" is " + (word.length() + word1.length()) + ".");
    
  }
}