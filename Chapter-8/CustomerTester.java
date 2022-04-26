/**
 * CustomerTester contains a main method to test a Customer object.
 * 
 * The tester constructs three Customer objects, prints the results of 
 * invoking the compareCustomer method, instantiates and fills two arrays
 * with Customer objects, invokes the prefixMerge method, and prints 
 * the results via the toString method.
 */
public class CustomerTester {
  public static void main(String[] args) {
    // tests compareCustomer method for part (a)
    Customer c1 = new Customer("Smith", 1001);
    Customer c2 = new Customer("Anderson", 1002);
    Customer c3 = new Customer("Smith", 1003);
    System.out.println(c1.compareCustomer(c1));
    System.out.println(c1.compareCustomer(c2));
    System.out.println(c1.compareCustomer(c3) + "\n");
    
    // tests prefixMerge method for part (b)
    Customer[] array1 = {new Customer("Arthur", 4920), new Customer("Burton", 3911),
                         new Customer("Burton", 4944), new Customer("Franz", 1692),
                         new Customer("Horton", 9221), new Customer("Jones", 5554),
                         new Customer("Miller", 9360), new Customer("Nguyen", 4339)};
    
    Customer[] array2 = {new Customer("Aaron", 1729), new Customer("Baker", 2921),
                         new Customer("Burton", 3911), new Customer("Dillard", 6552),
                         new Customer("Jones", 5554), new Customer("Miller", 9360),
                         new Customer("Noble", 3335)};
        
    Customer[] result = {null, null, null, null, null, null};
    Customer.prefixMerge(array1, array2, result);
    
    for (Customer item : result) {
      System.out.println(item + "   ");
    }
  }
  
}