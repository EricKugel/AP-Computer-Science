/**
 * QuadTester contains a main method to test various objects that are quadrilaterals.
 * 
 * The tester constructs these objects, invokes the calcArea, calcPerimeter, equals,
 * calcDiagonal, and toString methods (where applicable), and prints the results.
 */
public class QuadTester {
  public static void main(String[] args) {    
    Parallelogram para1 = new Parallelogram(10, 5, 4); // base, slant height, height
    Parallelogram para2 = new Parallelogram(10, 5, 4);
    System.out.println("Parallelogram\nArea: " + para1.calcArea());
    System.out.println("Perimeter: " + para1.calcPerimeter());
    System.out.println(para1.equals(para2)); // Returns false
    System.out.println(para1 + "\n");
    
    Rectangle rect1 = new Rectangle(10, 5); // base, height
    Rectangle rect2 = new Rectangle(5, 10);
    System.out.println("Rectangle\nArea: " + rect1.calcArea());
    System.out.println("Perimeter: " + rect1.calcPerimeter());
    System.out.println("Diagonal: " + rect1.calcDiagonal());
    System.out.println(rect1.equals(rect2)); // Returns true
    System.out.println(rect1 + "\n");
    
    Trapezoid trap1 = new Trapezoid(10, 5, 15, 4.47, 4);
          // base1, slant height1, base2, slant height2, height
    Trapezoid trap2 = new Trapezoid(10, 5, 15, 4.47, 4);
    System.out.println("Trapezoid\nArea: " + trap1.calcArea());
    System.out.println("Perimeter: " + trap1.calcPerimeter());
    System.out.println(trap1.equals(trap2)); // Returns false
    System.out.println(trap1 + "\n");
    
    IsosTrapezoid iTrap1 = new IsosTrapezoid(4, 5, 12, 4); // base1, slant height, base2, height
    IsosTrapezoid iTrap2 = new IsosTrapezoid(4, 5, 12, 4);
    System.out.println("Isosceles Trapezoid\nArea: " + iTrap1.calcArea());
    System.out.println("Perimeter: " + iTrap1.calcPerimeter());
    System.out.println("Diagonal: " + iTrap1.calcDiagonal());
    System.out.println(iTrap1.equals(iTrap2)); // Returns true
    System.out.println(iTrap1);
  }
}