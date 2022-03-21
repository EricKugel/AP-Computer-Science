/**
 * A random letter chooser contains a list of one-character strings that can be randomly
 * chosen and removed from the list.
 */
public class RandomLetterChooser extends RandomStringChooser {
  /** 
   * Constructs a random letter chooser using the string str.
   * Precondition: str contains only letters.
   * 
   * @param str  the string to be parsed to comprise the list of separate letters
   */
  public RandomLetterChooser(String str) {
    super(getSingleLetters(str));
  }
  
  
  /** 
   * Returns an array of single-letter strings.
   * Each of these strings consists of a single letter from str.  Element k
   * of the returned array contains the single letter at position k of str.
   * For example, getSingleLetters("cat") returns the
   * array { "c", "a", "t" }.
   * Not implemented in the original AP question.
   * 
   * @param str  the string to be parsed for single letters
   */
  public static String[] getSingleLetters(String str) {  
    String[] output = new String[str.length()];
    for (int k = 0; k < output.length; k++) {
      output[k] = str.substring(k, k + 1);
    }
    return output;
  }
  
}