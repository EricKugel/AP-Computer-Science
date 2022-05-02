import java.util.ArrayList;

/**
 * A string coder stores a string that can be encoded and decoded.
 */
public class StringCoder {
  private String masterString = null;
  
  /** 
   * Stores param as masterString.
   * Precondition: the master string contains all the letters of the alphabet
   * 
   * @param master  the master string for the StringCoder
   */
  public StringCoder(String master)
  {  masterString = master;  }
  
  /** 
   * Returns the decoded string.
   * Precondition: parts.size() > 0
   * 
   * @param parts  an ArrayList of string parts that are valid in the master string
   * @return       the string obtained by concatenating the parts of the master string
   */
  public String decodeString(ArrayList<StringPart> parts) {
    String output = "";
    for (StringPart part : parts) {
      output += masterString.substring(part.getStart(), part.getStart() + part.getLength());
    }
    return output;
  }
  
  
  /** 
   * Returns a StringPart object matching the beginning of param.
   * Precondition: all of the characters in str appear in the master string;
   *               str.length() > 0
   * Not implemented in the original AP question.
   * 
   * @param str  the string to encode using the master string
   * @return     a string part in the master string that matches the beginning of str.
   *             The returned string part has length at least 1.
  //  */
  // private StringPart findPart(String str) {
  //   int i = str.length();
  //   while (i > 0) {
  //     if (masterString.indexOf(str.substring(0, i)) > -1) {
  //       return new StringPart(masterString.indexOf(str.substring(0, i)), i);
  //     }
  //     i--;
  //   }
  //   return null;
  // }
  
  /** 
   * Returns an Arraylist of StringPart objects that can be combined.
   * Precondition: all of the characters in word appear in the master string;
   *                      word.length() > 0
   * 
   * @param word  the string to be encoded
   * @return      an ArrayList of string parts of the master string that can be combined
   *              to create word
   */
  public ArrayList<StringPart> encodeString(String word) {
    ArrayList<StringPart> parts = new ArrayList<StringPart>();
    int index = 0;
    while (index < word.length()) {
      for (int length = word.substring(index).length(); length > 0; length--) {
        int masterIndex = masterString.indexOf(word.substring(index, index + length));
        if (masterIndex > -1) {
          parts.add(new StringPart(masterIndex, length));
          index += length;
          break;
        }
      }
    }
    return parts;
  }
  
  
}