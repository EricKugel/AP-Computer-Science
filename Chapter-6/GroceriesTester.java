/**
 * GroceriesTester contains a main method to test a Groceries object.
 * 
 * The tester constructs a Groceries object, invokes the addItems, removeDuplicates,
 * and removePurchasedItems methods, and prints the results via the toString method.
 */
public class GroceriesTester {
  public static void main(String[] args) {
    // tests addItems method
    String[] grocerySet1 = {"flour", "eggs", "butter", "milk", "butter"}; // note that butter is already duplicated
    Groceries spouse1 = new Groceries();
    System.out.println(spouse1.addItems(grocerySet1));
    String[] grocerySet2 = {"butter", "salt", "vanilla", "flour", "soda"}; // note that butter is now triplicated and flour is duplicated
    Groceries spouse2 = new Groceries();
    System.out.println(spouse2.addItems(grocerySet2) + "\n");
    
    // tests removeDuplicates method and toString method
    spouse1.removeDuplicates();
    System.out.println(spouse2 + "\n");
    
    // tests addItems method
    String[] grocerySet3 = {"noodles", "tomatoes", "onions"};
    System.out.println(spouse2.addItems(grocerySet3) + "\n");
    
    // tests removePurchasedItems method and toString method
    String[] purchasedSet1 = {"eggs", "vanilla", "soda", "milk", "noodles", "tomatoes"};
    spouse1.removePurchasedItems(purchasedSet1);
    System.out.println(spouse1);
    System.out.println(spouse2);
  }
}