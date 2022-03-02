/**
 * A route cipher fills a 2D array with a message that encrypted.
 */
public class RouteCipher {
  /** A two-dimensional array of single-character string, instantiated in the constructor. */
  private String[][] letterBlock;
  
  /** The number of rows of letterBlock, set by the constructor. */
  private int numRows;
  
  /** The number of columns of letterBlock, set by the constructor. */
  private int numCols;
  
  /** 
   * Initializes instance variables numRows and numCols.
   * Instantiates letterBlock to rows x cols.
   * Not included in the original AP question.
   * 
   * @param rows  the rows in the two-dimensional array
   * @param cols  the columns in the two-dimensional array
   */
  public RouteCipher(int rows, int cols) {
    numRows = rows;
    numCols = cols;
    letterBlock = new String[rows][cols];
  }
  
  /** 
   * Places a string into letterBlock in row-major order.
   * Postcondition:
   *   if str.length() < numRows * numCols, "A" is placed in each unfilled cell
   *   if str.length() > numRows * numCols, trailing characters are ignored]
   * 
   * @param str  the string to be processed
   */
  public void fillBlock(String str) {
    int index = 0;
    for (int row = 0; row < letterBlock.length; row++) {
      for (int col = 0; col < letterBlock[0].length; col++) {
        try {
          letterBlock[row][col] = "" + str.charAt(index);
          index += 1;
        } catch (StringIndexOutOfBoundsException e) {
          letterBlock[row][col] = "A";
        }
      }
    }
  }
  
  
  /** 
   * Extracts encrypted string from letterBlock in column-major order.
   * Precondition: letterBlock has been filled
   * Not implemented in the original AP question.
   * 
   * @return  the encrypted string from letterBlock
   */
  private String encryptBlock() {  
    String output =  "";
    for (int col = 0; col < letterBlock[0].length; col++) {
      for (int row = 0; row < letterBlock.length; row++) {
        output += letterBlock[row][col];
      }
    }
    return output;
  }
  
  /** 
   * Encrypts a message.
   * 
   * @param message  the string to be encrypted
   * @return         the encrypted message;
   *                 if message is the empty string, returns the empty string
   */
  public String encryptMessage(String message) {
    String output = "";
    int index = 0;
    while (index < message.length()) {
      String substring = "";
      if (index + numRows * numCols < message.length()) {
        substring = message.substring(index, index + numRows * numCols);
      } else {
        substring = message.substring(index);
      }
      fillBlock(substring);
      output += encryptBlock();
      index += numRows * numCols;
    }
    return output;
  }
  
  
  /** 
   * Returns a string representation of the letterBlock.
   * Not included in the original AP question.
   * 
   * @return  a string representation of the object
   */
  public String toString() {
    String output = "";
    for (String[] row : letterBlock) {
      for (String item : row) {
        output += item + "\t";
      }
      output += "\n";
    }
    return output;
  }
}