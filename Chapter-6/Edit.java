import java.util.ArrayList;

/**
 * An edit is a change made to text involving copying, cutting, and/or pasting part or all of the text.
 */
public interface Edit {
  /**
   * Returns an ArrayList of strings copied from a text.
   * 
   * @param start      the index of the first element to be copied
   * @param endBefore  the index of the first element after start to not be copied
   * @return           an ArrayList of strings copied from text
   */
  public ArrayList<String> copy(int start, int endBefore);
  
  /**
   * Removes and returns an ArrayList of strings copied from a text.
   * 
   * @param start      the index of the first element to be copied and removed
   * @param endBefore  the index of the first element after start to not be copied and removed
   * @return           an ArrayList of strings copied and removed from text
   */
  public ArrayList<String> cut(int start, int endBefore);
  
  /**
   * Inserts the elements of an ArrayList of strings into a text, beginning at param index.
   * 
   * @param index  the index where the first element is to be inserted
   * @param words  the ArrayList of words to be inserted
   */
  public void paste(int index, ArrayList<String> words);
  
}