/**
 * A staff member is a person who is employed with others in the same organization.
 */
public abstract class StaffMember {
  private String name = null;
  private String address = null;
  private String phone = null;
  
  /**
   * Constructor to be used by subclasses.
   * 
   * @param name     the name of this employee
   * @param address  the home address of this employee
   * @param phone    the primary phone number of this employee, entered as a string
   */  
  public StaffMember (String name, String address, String phone) {
    this.name = name;
    this.address = address;
    this.phone = phone;
  }
  
  /**
   * Returns the pay for the current pay period for this staff member.
   * Abstract method to be implemented in subclass(es).
   * 
   * @return  the pay for the current pay period for this staff member
   */
  public abstract double pay();
  
  /**
   * Returns a string containing name, address, and phone number of this employee.
   * Overrides the toString method from Object.
   * 
   * @return  a string representation of the object
   */
  @Override
  public String toString() {
    String result = "Name: " + name + "\n";
    result += "Address: " + address + "\n";
    result += "Phone: " + phone;
    return result;
  }
  
}