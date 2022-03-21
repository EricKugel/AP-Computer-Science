/**
 * RandomStringChooserTester contains a main method to test a RandomStringChooser 
 * and RandomLetterChooser objects.
 * 
 * The tester constructs a RandomStringChooser and RandomLetterChooser objects,
 * invokes the getNext method, and prints the results.
 */
public class RandomStringChooserTester {
  public static void main(String[] args) {
    // Tests For Part (a)
    String[] wordArray = {"wheels", "on", "the", "bus"};
    // tests RandomStringChooser constructor
    RandomStringChooser sChooser = new RandomStringChooser(wordArray);
    
    // tests RandomStringChooser getNext method
    for (int k = 0; k < 6; k++) {
      System.out.print(sChooser.getNext() + " ");
    }
    System.out.println("");
    
    
    // Tests For Part (b)
    // tests RandomLetterChooser constructor
    RandomLetterChooser lChooser = new RandomLetterChooser("cat");
    
    // Test RandomLetterChooser getNext method
    for(int k = 0; k < 4; k++) {
      System.out.print(lChooser.getNext());
    }
  }
}