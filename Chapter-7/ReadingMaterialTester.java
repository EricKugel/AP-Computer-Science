/**
 * ReadingMaterialTester contains a main method to test objects that inherit from ReadingMaterial.
 * 
 * The tester constructs these objects, invokes the findIfCheckedOut, return item, and checkOut
 * methods, and prints the results.
 */
public class ReadingMaterialTester {
  public static void main(String[] args) {
    ReadingMaterial one = new NonCheckoutItem("Mr. Dirks", "APCS", "Mayo High School Press", 100111010, "New");
    one.checkOut(2212); // should print a message stating that it is not available to be checked out
    System.out.println(one + "\n");
    
    ReadingMaterial two = new CheckoutItem("Lewis, et. al.", "Java Software Solutions", "Addison-Wesley", 636, "Like New");
    two.checkOut(2212);
    ((CheckoutItem) two).isCheckedOut();
    two.checkOut(2104); // should print a message stating that it is already checked out
    System.out.println(two + "\n");
    
    ((CheckoutItem) two).returnItem();    
    ((CheckoutItem) two).isCheckedOut(); // should NOT print a message stating that it is already checked out
    System.out.println(two + "\n");

    Shelf shelf = new Shelf(new ReadingMaterial[] {one, two, two});
    System.out.println(shelf);
  }
}