/************************************************
 * Name: Eric Kugel
 ************************************************/

import java.util.ArrayList;

/**
 * A groceries object is a shared list of items that can be amended to remove duplicate
 * items and purchased items.
 */
public class Groceries {
  /** The list of groceries shared between users. */
  public static ArrayList<String> sharedList = new ArrayList<String>();
  
  /**
   * Adds elements of array param to shared list.
   * 
   * @param moreItems  the String array elements to be added
   * @return           the updated String ArrayList
   */
  public ArrayList<String> addItems(String[] moreItems) {
    for (String item : moreItems) {
      sharedList.add(item);
    }
    return sharedList;
  }
  
  
  /**
   * Removes any duplicate items so that there is only one instance of each value in the list.
   */
  public void removeDuplicates() {
    for (int i = 0; i < sharedList.size(); i++) {
      for (int j = i + 1; j < sharedList.size(); j++) {
        if (sharedList.get(i).equals(sharedList.get(j))) {
          sharedList.remove(j);
          j--;
        }
      }
    }
  }
  
  
  /**
   * Removes elements of array param from shared list.
   * 
   * @param purchasedItems  the String array elements to be removed
   */
  public void removePurchasedItems(String[] purchasedItems) {
    for (int i = 0; i < sharedList.size(); i++) {
      for (String item : purchasedItems) {
        if (sharedList.get(i).equals(item)) {
          sharedList.remove(i);
          i--;
          break;
        }
      }
    }
  }
    
  
  /**
   * Returns a string representation of the object.
   * 
   * @return  a string representation of the object
   */
  public String toString() {
    String output = "";
    for (String item : sharedList) {
      output += item + "* ";
    }
    return output;
  }
  
  
}