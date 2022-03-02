import java.util.Scanner;

public class PoemReverse {
  public static void main (String[] arg0) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input some text (A song or poem would be nice)");
    String text = scanner.nextLine();
    String output = "";
    
    // this would be much easier with lastIndexOf
    // but whatever
    int spaceIndex = text.indexOf(" ");
    int lastSpaceIndex = spaceIndex;
    while (spaceIndex >= 0) {
      lastSpaceIndex = spaceIndex;
      spaceIndex = text.indexOf(" ", lastSpaceIndex + 1);
    }
    spaceIndex = lastSpaceIndex;
    
    while (spaceIndex >= 0) {
      output += text.substring(spaceIndex);
      text = text.substring(0, spaceIndex);
      spaceIndex = text.lastIndexOf(" ");
      
      spaceIndex = text.indexOf(" ");
      lastSpaceIndex = spaceIndex;
      while (spaceIndex >= 0) {
        lastSpaceIndex = spaceIndex;
        spaceIndex = text.indexOf(" ", lastSpaceIndex + 1);
      }
      spaceIndex = lastSpaceIndex;
    }
    output += " " + text;
    System.out.println(output);
  }
}