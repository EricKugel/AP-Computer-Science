/**
 * MyEmployees contains a main method to simulate the use of classes that extend the StaffMember class.
 * 
 * The method constructs Executive, Employee, and Hourly staff members, invokes the addHours, pay,
 * awardBonus, and toString methods, and prints the results.
 */
public class MyEmployees {
  public static void main(String[] args) {
    // creates an executive
    // note that the reference variable's type is of the superclass of the superclass of the actual object
    StaffMember m = new Executive("Michael Scott", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
    
    // awards a bonus to m
    // Option 1
//    m.awardBonus(500.00);
    // Option 2
//    ((Executive) m).awardBonus(500.00);
    
    // creates an employee and an hourly worker
    // note that the reference variable's type is of the superclass of the actual object
    StaffMember d = new Employee("Dwight Schrute", "Shrute Farms", "123-9475", "012-34-5729", 1000.34);
    // note that the reference variable's type is of the superclass of the superclass of the actual object
    StaffMember r = new Hourly("Ryan Howard", "253 S Lane", "243-9284", "923-41-0394", 11.50);
    
    // adds hours for r
    // Option 1
//    r.addHours(4);
    // Option 2
//    ((Hourly) r).addHours(4);
    
    // calculates payments
    double payForM = m.pay();
    double payForD = d.pay();
    double payForR = r.pay();
    
    // prints out staff info and payments
    System.out.println(m);
    System.out.println("Payment: " + payForM);
    System.out.println("-------------------------------\n");
    
    System.out.println(d);
    System.out.println("Payment: " + payForD);
    System.out.println("-------------------------------\n");
    
    System.out.println(r);
    System.out.println("Payment: " + payForR);
    System.out.println("-------------------------------\n");
  }
  
}