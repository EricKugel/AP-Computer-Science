/**
 * File: Turtle.java
 * U. Wolz, October 1998
 * For in class demonstration of the Software Development Method.
 * Please cite properly if you use or enhance this code
 */
public class Turtle {
  protected double currentHeading = 0;
  protected double currentX = 0;
  protected double currentY = 0;
  
  // modifiers
  public void forward(double distance) {
    currentX = currentX + distance * Math.sin(currentHeading * Math.PI / 180);
    currentY = currentY + distance * Math.cos(currentHeading * Math.PI / 180);
  }
  
  public void back(double distance) {
    forward(-1 * distance);
  }
  
  public void right(double turn) {
    currentHeading = (currentHeading + turn + 360) % 360;
  }
  
  public void left(double turn) {
    right(- turn);
  }
  
  // accessors
  public double getHeading() {
    return currentHeading;
  }
  
  public double getX() {
    return currentX;
  }
  
  public double getY() {
    return currentY;
  }
  
}