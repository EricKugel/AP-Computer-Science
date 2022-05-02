import java.util.ArrayList;

/**
 * WordListTester contains a main method to test a WordList object.
 * 
 * The tester constructs a WordList, invokes the numWordsOfLength and 
 * removedWordsOfLength methods, and prints the results.
 */
public class WordListTester {
  public static void main(String[] args) {
    ArrayList<String> theList = new ArrayList<String>();
    theList.add("cat");
    theList.add("mouse");
    theList.add("frog");
    theList.add("dog");
    theList.add("dog");
    WordList animals = new WordList(theList);
    System.out.println(animals + "\n");
    
    System.out.println(animals.numWordsOfLength(4));
    System.out.println(animals.numWordsOfLength(3));
    System.out.println(animals.numWordsOfLength(2) + "\n");

    animals.removeWordsOfLength(4);
    System.out.println(animals);
    animals.removeWordsOfLength(3);
    System.out.println(animals);
    animals.removeWordsOfLength(2);
    System.out.println(animals);
  }
}
