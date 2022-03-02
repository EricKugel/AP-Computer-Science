/**
 * A sky view contains data for a given view that can be evaluated.
 */
public class SkyView {
  /** A rectangular array that holds the data representing a rectangular area of the sky. */
  private double[][] view;
  
  /** 
   * Constructs a SkyView object from a 1-dimensional array of scan data.
   * Precondition: numRows > 0
   * Precondition: numCols > 0
   * Precondition: scanned.length == numRows * numCols
   * Postcondition: view has been created as a rectangular 2-dimensional array
   *                with numRows rows and numCols columns and the values in
   *                scanned have been copied to view and are ordered as
   *                in the original rectangular area of the sky.
   * 
   * @param numRows  the number of rows represented in the view
   * @param numCols  the number of columns represented in the view
   * @param scanned  the scan data received from the telescope, stored in telescopic order 
   */
  public SkyView(int numRows, int numCols, double[] scanned) {
    view = new double[numRows][numCols];
    int index = 0;
    int direction = 1;
    for (int row = 0; row < numRows; row++) {
      if (direction == 1) {
        for (int col = 0; col < numCols; col++) {
          view[row][col] = scanned[index];
          index++;
        }
      } else if (direction == -1) {
        for (int col = numCols - 1; col >= 0; col--) {
          view[row][col] = scanned[index];
          index++;
        }
      }
      direction *= -1;
    }
  }
  
  
  /** 
   * Returns the average of the values in a rectangular section of view.
   * Precondition: 0 <= startRow <= endRow < view.length
   * Precondition: 0 <= startCol <= endCol < view[0].length
   * 
   * @param startRow  the first row index of the section
   * @param endRow    the last row index of the section
   * @param startCol  the first column index of the section
   * @param endCol    the last column index of the section
   * @return          the average of the values in the specified section of view
   */
  public double getAverage(int startRow, int endRow, int startCol, int endCol) {
    double sum = 0;
    int addends = 0;
    for (int row = startRow; row <= endRow; row++) {
      for (int col = startCol; col <= endCol; col++) {
        sum += view[row][col];
        addends += 1;
      }
    }
    return sum / addends;
  }
  
  
  /** 
   * Returns a 2-dimensional table of values representing the object.
   * Not included in the original AP question.
   * 
   * @return  a string representation of the object
   */
  public String toString() {
    String output = "";
    for (int row = 0; row < view.length; row++) {
      for (int col = 0; col < view[0].length; col++) {
        output += view[row][col] + "\t";
      }
      output += "\n";
    }
    return output;
  }
  
}