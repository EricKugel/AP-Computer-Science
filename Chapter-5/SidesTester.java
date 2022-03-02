/**
 * SidesTester contains a main method to test objects that have sides.
 * 
 * The tester constructs three Sides objects, invokes the toString,
 * calculateAsRectangle, calculateAsTriangle methoda, and prints the results.
 */
public class SidesTester {
  public static void main(String[] args) {
    Sides myLine = new Sides("line", 5.2);
    System.out.println("Sides created with two parameters: " + myLine + "\n");
    
    Sides myTriangle = new Sides("triangle", 5, 12, 13);
    System.out.println("Sides created with four parameters: " + myTriangle + "\n");
    
    Sides myRectangle = new Sides("rectangle", 3.6, 7.1, 3.6, 7.1);
    System.out.println("Sides created with five parameters: " + myRectangle + "\n");
    
    // All that follows is for Exceeding Proficiency extension ----------------------------
//    System.out.println(myRectangle.calculateAsRectangle() + "\n");
    
//    System.out.println(myTriangle.calculateAsTriangle());
  }
}