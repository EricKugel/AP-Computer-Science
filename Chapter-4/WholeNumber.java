/**
 * A whole number is an int greater than 0.  This whole number can be
 * tested for divisibility by other integers.
 */
public class WholeNumber {
  // instance variable
  private int wholeNum = 0;
  
  /** 
   * Constructs a WholeNumber object by initialiizing the instance variable to the parameter.
   * 
   * @param number  the initial value of this whole number
   */
  public WholeNumber(int number) {
    wholeNum = number;
  }
  
  /**
   * Returns the value of this whole number.
   * 
   * @return  the value of this whole number
   */
  public int getWholeNum() {
    return wholeNum;
  }
  
  /**
   * Sets new value of this whole number
   * 
   * @param  the new value of this whole number
   */
  public void setWholeNum(int number) {
    wholeNum = number;
  }
  
  /**
   * Determines if this whole number is evenly divisible by param.
   * 
   * @param otherNum  the integer which this whole number is divided by
   * @return          true if wholeNum is divisible by otherNum;
   *                  false otherwise
   */
  public boolean isDivisible(int otherNum) {
    if (wholeNum % otherNum == 0) {
      return true;
    } else {
      return false;
    }
    // The entire body could be condensed to: 
    // return wholeNum % otherNum == 0;
  }
  
  /** 
   * Determines if this whole number is evenly divisible by both params.
   * 
   * @param otherNum1  the first integer which this whole number is divided by
   * @param otherNum2  the second integer which this whole number is divided by
   * @return           true if wholeNum is divisible by otherNum1 and otherNum2;
   *                   false otherwise.
   */
  public boolean isDivisible(int otherNum1, int otherNum2) {
    if (wholeNum % otherNum1 == 0 && wholeNum % otherNum2 == 0) {
      return true;
    } else {
      return false;
    }
    // The entire body could be condensed to: 
    // return isDivisible(otherNum1) && isDivisible(otherNum2);
  }
  
  /**
   * Returns the value of this whole number as a string.
   * 
   * @return a string representation of the object
   */
  public String toString() {
    return "My whole number is " + wholeNum;
  }
  
}