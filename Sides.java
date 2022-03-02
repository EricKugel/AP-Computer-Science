/**
 * Sides hold data for up to four sides for a type of shape.
 * This class demonstrates constructor chaining.
 */
public class Sides {
  private String type = null;
  private double side1 = 0.0;
  private double side2 = 0.0;
  private double side3 = 0.0;
  private double side4 = 0.0;
  
  /** 
    * Default Constructor 1 initializes type.
    */
  public Sides() {
    type = "point";
  }
  
  /**
   * Constructor 2 initializes 1 parameter (type).
   * 
   * @param type  the category/name of this shape
   */
  public Sides(String type) {
    System.out.println("Constructor 2");
    this.type = type;
  }
  
  /**
   * Constructor 3 initializes 2 parameters (type, side1).
   * 
   * @param type   the category/name of this shape
   * @param side1  the first side to be initialized
   */
  public Sides(String type, double side1) {
    this(type); // calls constructor 2 with 1 parameter
    System.out.println("Constructor 3 called constructor 2");
    this.side1 = side1;
  }
  
  /**
   * Constructor 4 initializes 3 parameters (type, side1, side2).
   * 
   * @param type   the category/name of this shape
   * @param side1  the first side to be initialized
   * @param side2  the second side to be initialized
   */
  public Sides(String type, double side1, double side2) {
    this(type, side1); // calls constructor 3 with 2 parameters
    System.out.println("Constructor 4 called constructor 3");
    this.side2 = side2;
  }
  
  /**
   * Constructor 5 initializes 4 parameters (type, side1, side2, side3).
   * 
   * @param type   the category/name of this shape
   * @param side1  the first side to be initialized
   * @param side2  the second side to be initialized
   * @param side3  the third side to be initialized
   */
  public Sides(String type, double side1, double side2, double side3) {
    this(type, side1, side2); // calls constructor 4 with 3 parameters
    System.out.println("Constructor 5 called constructor 4");
    this.side3 = side3;
  }
  
  /**
   * Constructor 6 initializes 5 parameters (type, side1, side2, side3, side4).
   * 
   * @param type   the category/name of this shape
   * @param side1  the first side to be initialized
   * @param side2  the second side to be initialized
   * @param side3  the third side to be initialized
   * @param side4  the fourth side to be initialized
   */
  public Sides(String type, double side1, double side2, double side3, double side4) {
    this(type, side1, side2, side3); // calls constructor 5 with 4 parameters
    System.out.println("Constructor 6 called constructor 5");
    this.side4 = side4;
  }
  
  /**
   * Returns the first side.
   * 
   * @return  the first side
   */
  public double getSide1() {
    return side1;
  }
  
  /**
   * Returns the second side.
   * 
   * @return  the second side
   */
  public double getSide2() {
    return side2;
  }
  
  /**
   * Returns the third side.
   * 
   * @return  the third side
   */
  public double getSide3() {
    return side3;
  }
  
  /**
   * Returns the fourth side.
   * 
   * @return  the fourth side
   */
  public double getSide4() {
    return side4;
  }
  
  /**
   * Returns the type and all four sides as a string.
   * 
   * @return  a string representation of the object
   */
  public String toString() {
    return type + ", with sides " + side1 + ", " + side2 + ", " + side3 + ", " + side4;
  }
  
  // All that follows is for Exceeding Proficiency extension ----------------------------
  /**
   * Constructs a Rectangle object by passing this Sides object as the paramter, and
   * returns the Rectangle calculateArea method, if opposite sides are equal;
   *         -1.0 otherwise.
   * 
   * @return  Returns the area using the four sides to form a rectangle
   */
//  public double calculateAsRectangle() {
//    if (side1 == side3 && side2 == side4) {
//      // uses "this" to pass this Sides object as a parameter to a constructor
//      Rectangle myRectangle = new Rectangle(this);
//   
//      return myRectangle.calculateArea();
//    } else {
//      return -1.0;
//    }
//  }
  
  /**
   * Constructs a Triangle object using the default constructor, and invokes the 
   * Triangle calculateArea method by passing this Sides object as the parameter.
   * 
   * @return  the area using the first three sides to form a triangle
   */
//  public double calculateAsTriangle() {
//    Triangle myTriangle = new Triangle();    
//
//    // use "this" to pass this Sides object as a parameter to a method
//    return myTriangle.calculateArea(this);
//  }
  
}
