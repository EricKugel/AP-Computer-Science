/**
 * SurfaceAreaTester contains a main method to test SurfaceArea objects and class methods.
 * 
 * The tester constructs three SurfaceArea objects, invokes the addTriangleArea,
 * addRectangleArea, and toString methods, and prints the results.
 */
public class SurfaceAreaTester {
  public static void main(String[] args) {
    SurfaceArea triangle = new SurfaceArea(3, 4);
    SurfaceArea rectangle = new SurfaceArea(3, 5);
    
    // adds areas of four triangles and four rectangles that 
    // form the lateral area of the shape
    for (int i = 0; i < 4; i++) {
      triangle.addTriangleArea();
      System.out.println(triangle);
      rectangle.addRectangleArea();
      System.out.println(rectangle);
    }
    
    SurfaceArea square = new SurfaceArea(3, 3);
    // adds area of the base
    square.addRectangleArea();
    System.out.println("\n" + square);
    
    System.out.println("\n" + SurfaceArea.getTotalArea());
  }
}