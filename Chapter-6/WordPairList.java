import java.util.ArrayList;

/**
 * A WordPairList contains an ArrayList of WordPair objects, as well as methods to find the number of matches
 * and to print the WordPairs in the list.
 */
public class WordPairList {
  /** The list of word pairs, initialized by the constructor. */
  private ArrayList<WordPair> allPairs = null;
  
  /** 
   * Constructs a WordPairList object as described in part (a).
   * 
   * @param words  the array of words to be paired
   *               Precondition: words.length >=2
   */
  public WordPairList(String[] words) {
    allPairs = new ArrayList<WordPair>();
    for (int wordIndex = 0; wordIndex < words.length; wordIndex++) {
      for (int otherWordIndex = wordIndex + 1; otherWordIndex < words.length; otherWordIndex++) {
        allPairs.add(new WordPair(words[wordIndex], words[otherWordIndex]));
      }
    }
  }
  
  
  /** 
   * Returns the number of matches as described in part (b).
   */
  public int numMatches() {
    int count = 0;
    for (WordPair wordPair : allPairs) {
      if (wordPair.getFirst().equals(wordPair.getSecond())) {
        count += 1;
      }
    }
    return count;
  }
  
  
  /** 
   * Returns a string representation of the object.
   * Not included in the oricinal AP question.
   */
  public String toString() {
    String output = "";
    for (WordPair item : allPairs) {
      output += item.getFirst() + ", " + item.getSecond() + "\n";
    }
    return output;
  }
  
}