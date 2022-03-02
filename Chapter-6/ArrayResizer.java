/**
 * ArrayResizer contains static methods to analyze two-dimensional arrays for 
 * non-zero rows and to consolidate these arrays to eliminate non-zero rows. 
 */
public class ArrayResizer {
  /**
   * Returns true if and only if every value in row r of array2D is non-zero.
   * Precondition: r is a valid row index in array2D
   * Postcondition: array2D is unchanged
   *
   * @param array2D  the two-dimensional array to be analyzed
   * @param r        the row to be analyzed
   * @return         true if every value in the given row is non-zero;
   *                 false, otherwise
   */
  public static boolean isNonZeroRow(int[][] array2D, int r) {
    int[] row = array2D[r];
    for (int item : row) {
      if (item == 0) {
        return false;
      }
    }
    return true;
  }
  
  
  /**
   * Returns the number of rows in array2D that contain all non-zero values.
   * Postcondition: array2D is unchanged.
   * Not implementd in the original AP question.
   * 
   * @param array2D  the two-dimensional array to be analyzed
   */
  public static int numNonZeroRows(int[][] array2D) {
    int count = 0;
    for (int i = 0; i < array2D.length; i++) {
      if (isNonZeroRow(array2D, i)) {
        count++;
      }
    }
    return count;
  }
  
  /** 
   * Returns a new, possibly smaller, two-dimensional array that contains only rows
   * from array2D with no zeros, as described in part (b).
   * Precondition: array2D contains at least one column and at least one row with no zeros
   * Postcondition: array2D is unchanged
   * 
   * @param array2D  the two-dimensional array to be analyzed
   */
  public static int[][] resize(int[][] array2D) {
    int numberOfRows = 0;
    for (int rowIndex = 0; rowIndex < array2D.length; rowIndex++) {
      if (isNonZeroRow(array2D, rowIndex)) {
        numberOfRows += 1;
      }
    }

    int[][] newArray = new int[numberOfRows][array2D[0].length];
    int newRowIndex = 0;
    for (int oldRowIndex = 0; oldRowIndex < array2D.length; oldRowIndex++) {
      if (isNonZeroRow(array2D, oldRowIndex)) {
        newArray[newRowIndex] = array2D[oldRowIndex];
        newRowIndex++;
      }
    }

    return newArray;
  }
  
  
}