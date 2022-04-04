/**
 * An executive is an employee who has charge over other employees and may be rewarded with a bonus.
 */
public class Executive extends Employee {
  private double bonus = -1;
  
  /**
   * Constructs an Executive object.
   *
   * @param name          the name of this employee
   * @param address       the home address of this employee
   * @param phone         the primary phone number of this employee, entered as a string
   * @param socialSecNum  the social security number of this employee, entered as a string
   * @param payRate       the hourly rate of pay of this employee
   */
  public Executive (String name, String address, String phone, String socialSecNum, double payRate) {
    super (name, address, phone, socialSecNum, payRate);
    bonus = 0; // bonus hasn't been awarded yet
  }
  
  /**
   * Awards a bonus.
   * 
   * @param bonus  the amount to be given as a bonus at the end of the year
   */
  public void awardBonus(double bonus) {
    this.bonus = bonus;
  }
  
  /**
   * Returns the pay for the current pay period for this executive, including the bonus, if applicable.
   * Overrides the pay method from Employee.
   * 
   * @return  the pay for the current pay period for this executive, including the bonus, if applicable
   */
  @Override
  public double pay() {
    double payment = super.pay() + bonus;
    bonus = 0; // bonus is a one time payment, and is reset after payment
    return payment;
  }
  
}