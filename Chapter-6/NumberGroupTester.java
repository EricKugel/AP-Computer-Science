/**
 * NumberGroupTester contains a main method to test classes that implement the
 * NumberGroup interface, namely the Range and MultipleGroups classes.
 * 
 * The tester constructs and fills Range and MultipleGroups objects, invokes the 
 * contains method, and prints the results.
 */
public class NumberGroupTester {
  public static void main(String[] args) {
    // tests Range constructor
    NumberGroup range1 = new Range(-3, 2);
    
    // tests Range contains method                    should return:
    System.out.println(range1.contains(-5));       // false
    System.out.println(range1.contains(0));        // true
    System.out.println(range1.contains(2) + "\n"); // true
    
    // tests MultipleGroups contains method
    MultipleGroups multiple1 = new MultipleGroups();
    multiple1.addGroup(new Range(5, 8));
    multiple1.addGroup(new Range(10, 12));
    multiple1.addGroup(new Range(1, 6));
                                                   // should return:
    System.out.println(multiple1.contains(2));     // true
    System.out.println(multiple1.contains(9));     // false
    System.out.println(multiple1.contains(6));     // true
  }
}