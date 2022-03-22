/**
 * A number tile is four-sided and has one integer value on each side.
 */
public class NumberTile {
  /** represents the sides of a tile, up, right, down, left */
  private int[] sides = {-1, -1, -1, -1};
  
  /**
   * Constructs a number tile with the given parameter values on each corresponding side.
   * Not included in the original AP question.
   * 
   * @param top     the value on the top edge of the tile
   * @param right   the value on the right edge of the tile
   * @param bottom  the value on the bottom edge of the tile
   * @param left    the value on the left edgeg of the tile
   */
  public NumberTile(int top, int right, int bottom, int left) {
    sides[0] = top;
    sides[1] = right;
    sides[2] = bottom;
    sides[3] = left;
  }
  
  /** 
   * Rotates the tile 90 degrees clockwise.
   * Implementation not shown in the original Ap question.
   */
  public void rotate() {
    int temp = sides[3];
    sides[3] = sides[2];
    sides[2] = sides[1];
    sides[1] = sides[0];
    sides[0] = temp;
  }
  
  /** 
   * Returns the value at the top edge of the tile.
   * Not included in the original AP question.
   * 
   * @return  value at top edge of tile
   */
  public int getTop() {
    return sides[0];
  }
  
  /** 
   * Returns the value at the right edge of the tile.
   * Not implemented in the original AP question.
   * 
   * @return  value at right edge of tile
   */
  public int getRight() {
    return sides[1];
  }
  
  /** 
   * Returns the value at the bottom edge of the tile.
   * Not included in the original AP question.
   * 
   * @return  value at bottom edge of tile
   */
  public int getBottom() {
    return sides[2];
  }
  
  /** 
   * Returns the value at the left edge of the tile.
   * Not implemented in the original AP question.
   * 
   * @return  value at left edge of tile
   */
  public int getLeft() {
    return sides[3];
  }
  
  /** 
   * Returns a string representation of the object.
   * Not included in the original AP question.
   * 
   * @return  a string representation of the object
   */
  public String toString() {
    String output = " ------- \n|   " + sides[0] + "   |\n";
    output += "| " + sides[3] + "   " + sides[1] + " |\n";
    output += "|   " + sides[2] + "   |\n ------- \n";
    return output;
  }
  
}