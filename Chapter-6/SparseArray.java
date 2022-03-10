import java.util.ArrayList;

/**
 * A sparse array is a one-dimensional list that mimics the behaviors of a two-dimensional array.
 */
public class SparseArray {
  /** The number of rows and columns in the sparse array. */
  private int numRows;
  private int numCols;
  
  /** 
   * The list of entries representing the non-zero elements of the sparse array.  Entries are stored
   * in the list in no particular order.  Each non-zero element is represented by exactly one entry
   * in the list.
   */
  private ArrayList<SparseArrayEntry> entries;
  
  /**
   * Constructs an empty SparseArray.
   */
  public SparseArray() {
    entries = new ArrayList<SparseArrayEntry>();
  }
  
  /** 
   * Sets number of rows.
   * Not included in the original AP question.
   *
   * @param numRows  the rows in the SparseArray
   */
  public void setRows(int numRows) {
    this.numRows = numRows;
  }
  
  /** 
   * Sets number of columns.
   * Not included in the original AP question.
   * 
   * @param numCols  the columns in the sparse array
   */
  public void setCols(int numCols) {
    this.numCols = numCols;
  }
  
  /** 
   * Adds one entry to the sparse array.
   * Not included in the original AP question.
   * 
   * @param row  the row of the entry to be added
   * @param col  the column of the entry to be added
   * @param val  the value of the entry to be added
   */
  public void addEntry(int row, int col, int val) {
    SparseArrayEntry entry = new SparseArrayEntry(row, col, val);
    entries.add(entry);
  }
  
  /** 
   * Returns the number of rows in the sparse array.
   * 
   * @return  the number of rows in the sparse array
   */
  public int getNumRows()
  {  return numRows;  }
  
  /** 
   * Returns the number of columns in the sparse array.
   *
   * @return  the number of columns in the sparse array
   */
  public int getNumCols()
  {  return numCols;  }
  
  /** 
   * Returns the value of the element at row index row and column index col in the sparse array.
   * Precondition: 0 <= row < getNumRows()
   *               0 <= col < getNumCols()
   * 
   * @param row  the row of the entry to be returned
   * @oaram col  the column of the entry to be returned
   * @return     the value of the element at row, col in the sparse array
   */
  public int getValueAt(int row, int col) {
    for (SparseArrayEntry entry : entries) {
      if (entry.getRow() == row && entry.getCol() == col) {
        return entry.getValue();
      }
    }
    return 0;
  }
  
  
  /** 
   * Removes the column col from the sparse array.
   * Precondition: 0 <= col < getNumCols()
   * 
   * @param col  the column to be removed
   */
  public void removeColumn(int col) {
    for (int i = 0; i < entries.size(); i++) {
      SparseArrayEntry entry = entries.get(i);
      if (entry.getCol() == col) {
        entries.remove(i);
        i--;
      } else if (entry.getCol() > col) {
        entries.remove(i);
        entries.add(i, new SparseArrayEntry(entry.getRow(), entry.getCol() - 1, entry.getValue()));
      }
    }
    numCols -= 1;
  }
  
  
}