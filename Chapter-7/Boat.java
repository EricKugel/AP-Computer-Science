/**
 * A boat is a recreational vehicle that is distinguished by its horsepower quality.
 */
public class Boat extends RecVehicle {
  private int horsepower = -1;
  
  /**
   * Constructs a Boat object by setting instance variable values.
   *
   * @param name        the brand/model of this boat
   * @param cost        the list price of this boat
   * @param inventory   the number this boat on the lot
   * @param horsepower  the motor's horsepower
   */
  public Boat(String name, double cost, int inventory, int horsepower) {
    super(name, cost, inventory);
    this.horsepower = horsepower;
  }
  
  /**
   * Accounts for all inventory being sold off.
   */
  @Override
  public String getName() {
    return "Not Applicable";
  }
  
  /**
   * Accounts for all inventory being "New".
   * 
   * @param name  the revised name of this boat
   */
  public void setName(String name) {
    super.setName("New " + name);
  }
  
  /**
   * Returns the horsepower of this boat's motor
   * 
   * @return  the horsepower of this boat's motor
   */
  public int getHorsepower() {
    return horsepower;
  }
  
  /**
   * Revises the horsepower of this boat.  To be used if motor is changed.
   * 
   * @param horsepower  the new horsepower value
   */
  public void setHorsePower(int horsepower) {
    this.horsepower = horsepower;
  }
  
  /**
   * Returns the total amount of horsepower for all of this type of boat on the lot.
   * 
   * @return the total amount of horsepower for all of this type of boat on the lot.
   */
  public int totalHorsepower() {
    return this.getInventory() * this.getHorsepower();
  /*  The following would also work:
   *  return super.getInventory() * this.getHorsepower();
   *  return getInventory() * getHorsepower(); */
  }
  
  /**
   * Returns a string containing name, cost, inventory, and horsepower of this boat.
   *
   * @return  a string representation of the object
   */
  public String toString() {
    String output = super.toString();
    output += ", horsepower: " + horsepower;
    return output;
  }
}