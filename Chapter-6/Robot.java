public class Robot
{
  private int[] hall;
  private int pos;             // current position (tile number) of Robot
  private boolean facingRight; // true means this Robot is facing right
  
  /** Constructs a Robot object. */
  public Robot(int[] aHall, int aPos, boolean aFacingRight) {
    hall = aHall;
    pos = aPos;
    facingRight = aFacingRight;
  }
  
  /** postcondition: returns true if this Robot has a wall immediately in
    *                front of it, so that it cannot move forward;
    *                otherwise, returns false
    */
  private boolean forwardMoveBlocked() {
    int newPos = pos;
    if (facingRight) {
      newPos++;
    } else {
      newPos--;
    }

    return newPos < 0 || newPos >= hall.length;
  }
  
  
  /** postcondition: one move has been made according to the
    *                specifications above and the state of this
    *                Robot has been updated
    */
  public void move() {
    if (hall[pos] > 0) {
      hall[pos] -= 1;
    }

    if (hall[pos] == 0) {
      if (!forwardMoveBlocked()) {
        pos -= 1;
        if (facingRight) {
          pos += 2;
        }
      } else {
        facingRight = !facingRight;
      }
    }
  }
  
  
  /** postcondition: no more items remain in the hallway;
    *                returns the number of moves made
    */
  public int clearHall() {
    int moves = 0;
    while (!hallIsClear()) {
      move();
      moves += 1;
    }
    return moves;
  }
  
  
  /** postcondition: returns true if the hallway contains no items;
    *                otherwise, returns false
    */
  private boolean hallIsClear() {
    for (int item : hall) {
      if (item > 0) {
        return false;
      }
    }
    return true;
  }
  
  /** Prints a string representation of the Robot. */
  private void seeProgress() {
    String output = "0 1 2 3\n";
    for (int item :  hall) {
      output += item + " ";
    }
    output += "\n";
    for (int i = 0; i < pos; i++) {
      output += "  ";
    }
    if (facingRight) {
      output += ">\n";
    } else {
      output += "<\n";
    }
    System.out.println(output);
  }
}