import java.util.List;
import java.util.ArrayList;

/**
 * A master order contains a list of all of the cookie orders taken,
 * as well as methods to modify and summarize this list. 
 */
public class MasterOrder {
  /** The list of all cookie orders */
  private List<CookieOrder> orders;
  
  /** Constructs a new MasterOrder object. */
  public MasterOrder() {
    orders = new ArrayList<CookieOrder>();
  }
  
  /**
   * Adds theOrder to the master order.
   * 
   * @param theOrder  the cookie order to add to the master order
   */
  public void addOrder(CookieOrder theOrder)
  {  orders.add(theOrder);  }
  
  /** 
   * Returns the sum of the number of boxes of all the cookie orders.
   * 
   * @return  the sum of the number of boxes of all of the cookie orders
   */
  public int getTotalBoxes() {
    int totalBoxes = 0;
    for (CookieOrder order : orders) {
      totalBoxes += order.getNumBoxes();
    }
    return totalBoxes;
  }
  
  
  /** 
   * Removes all cookie orders from the master order that have the same variety of
   * cookie as cookieVar and returns the total number of boxes that were removed.
   * 
   * @param cookieVar  the variety of cookies to remove from the master order
   * @return           the total number of boxes of cookieVar in the cookie orders removed
   */
  public int removeVariety(String cookieVar) {
    int removed = 0;
    for (int orderIndex = 0; orderIndex < orders.size(); orderIndex++) {
      if (orders.get(orderIndex).getVariety().equals(cookieVar)) {
        orders.remove(orderIndex);
        orderIndex -= 1;
        removed += 1;
      }
    }
    return removed;
  }
  
  
  /** 
   * Returns a string representation of object.
   * Not included in the original AP question.
   * 
   * @return  a string representation of the object
   */
  public String toString() {
    String output = "";
    for (CookieOrder item : orders) {
      output += item.getVariety() + ": " + item.getNumBoxes() + "\t";
    }
    return output;
  }
}