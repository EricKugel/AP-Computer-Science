/**
 * A quadrilateral is a four-sided figure.
 */
public abstract class Quadrilateral {
  private double perimeter = 0;
  private double a = 0; // Side a
  private double b = 0; // Side b
  private double c = 0; // Side c
  private double d = 0; // Side d
  
  /**
   * Constructor to be used by subclasses.
   * 
   * @param a  side a of this quadrilateral
   * @param b  side b of this quadrilateral
   * @param c  side c of this quadrilateral
   * @param d  side d of this quadrilateral
   */
  public Quadrilateral(double a, double b, double c, double d) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
  }
  
  /**
   * Returns side a of this quadrilateral.
   * 
   * @return  side a of this quadrilateral
   */
  public double getA() {
    return a;
  }
  
  /**
   * Returns side b of this quadrilateral.
   * 
   * @return  side b of this quadrilateral
   */
  public double getB() {
    return b;
  }
  
  /**
   * Returns side c of this quadrilateral.
   * 
   * @return  side c of this quadrilateral
   */
  public double getC() {
    return c;
  }
  
  /**
   * Returns side d of this quadrilateral.
   * 
   * @return  side d of this quadrilateral
   */
  public double getD() {
    return d;
  }
  
  /**
   * Returns the sum of sides a, b, c, and d of this quadrilateral.
   * 
   * @return  the perimeter of this quadrilateral
   */
  public double calcPerimeter() {
    perimeter = a + b + c + d;
    return perimeter;
  }
  
  /**
   * Returns the area of this quadrlateral.  To be implemented according to the
   * type of quadrilateral extending this class.
   * 
   * @return  the area of this quadrilateral
   */
  public abstract double calcArea();

}