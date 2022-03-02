import java.util.Scanner;

public class ReplaceFirst
{
  public static void main (String[] arg0)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input some text: ");
    String text = scanner.nextLine();
    System.out.println("Input a word in that text: ");
    String word = scanner.nextLine();
    System.out.println("Input text to replace \"" + word + "\" with: ");
    String replacement = scanner.nextLine();
    int wordIndex = text.indexOf(word);
    
    String revisedText = text.substring(0, wordIndex) + replacement + text.substring(wordIndex + word.length());
    System.out.println("Revised Text: " + revisedText);
    String pivotedText = text.substring(wordIndex + word.length()) + replacement + text.substring(0, wordIndex);
    System.out.println("Pivoted Text: " + pivotedText);
    
    System.out.println("The length of the original text was " + text.length());
    System.out.println("The length of the revised text was " + revisedText.length());
    System.out.println("The length of the pivoted text was " + pivotedText.length());
    
  }
 }
