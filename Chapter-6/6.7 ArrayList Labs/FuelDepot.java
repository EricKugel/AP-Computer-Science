import java.util.List;
import java.util.ArrayList;

/**
 * A fuel depot has a fuel robot to monitor and fill fuel tanks.
 */
public class FuelDepot {
  /** The robot used to move the filling mechanism. */
  private FuelRobot filler;
  
  /** The list of fuel tanks. */
  private List<FuelTank> tanks;
  
  /** 
   * Constructs a FuelDepot object by instantiating the FuelRobot and ArrayList
   * of FuelTanks and adding all elements of param to ArrayList of FuelTanks.
   * Not included in the original AP question.
   * 
   * @param tanksArray  an int array with the inital percentage fill for each tank
   */
  public FuelDepot(int[] tanksArray) {
    filler = new FuelRobot(2, true);
    this.tanks = new ArrayList<>();
    for (int i = 0; i < tanksArray.length; i++) {
      this.tanks.add(new FuelTank(tanksArray[i]));
    }
  }
  
  /** 
   * Determines and returns the index of the next tank to be filled.
   * Postcondition: the state of the robot has not changed
   * 
   * @param threshold  fuel tanks with a fuel level <= threshold may be filled
   * @return           index of the location of the next tank to be filled
   */
  public int nextTankToFill(int threshold) {
    int lowestIndex = filler.getCurrentIndex();
    int lowestLevel = Integer.MAX_VALUE;
    for (int i = 0; i < tanks.size(); i++) {
      FuelTank tank = tanks.get(i);
      if (tank.getFuelLevel() < threshold && tank.getFuelLevel() < lowestLevel) {
        lowestLevel = tank.getFuelLevel();
        lowestIndex = i;
      }
    }
    return lowestIndex;
  }
  
  
  /** 
   * Calculates and fills a tank to a given threshold.
   * 
   * @param index      the tank to be filled
   * @param threshold  the percent to fill to
   */
  public void fillTankToThreshold(int index, int threshold) {
    tanks.get(index).addFuel(threshold - tanks.get(index).getFuelLevel());
  }
  
  /** 
   * Moves the robot to location locIndex.
   * Precondition: 0 <= locIndex <  tanks.size()
   * Postcondition: the current location of the robot is locIndex
   * 
   * @param locIndex  the index of the location of the tank to move to
   */
  public void moveToLocation(int locIndex) {
    if (locIndex > filler.getCurrentIndex() != filler.isFacingRight()) {
      filler.changeDirection();
    }
    filler.moveForward(Math.abs(filler.getCurrentIndex() - locIndex));
  }
  
  
  /** 
   * Returns a string denoting the fuel level of each fuel tank, as well as
   * the position and direcion of the fuel robot.
   * Not included in the original AP question.
   * 
   * @return  a string representation of the object
   */
  public String toString() {
    String output = "";
    for (FuelTank item : tanks) {
      output += item.getFuelLevel() + "\t";
    }
    output += "\nRobot Status: " + filler.toString() + "\n";
    return output;
  }
}