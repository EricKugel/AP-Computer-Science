/**
 * TwoDArrayTester contains a main method to test a TwoDArray object.
 * 
 * The tester constructs a TwoDArray object, invokes the transpose
 * and toString methods, and prints the results.
 */
public class TwoDArrayTester {
  public static void main(String[] args) {
    TwoDArray myArray = new TwoDArray(4, 6, 1, 3);
    System.out.println(myArray);
    
    myArray.transpose();
    System.out.println(myArray);
  }
}