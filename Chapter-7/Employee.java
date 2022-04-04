/**
 * An employee is a staff member who gets paid.
 */
public class Employee extends StaffMember {
  private String socialSecNum = null;
  private double payRate = -1;
  
  /**
   * Constructs an Employee object.
   *
   * @param name          the name of this employee
   * @param address       the home address of this employee
   * @param phone         the primary phone number of this employee, entered as a string
   * @param socialSecNum  the social security number of this employee, entered as a string
   * @param payRate       the rate of pay for current pay period of this employee, may be per two-week cycle
   *                      or per hour
   */
  public Employee(String name, String address, String phone, String socialSecNum, double payRate) {
    super(name, address, phone);
    this.socialSecNum = socialSecNum;
    this.payRate = payRate;
  }
  
  /**
   * Returns the pay for the current pay period for this employee.
   * Implements abstract method from StaffMember.
   * 
   * @return  the pay for the current pay period for this employee
   */
  public double pay() {
    return payRate;
  }
  
  /**
   * Returns a string containing name, address, phone number, and social security number
   * of this employee.
   * Overrides the toString method from StaffMember.
   * 
   * @return  a string representation of the object
   */
  @Override
  public String toString() {
    String result = super.toString();
    result += "\nSocial Security Number: " + socialSecNum;
    return result;
  }
  
}