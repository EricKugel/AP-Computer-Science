import java.util.ArrayList;

/**
 * A word list can find words of a certain length and remove them from the list.
 */
public class WordList {
  private ArrayList<String> myList;
  
  /**
   * Constructs a WordList object by setting param as instance variable.
   * Not included in the original AP question.
   * 
   * @param myList  the list of strings to be stored
   */
  public WordList(ArrayList<String> myList) {
    this.myList = myList;
  }
  
  /**
   * Returns the number of words in this WordList that are exactly len letters long
   * 
   * @param len  the length of words to be searched for
   * @return     the number of words found of len length
   */
  public int numWordsOfLength(int len) {
    int num = 0;
    for (String word : myList) {
      if (word.length() == len) {
        num++;
      }
    }
    return num;
  }
  
  
  /** 
   * Removes all words of length len from this WordList.
   * Postcondition: all words that are exactly len letters long have been removed from this WordList,
   *                with the order of the remaining words unchanged
   */
  public void removeWordsOfLength(int len) {
    for (int i = 0; i < myList.size(); i++) {
      if (myList.get(i).length() == len) {
        myList.remove(i);
        i--;
      }
    }
  }
  
  
  /**
   * Returns a string representation of the object.
   * Not included in the original AP question.
   * 
   * @return  a string representation of the object
   */
  public String toString() {
    String output = "";
    for (String item : myList) {
      output += item + " ";
    }
    return output;
  }
  
}