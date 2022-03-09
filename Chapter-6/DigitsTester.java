/**
 * DigitsTester contains a main method to test Digits objects.
 * 
 * The tester constructs multiple Digits objects, invokes the isStrictlyIncreasing method, and prints the results.
 */
public class DigitsTester {
  public static void main(String[] args) {
    Digits d1 = new Digits(15704);
    Digits d2 = new Digits(0);
    
    // Optional: write a toString method that displays the contents of a Digit object
    // Use the following println statements to test the toString method and the constructor
   System.out.println(d1);
   System.out.println(d2 + "\n");
    
    // tests the isStrictlyIncreasing method
    System.out.println(new Digits(7).isStrictlyIncreasing());
    System.out.println(new Digits(1356).isStrictlyIncreasing());
    System.out.println(new Digits(1336).isStrictlyIncreasing());
    System.out.println(new Digits(1536).isStrictlyIncreasing());
    System.out.println(new Digits(65310).isStrictlyIncreasing());
  }
}