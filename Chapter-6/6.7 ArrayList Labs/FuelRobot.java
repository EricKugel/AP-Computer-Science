/**
 * A fuel robot fills fuel tanks based on the location and direction it is facing.
 */
public class FuelRobot {
  private int index = -1;
  private boolean facingRight = false;
  
  /** 
   * Constructs a FuelRobot object by initializing the index of the robot and the
   * direction it is facing.
   * Not included in the original AP question.
   * 
   * @param anIndex       the tank index where the robot starts
   * @param aFacingRight  true if facing right
   */
  public FuelRobot(int index, boolean facingRight) {
    this.index = index;
    this.facingRight = facingRight;
  }
  
  /**
   * Returns the index of the robot.
   * Not implemented in the original AP question.
   * 
   * @return  the index of the current location of the robot */
  public int getCurrentIndex() {
    return index;
  }
  
  /** 
   * Determine whether the robot is currently facing to the right
   * Not implemented in the original AP question.
   * 
   * @return  true  if the robot is facing to the right(toward tanks with larger indexes)
   *          false if the robot is facing to the left(toward tanks with smaller indexes)
   */
  public boolean isFacingRight() {
    return facingRight;
  }
  
  /**
   * Changes the current direction of the robot.
   * Not implemented in the original AP question.
   */
  public void changeDirection() {
    facingRight = !facingRight;
  }
  
  /** 
   * Moves the robot in its current directino by the number of locations specified.
   * Precondition: numbLocs is greater than 0
   * Not implemented in the original AP question.
   * 
   * @param numLocs  the number of locations to more.  A value of 1 moves
   *                 the robot to the next location in the current direction.
   */
  public void moveForward(int numLocs) {
    if(facingRight) {
      index += numLocs;
    } else {
      index -= numLocs;
    }
  }
  
  /**
   * Returns a string denoting the tank index and direction of the robot.
   * Not included in the original AP question.
   * 
   * @return  a String representation of the object
   */
  public String toString() {
    if (facingRight) {
      return "Tank: " + index + "  Facing: right";
    } else {
      return "Tank: " + index + "  Facing: left";
    }
  }
}