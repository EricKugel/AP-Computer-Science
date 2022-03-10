/**
 * A sparse array entry contains a value at a given location in a sparse array.
 */
public class SparseArrayEntry {
  /** The row index and column index for this entry in the sparse array */
  private int row;
  private int col;
  
  /** The value of this entry in the sparse array */
  private int value;
  
  /** 
   * Constructs a SparseArrayEntry object that represents a sparse array element
   * with row index r and column index c, containing value v.
   * 
   * @param r  the row of the entry to be constructed
   * @oaram c  the column of the entry to be constructed
   * @param v  the value of the element at row, col to be constructed
   */
  public SparseArrayEntry(int r, int c, int v) {
    row = r;
    col = c;
    value = v;
  }
  
  /**
   * Returns the row index of this sparse array element.
   * 
   * @return  the row indes of this sparse array element
   */
  public int getRow()
  {  return row;  }
  
  /**
   * Returns the column index of this sparse array element.
   *
   * @return  the column index of this sparse array element
   */
  public int getCol()
  {  return col;  }
  
  /** 
   * Returns the value of this sparse array element.
   * 
   * @return  the value of this sparse array element
   */
  public int getValue()
  {  return value;  }
  
}