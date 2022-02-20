import java.util.Scanner;
import java.util.ArrayList;

public class LetterMatches {
  public static void main(String[] arg0) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a word");
    String word1 = scanner.next();
    System.out.println("Enter a second word");
    String word2 = scanner.next();
    
    int totalOccurences = 0;
    ArrayList<String> totalMatches = new ArrayList<String>();
    for (int i = 0; i < word1.length() - 1; i++) {
      String checkLetters = word1.substring(i, i + 2);
      ArrayList<String> matches = getMatches(word2, checkLetters);
      totalOccurences += matches.size();
      for (int matchIndex = 0; matchIndex < matches.size(); matchIndex++) {
        totalMatches.add(matches.get(matchIndex));
      }
    }
    
    System.out.println("There are " + totalOccurences + " two-letter matches in " + word1 + " and " + word2);
    String output = "They are ";
    for (int matchIndex = 0; matchIndex < totalMatches.size(); matchIndex++) {
      output += totalMatches.get(matchIndex);
      if (matchIndex != totalMatches.size() - 1) {
        output += ", ";
      }
    }
    System.out.println(output);
  }
  
  private static ArrayList<String> getMatches(String word, String letters) {
    ArrayList<String> matches = new ArrayList<String>();
    for (int i = 0; i < word.length() - 1; i++) {
      if (word.substring(i, i + 2).equals(letters)) {
        matches.add(letters);
      }
    }
    return matches;
  }
}