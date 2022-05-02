/**
 * A fuel tank measures the fuel being held as a percentage of the total.
 */
public class FuelTank {
  private int fuelLevel = 0;
  
  /** 
   * Constructs a FuelTank object by initializing fuel level.
   * Not included in the original AP question.
   * 
   * @param aFuelLevel  the initial percent of fuel in the tank
   */
  public FuelTank(int aFuelLevel) {
    fuelLevel = aFuelLevel;
  }
  
  /** 
   * Adds fuel to the tank.
   * Not included in the original AP question.
   * 
   * @param amount  the percent of fuel to add
   */
  public void addFuel(int amount) {
    fuelLevel += amount;
  }
  
  /** 
   * Returns the fuel level as a percentage.
   * 
   * @return  an integer value that ranges from 0 (empty) to 100 (full)
   */
  public int getFuelLevel() {
    return fuelLevel;
  }
  
}