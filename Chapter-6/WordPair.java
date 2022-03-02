/**
 * A word pair stores each word in the pair.
 */
public class WordPair { 
  private String firstWord = null;
  private String secondWord = null;
  
  /** 
   * Constructs a WordPair object.
   * 
   * @param first   the first string in the pair
   * @param second  the second string in the pair
   */
  public WordPair(String first, String second) {
    firstWord = first;
    secondWord = second;
  }
  
  /**
   * Returns the first string of this WordPair object.
   */
  public String getFirst() {
    return firstWord;
  }
  
  /**
   * Returns the second string of this WordPair object.
   */
  public String getSecond() {  
    return secondWord;
  }
}