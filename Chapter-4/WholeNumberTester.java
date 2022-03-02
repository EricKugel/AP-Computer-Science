/**
 * WholeNumberTester contains a main method to test WholeNumber objects.
 * 
 * The tester constructs two WholeNumber objects, invokes the isDivisible
 * and toString methods, and prints the results.
 */
public class WholeNumberTester {
  public static void main(String[] args) {
    // Tests constructor.
    WholeNumber myNum = new WholeNumber(40);
    
    // Tests both isDivisible methods.
    System.out.println(myNum.isDivisible(8));                      // Returns true
    System.out.println(myNum.isDivisible(7));                      // Returns false
    System.out.println(myNum.isDivisible(8, 7) + "\n");            // Returns false
    
    // Tests setter method.
    myNum.setWholeNum(56);
    
    // Tests both isDivisible methods.
    System.out.println(myNum.isDivisible(8));                      // Returns true
    System.out.println(myNum.isDivisible(7));                      // Returns true
    System.out.println(myNum.isDivisible(8, 7) + "\n");            // Returns true
    
    // Tests toString method.
    System.out.println(myNum);                                     // Prints "My whole number is 56"
    
    // Tests constructor with a second object.
    WholeNumber yourNum = new WholeNumber(100);
    
    // Tests isDivisible and getWholeNum methods.
    System.out.println(yourNum.isDivisible(myNum.getWholeNum()));  // Returns false
  }
}
    