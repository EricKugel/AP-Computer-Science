/**
 * WordEditorTester contains a main method to test a WordEditor object.
 * 
 * The tester constructs a WordEditor object, invokes the copy, cut,
 * and paste methods, and prints the results.
 */
public class WordEditorTester {
  public static void main(String[] args) {
    // tests initial set up and prints returned ArrayList from copy method for entire ArrayList
    String[] wBlake = {"Tyger", "Tyger", "burning", "bright", "In", "the", "forests", "of", "the", "night"};
    WordEditor poem = new WordEditor(wBlake);
    System.out.println(poem.copy(0, 10) + "\n");
    
    // tests copy method alone
    System.out.println(poem.copy(3, 7) + "\n");
    
    /* tests cut and paste methods
     * Note: the following line could be replaced with:
     *   ArrayList<String> output = poem.cut(2, 4);
     *   poem.paste(8, output);
     */
    poem.paste(8, poem.cut(2, 4));
    System.out.println(poem.copy(0, 10) + "\n");
    
    // tests copy and paste methods
    poem.paste(5, poem.copy(0, 2));
    System.out.println(poem.copy(0, 12));
  
  }
}