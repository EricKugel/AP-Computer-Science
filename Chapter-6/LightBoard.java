/**
 * A light board is a two-dimensional grid of lights that can be turned on and off.
 */
public class LightBoard {
  /** The lights on the board, where true represnets on and false represents off. */
  private boolean[][] lights;
  
  /** 
   * Default constructor, used to demonstrate sample method calls in part (b).
   * Not included in the original AP question.
   */
  public LightBoard() {
    boolean[][] sample = {{true, true, false, true, true},
      {true, false, false, true, false},
      {true, false, false, true, true},
      {true, false, false, false, true},
      {true, false, false, false, true},
      {true, true, false, true, true},
      {false, false, false, false, false}};
    lights = sample;
  }
  
  /** 
   * Constructs a LightBoard object having numRows rows and numCols columns.
   * Preconditon: numRows > 0, numCols > 0
   * Postcondition: each light has a 40% probability of being set to on.
   * 
   * @param numRows  the number of rows in this light board
   * @param numCols  the number of columns in this light board
   */
  public LightBoard(int numRows, int numCols) {
    lights = new boolean[numRows][numCols];
    for (int row = 0; row < numRows; row++) {
      for (int col = 0; col < numCols; col++) {
        lights[row][col] = Math.random() > .6;
      }
    }
  }
  
  
  /** 
   * Evaluates a light in row index row and column index col and returns a status
   * as described in part (b).
   * Precondition: row and col are valid indexes in lights.
   * 
   * @param row  the row of the light to be evaluated
   * @param col  the column of the light to be evaluated
   */
  public boolean evaluateLight(int row, int col) {
    if (lights[row][col]) {
      int numOn = 0;
      for (int r = 0; r < lights.length; r++) {
        if (lights[r][col]) {
          numOn += 1;
        }
      }
      if (numOn % 2 == 0) {
        return false;
      }
    } else {
      int numOn = 0;
      for (int r = 0; r < lights.length; r++) {
        if (lights[r][col]) {
          numOn += 1;
        }
      }
      if (numOn % 3 == 0) {
        return true;
      }
    }
    return lights[row][col];
  }
  
  
  /** 
   * Returns a table of true and false values representing this light board.
   * Not included in the original AP question.
   * 
   * @return  a string representation of the object.
   */
  public String toString() {
    String output = "";
    for (boolean[] row : lights) {
      for (boolean item : row) {
        output += item + "\t";
      }
      output += "\n";
    }
    return output;
  }
  
}