import java.util.ArrayList;

/**
 * Delimiters consist of opening and closing strings that should be paired equally.
 */
public class Delimiters {
  /** The open and close delimiters. */
  private String openDel;
  private String closeDel;
  
  /** 
   * Constructs a Delimiters object where open is the open delimiter and close is the 
   * close delimiter.
   * Precondition: open and close are non-empty strings
   * 
   * @param open   the opening delimiter
   * @param close  the closing delimieter
   */
  public Delimiters(String open, String close) {
    openDel = open;
    closeDel = close;
  }
  
  /**
   * Returns an ArrayList of delimiters from the array tokens, as described in part (a).
   * 
   * @param tokens  the strings of text and delimiters to be analyzed
   * @return        an ArrayList of delimiters from the array tokens
   */
  public ArrayList<String> getDelimitersList(String[] tokens) {
    ArrayList<String> delimitersList = new ArrayList<String>();
    for (String token : tokens) {
      if (token.equals(openDel) || token.equals(closeDel)) {
        delimitersList.add(token);
      }
    }
    return delimitersList;
  }
  
  
  /** 
   * Returns true if the delimiters are balanced and false otherwise, as described in part (b).
   * Precondition: delimiters contains only valid open and close delimiters
   * 
   * @param delimters  the list of delimiters to be compared
   * @return           true if the delimiters are balanced;
   *                   false otherwise
   */
  public boolean isBalanced(ArrayList<String> delimiters) {
    int counter = 0;
    for (String del : delimiters) {
      counter += del == openDel ? 1 : -1;
      if (counter < 0) {
        return false;
      }
    }
    return counter == 0;
  }
  
  
}