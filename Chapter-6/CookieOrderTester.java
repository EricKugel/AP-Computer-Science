/**
 * CookieOrderTester contains a main method to test a MasterOrder of CookieOrder objects.
 *
 * The tester constructs a MasterOrder object, invokes the addOrder, getTotalBoxes, 
 * and removeVariety methods, and prints the results using the toString method.
 */
public class CookieOrderTester {
  public static void main(String[] args) {
    MasterOrder goodies = new MasterOrder();
    goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
    goodies.addOrder(new CookieOrder("Shortbread", 5));
    goodies.addOrder(new CookieOrder("Macaroon", 2));
    goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
    
    // Output: All: 11   Chocolate Chip: 1   Shortbread: 5       Macaroon: 2         Chocolate Chip: 3
    System.out.println("All: " + goodies.getTotalBoxes() + "\t" + goodies + "\n"); 
    
    // Output: 2
    System.out.println(goodies.removeVariety("Chocolate Chip"));
    // Output: All: 7    Shortbread: 5       Macaroon: 2 
    System.out.println("All: " + goodies.getTotalBoxes() + "\t" + goodies + "\n"); 
    
    // Output: 0
    System.out.println(goodies.removeVariety("Brownie"));
    // Output: All: 7    Shortbread: 5       Macaroon: 2
    System.out.println("All: " + goodies.getTotalBoxes() + "\t" + goodies + "\n");
    
    goodies.addOrder(new CookieOrder("Macaroon", 3));
    goodies.addOrder(new CookieOrder("Macaroon", 4));
    goodies.addOrder(new CookieOrder("Shortbread", 6));
    
    // Output: All: 20   Shortbread: 5       Macaroon: 2         Macaroon: 3         Macaroon: 4       Shortbread: 6 
    System.out.println("All: " + goodies.getTotalBoxes() + "\t" + goodies + "\n"); 
    
    // Output: 3
    System.out.println(goodies.removeVariety("Macaroon")); 
    // Output: All: 11   Shortbread: 5       Shortbread: 6 
    System.out.println("All: " + goodies.getTotalBoxes() + "\t" + goodies + "\n");
  }
}