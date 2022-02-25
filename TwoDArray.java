// Eric Kugel

public class TwoDArray {
  private int[][] array = null;
  
  public TwoDArray(int rows, int cols, int targetRow, int targetCol) {
    array = new int[rows][cols];
    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        array[row][col] = Math.abs(row - targetRow) + Math.abs(col - targetCol);
      }
    }
  }
  
  public String toString() {
    String output = "";
    for (int[] row : array) {
      for (int item : row) {
        output += item + "\t";
      }
      output += "\n";
    }
    return output;
  }
  
  public void transpose() {
    int[][] newArray = new int[array[0].length][array.length];
    for (int row = 0; row < array.length; row++) {
      for (int col = 0; col < array[0].length; col++) {
        newArray[col][row] = array[row][col];
      }
    }
    array = newArray;
  }
}