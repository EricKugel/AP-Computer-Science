import java.util.Scanner;

public class StringArray implements Editable {
  private String[] words = null;
  
  public StringArray(String[] words) {
    this.words = words;
  }

  public void overwrite(int index, int numberOfWords) {
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < numberOfWords; i++) {
      System.out.println("Enter a word");
      String word = scanner.nextLine();
      words[i + index] = word;
    }
  }

  public void append(int numberOfWords) {
    int oldLength = words.length;
    String[] newWords = new String[oldLength + numberOfWords];
    for (int i = 0; i < oldLength; i++) {
      newWords[i] = words[i];
    }
    words = newWords;
    overwrite(oldLength, numberOfWords);
  }

  public String toString() {
    String output = "";
    for (String word : words) {
      output += word + " ";
    }
    return output;
  }
}