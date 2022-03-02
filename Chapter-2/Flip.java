import java.util.Scanner;

public class Flip
{
  public static void main (String[] arg0)
  {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a sentence");
    String sentence = scanner.nextLine();
    
    int length = sentence.length();
    int sentenceMiddleIndex = length / 2;
    
    String sentenceFlip = sentence.substring(sentenceMiddleIndex) + sentence.substring(0, sentenceMiddleIndex);
    System.out.println(sentenceFlip);
  } 
}