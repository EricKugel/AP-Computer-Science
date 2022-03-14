import java.util.List;

/** 
 * StringFormatter contains static methods to manipulate and evaluate lists of strings.
 */
public class StringFormatter {  
  /** 
   * Returns the total number of letters in wordList.
   * 
   * @param wordList  the list to be evaluated
   * Precondition: wordList contains at least two words, consisting of letters only.
   */
  public static int totalLetters(List<String> wordList) {
    int total = 0;
    for (String word : wordList) {
      total += word.length();
    }
    return total;
  }
  
  
  /** 
   * Returns the basic gap width when wordList is used to produce
   * a formatted string of formattedLen characters.
   *
   * @param wordList      the list to be evaluated
   * @param formattedLen  the length of the result of formatting wordList
   * @return              the basic gap width when wordList is used to produce
   *                      a formatted string of formattedLen characters
   * Precondition: wordList contains at least two words, consisting of letters only.
   *               formattedLen is large enough for all the words and gaps.
   */
  public static int basicGapWidth(List<String> wordList, int formattedLen) {
    int total = totalLetters(wordList);
    int spaces = formattedLen - total;
    return spaces / (wordList.size() - 1);
  }
  
  
  /** 
   * Returns the number of leftover spaces when wordList is used to produce
   * a formatted string of formattedLen characters.
   * 
   * @param wordList      the list to be evaluated
   * @param formattedLen  the length of the result of formatting wordList
   * @return              the number of leftover spaces when wordList isused to produce
   *                      a formatted string of formattedLen characters
   * Precondition: wordList contains at least two words, consisting of letters only.
   *               formattedLen is large enough for all the words and gaps.
   */
  public static int leftoverSpaces(List<String> wordList, int formattedLen) {
    int numLetters = totalLetters(wordList);
    int leftovers = (formattedLen - numLetters)%(wordList.size()-1);
    return leftovers;
  }
  
  /** 
   * Returns a formatted string consisting of the words in wordList separated by spaces.
   * 
   * @param wordList      the list to be evaluated
   * @param formattedLen  the length of the result of formatting wordList
   * @return              a formatted string consisting of the words in wordList separated by spaces
   * Precondition: The wordList contains at least two words, consisting of letters only.
   *               formattedLen is large enough for all the words and gaps.
   * Postcondition: All words in wordList appear in teh formatted string.
   *  - The words appear in the same order as in wordList.
   *  - The number of spaces between words is determined by basicGapWidth and the
   *    distribution of leftoverSpaces from left to right, as described in the question.
   */
  public static String format(List<String> wordList, int formattedLen) {
    int basicGapWidth = basicGapWidth(wordList, formattedLen);
    int leftoverSpaces = leftoverSpaces(wordList, formattedLen);

    String output = wordList.remove(0);
    for (int wordIndex = 0; wordIndex < wordList.size(); wordIndex++) {
      for (int i = 0; i < basicGapWidth; i++) {
        output += " ";
      }
      output += wordIndex < leftoverSpaces ? " " : "";
      output += wordList.get(wordIndex);
    }
    return output;
  }
  
  
}