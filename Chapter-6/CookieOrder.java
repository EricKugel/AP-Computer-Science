/**
 * A cookie order contains a number of boxes of a specific variety of cookies.
 */
public class CookieOrder {
  private String variety = null;
  private int numBoxes = -1;
  
  /**
   * Constructs a CookieOrder object.
   * Not included in the original AP question.
   * 
   * @param variety   the type of cookie
   * @param numBoxes  the number of boxes ordered
   */
  public CookieOrder(String variety, int numBoxes) {
    this.variety = variety;
    this.numBoxes = numBoxes;
  }
  
  /** 
   * Returns the variety of cookie being ordered.
   * 
   * @return  the variety of cookie being ordered
   */
  public String getVariety() {
    return variety;
  }
  
  /**
   * Returns the number of boxes being ordered.
   * 
   * @return  the number of boxes being ordered
   */
  public int getNumBoxes() {
    return numBoxes;
  }
}