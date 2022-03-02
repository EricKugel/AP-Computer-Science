import java.util.Scanner;

public class OneLetterPerLine {
  public static void main (String[] arg0) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter some text:");
    String text = scanner.nextLine();
    while (text.length() > 0) {      
      int length = text.length();
      int index = 0;
      String output = "\n";
      while (index < length) {
        int spacesAdded = 0;
        while (spacesAdded < index) {
          output += " ";
          spacesAdded++;
        }
        output += text.charAt(index);
        output += "\n";
        index++;
      }
      
      // I could split the first output section by new lines and iterate backwards through the array, but I want to try with substrings
      output = output.trim();
      String firstOutputSection = "" + output;
      int newLineIndex = firstOutputSection.lastIndexOf("\n");
      while (firstOutputSection.length() > 0) {
        String line = firstOutputSection.substring(newLineIndex + 1);
        output += "\n" + line;
        try { 
          firstOutputSection = firstOutputSection.substring(0, newLineIndex);
        } catch (Exception e) {
          firstOutputSection = "";
        }
        newLineIndex = firstOutputSection.lastIndexOf("\n");
      }
      
      System.out.println(output);
      System.out.println();
      System.out.println("Enter some text:");
      text = scanner.nextLine();
    }
  }
}