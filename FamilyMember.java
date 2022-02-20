public class FamilyMember {
  // Instance variables.
  private String firstName = null;
  private String lastName = null;
  
  // Static (class) variables.
  private static Address location = null;
  private static double totalSavings = 0.0;
  
  /** Constucts a Student object by storing all parameters as instance variables. */
  public FamilyMember(String firstName, String lastName, Address location, Account ledger) {
    this.firstName = firstName;
    this.lastName = lastName;
    if (this.location == null) {
      this.location = location;
    }
    if (ledger != null) {
      this.totalSavings += ledger.getBalance();
    }
  }
  
  
  /** Returns first name. */
  public String getFirstName() {
    return firstName;
  }
  
  /** Sets first name. */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  /** Returns last name. */
  public String getLastName() {
    return lastName;
  }
  
  /** Sets last name. */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  /** Returns location. */
  public Address getLocation() {
    return location;
  }
  
  /** Sets location. */
  public void setLocation(Address location) {
    this.location = location;
  }
  
  /** Returns all family members' net worth. */
  public double getTotalSavings() {
    return totalSavings;
  }
  
  /** Returns a string representation of the object. */
  public String toString() {
    String result = firstName + " " + lastName + "\n";
    result += location + "\n";
    result += "Family total savings: " + totalSavings;
    return result;
  }  
}