public class Volunteer extends StaffMember {
  // no new instance variables
  
  /**
   * Constructs a Volunteer object.
   * 
   * @param name     the name of this employee
   * @param address  the home address of this employee
   * @param phone    the primary phone number of this employee, entered as a string
   */
  public Volunteer(String name, String address, String phone) {
    super(name, address, phone);
  }
  
  /**
   * Returns the pay for the current pay period for this volunteer, which is $0.
   * Implements abstract method from StaffMember.
   * 
   * @return  the pay for the current pay period for this volunteer, which is $0
   */
  public double pay() {
    return 0.0;
  }
  
}
    