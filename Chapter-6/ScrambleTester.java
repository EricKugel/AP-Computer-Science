import java.util.ArrayList;

/**
 * ScrambleTester contains a main method to test Scramble methods.
 * 
 * The tester populates ArrayLists, invokes the scrambleWord and scrambleOrRemove
 * methods, and prints the results.
 */
public class ScrambleTester {
  public static void main(String[] args) {
    ArrayList<String> exampleWords1 = new ArrayList<>();
    exampleWords1.add("TAN");
    exampleWords1.add("ABRACADABRA");
    exampleWords1.add("WHOA");
    exampleWords1.add("AARDVARK");
    exampleWords1.add("EGGS");
    exampleWords1.add("A");
    exampleWords1.add("");
    
    // tests scrambleWord method
    for(int i = 0; i < exampleWords1.size(); i++) {
      System.out.print(Scramble.scrambleWord(exampleWords1.get(i)) + "   ");
    }
    System.out.println("\n");
    
    ArrayList<String> exampleWords2 = new ArrayList<>();
    exampleWords2.add("TAN");
    exampleWords2.add("ABRACADABRA");
    exampleWords2.add("WHOA");
    exampleWords2.add("APPLE");
    exampleWords2.add("EGGS");
    
    Scramble.scrambleOrRemove(exampleWords2);
    
    // tests scrambleOrRemove method
    for(int i = 0; i < exampleWords2.size(); i++) {
      System.out.print(exampleWords2.get(i) + "   ");
    }
  }
}