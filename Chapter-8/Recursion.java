/************************************************
 * Name: Eric Kugel
 ************************************************/

/**
 * Recursion contains two static recursive methods, and a main method
 * to test these methods.
 */
public class Recursion {
  /**
   * Prints a sentence in reverse order by word.
   * 
   * @param sentence  the string of words to be put in reverse order
   */
  public static void sentenceReverse(String sentence) {
    int spaceIndex = sentence.lastIndexOf(" ");
    if (spaceIndex == -1) {
      System.out.print(sentence);
    } else {
      System.out.print(sentence.substring(spaceIndex + 1) + " ");
      sentenceReverse(sentence.substring(0, spaceIndex));
    }
  }
      
  
  /**
   * Returns a string of numbers that alternate between positive and negative values
   * such that the absolute value of a successive term is one more than the absolute
   * value of the previous term.
   * 
   * @param num         the number of values to be returned
   * @param isPositive  true value determines that the last value to be returned is positive;
   *                    false value determines that the last value to be returned is negative
   * @return            a string of alternating numbers as described above
   */
  public static String alternatingSequence(int num, boolean isPositive) {
    if (num == 1) {
      return (isPositive ? "" : "-") + num;
    } else {
      String numbersBefore = alternatingSequence(num - 1, !isPositive);
      return numbersBefore + ", " + (isPositive ? "" : "-") + num;
    }
  }
  
  
  /**
   * Tests sentenceReverse and alternatingSequence methods.
   */
  public static void main(String[] args) {
    sentenceReverse("good morning how are you");
    System.out.println();
    sentenceReverse("Advanced Placement Computer Science");
    System.out.println("\n");
    
    System.out.println(alternatingSequence(10, true));
    System.out.println(alternatingSequence(12, false));
  }
}