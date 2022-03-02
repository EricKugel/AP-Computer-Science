/**
 * GroupTester contains a main method to test a Group object.
 * 
 * The tester constructs four Undergrad objects, using them to
 * construct two Group objects, invokes the switchStudent and
 * toString methods (and therefore the calculateAverage method),
 * and prints the results.
 */
public class GroupTester {
  public static void main(String[] args) {
    Undergrad student1 = new Undergrad("Goldy");
    Undergrad student2 = new Undergrad("Bucky", 85);
    Undergrad student3 = new Undergrad("Thundar", 88, 94);
    Undergrad student4 = new Undergrad("Sparty", 98, 88, 92);
    
    // tests Group constructor
    Group group1 = new Group(student1, student2);
    Group group2 = new Group(student3, student4);
    
    // tests toString method (and calculateAverage method)
    System.out.println(group1);
    System.out.println(group2 + "\n");
    
    // tests switchStudent method
    group1.switchStudent(student3, student2);
    group2.switchStudent(student2, student3);
    
    System.out.println(group1);
    System.out.println(group2 + "\n");
    
    // tests switchStudent method with error
    group1.switchStudent(student4, student2);
  }
}