/** 
 * WordPairListTester contains a main method to test a WordPairList object.
 *
 * The tester constructs two WordPairList objects, invokes the numMatches and 
 * toString methods, and prints the results.
 */
public class WordPairListTester {
  public static void main(String[] args) {
    // tests WordPairList constructor
    String[] wordNums = {"one", "two", "three"};
    WordPairList exampleOne = new WordPairList(wordNums);
    System.out.println(exampleOne);
    
    String[] phrase = {"the", "more", "the", "merrier"};
    WordPairList exampleTwo = new WordPairList(phrase);
    System.out.println(exampleTwo);
    
    // tests numMatches method
    String[] moreWords = {"the", "red", "fox", "the", "red"};
    WordPairList exampleThree = new WordPairList(moreWords);
    System.out.println(exampleThree);
    System.out.println(exampleThree.numMatches());
    
  }
}