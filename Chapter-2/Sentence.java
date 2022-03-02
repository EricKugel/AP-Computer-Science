import java.util.Scanner;

public class Sentence
{
  public static void main (String[] arg0)
  {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Input a 5-word sentence");
    String sentence = userInput.nextLine();
    
    int firstSpaceIndex = sentence.indexOf(" ");
    int secondSpaceIndex = sentence.indexOf(" ", firstSpaceIndex + 1);
    int thirdSpaceIndex = sentence.indexOf(" ", secondSpaceIndex + 1);
    int fourthSpaceIndex = sentence.indexOf(" ", thirdSpaceIndex + 1);
    
    String firstWord = sentence.substring(0, firstSpaceIndex);
    String secondWord = sentence.substring(firstSpaceIndex + 1, secondSpaceIndex);
    String thirdWord = sentence.substring(secondSpaceIndex + 1, thirdSpaceIndex);
    String fourthWord = sentence.substring(thirdSpaceIndex + 1, fourthSpaceIndex);
    String fifthWord = sentence.substring(fourthSpaceIndex + 1, sentence.length()-1);
    String punctuation = sentence.substring(sentence.length()-1);
    
    String newSentence = secondWord.substring(0,1).toUpperCase() + secondWord.substring(1) + " " + thirdWord.toUpperCase()  + " " + firstWord.toLowerCase() + " " + fifthWord + " " + fourthWord + punctuation;
    System.out.println(newSentence);
    
    // int
    int a = (int) (Math.random() * 11) - 5;
    double b = Math.random() * 13 - 10;
    double c = Math.sqrt(Math.pow(Math.abs(a - b), 3));
    
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
  }
}