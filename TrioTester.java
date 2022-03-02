public class TrioTester {
  public static void main(String[] args) {
    Sandwich cheeseburger = new Sandwich("Cheeseburger", 2.75);
    Sandwich clubSandwich = new Sandwich("Club Sandwich", 2.75);
    Salad spinachSalad = new Salad("Spinach Salad", 1.25);
    Salad coleslaw = new Salad("Coleslaw", 1.25);
    Drink orangeSoda = new Drink("Orange Soda", 1.25);
    Drink cappuccino = new Drink("Cappuccino", 3.5);
    
    // Test constructor
    Trio trio1 = new Trio(cheeseburger, spinachSalad, orangeSoda);
    Trio trio2 = new Trio(clubSandwich, coleslaw, cappuccino);
    
    // Test getName method
    System.out.println(trio1.getName());  // Should be: Cheeseburger/Spinach Salad/Orange Soda Trio
    System.out.println(trio2.getName());  // Should be: Club Sandwich/Coleslaw/Cappuccino Trio
    
    // Test getPrice method
    System.out.println(trio1.getPrice());  // Should be: 4.0
    System.out.println(trio2.getPrice());  // Should be: 6.25
  }
}