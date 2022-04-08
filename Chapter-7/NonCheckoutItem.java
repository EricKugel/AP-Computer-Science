/**
 * A non-checkout item is a reading material that cannot be checked out, but must
 * stay in the library.
 */
public class NonCheckoutItem extends ReadingMaterial {
  // no additional variables
  
  /**
   * Constructs a non-checkout item.
   * 
   * @param author     the author of this item
   * @param title      the title of this item
   * @param publisher  the publisher of this item
   * @param numPages   the number of pages of this item, if applicable
   * @param condition  the condition of this item
   */
  public NonCheckoutItem(String author, String title, String publisher, int numPages, String condition) {
    super(author, title, publisher, numPages, condition);
  }
  
  /**
   * Designates that this reading matierial is not available for check out.
   * Implements the abstract method in the ReadingMaterial class.
   * 
   * @param holder  the id number of the person attempting to check out this reading material
   */
  public void checkOut(int holder) {
    System.out.println("This item is not available for check out.");
  }

}
  
  