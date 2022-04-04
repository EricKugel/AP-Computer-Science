/**
 * An hourly employee is paid by the hour.
 */
public class Hourly extends Employee {  
  private int hoursWorked = -1;
  
  /**
   * Constructs an Hourly object.
   * 
   * @param name          the name of this employee
   * @param address       the home address of this employee
   * @param phone         the primary phone number of this employee, entered as a string
   * @param socialSecNum  the social security number of this employee, entered as a string
   * @param payRate       the hourly rate of pay of this employee
   */
  public Hourly(String name, String address, String phone, String socialSecNum, double payRate) {
    super(name, address, phone, socialSecNum, payRate);
    hoursWorked = 0; // always starts at zero hours
  }
  
  /**
   * Returns the total pay for the current pay period for this hourly worker.
   * Overrides pay method from Employee.
   * 
   * @return  the total pay for the current pay period for this hourly worker
   */
  @Override
  public double pay() {
    double payment = super.pay() * hoursWorked;
    hoursWorked = 0;
    return payment;
  }
  
  /**
   * Adds more hours to the hours (already) worked.
   * 
   * @param moreHours  the additional hours worked
   */
  public void addHours (int moreHours) {
    hoursWorked = hoursWorked + moreHours;
  }
  
  /**
   * Returns a string containing name, address, phone number, social security number,
   * and hours worked for this employee.
   * Overrides the toString method from Employee.
   * 
   * @return  a string representation of the object
   */
  @Override
  public String toString() {
    String result = super.toString();
    result += "\nCurrect hours: " + hoursWorked;
    return result;
  }
  
}