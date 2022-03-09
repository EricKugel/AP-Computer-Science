import java.util.ArrayList;

/**
 * Digits is a list of integers 0-9 that comprise a number.  It also includes a method
 * to analyze if the integers are strictly increasing.
 */
public class Digits {
  /** 
   * The list of digits from the number used to construct this object.
   * The digits appear in the list in the same order in which they 
   * appear in the original number.
   */
  private ArrayList<Integer> digitList;
  
  /** 
   * Constructs a Digits object that represents num.
   * Precondition: num >= 0
   * 
   * @param num  the original number to be separated into digits   
   */
  public Digits(int num) {
    digitList = new ArrayList<Integer>();
    while (num > 0) {
      digitList.add(0, num % 10);
      num /= 10;
    }
  }
  
  
  /** 
   * Return true if the digits in this Digits ogject are in strictly increasing order;
   *        false otherwise.
   * 
   * @return  true if the digits are strictly increasing;
   *          false otherwise
   */
  public boolean isStrictlyIncreasing() {
    for (int i = 0; i < digitList.size() - 1; i++) {
      if (digitList.get(i) >= digitList.get(i + 1)) {
        return false;
      }
    }
    return true;
  }

  public String toString() {
    return digitList.toString();
  }
}