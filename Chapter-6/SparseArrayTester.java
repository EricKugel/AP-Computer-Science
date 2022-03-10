/**
 * SparseArrayTester contains a main method to test a SparseArray oject.
 * 
 * The tester constructs a SparseArray, invokes the addEntry, getValueAt, and removeColumn
 * methods, and prints the results.
 */
public class SparseArrayTester {
  public static void main(String[] args) {
    // initial setup of sparse array
    SparseArray sparse = new SparseArray();
    sparse.setRows(6);
    sparse.setCols(5);
    
    // entry additions to sparse array
    sparse.addEntry(1, 4, 4);
    sparse.addEntry(2, 0, 1);
    sparse.addEntry(3, 1, -9);
    sparse.addEntry(1, 1, 5);
    
    // tests original sparse array
    for (int row = 0; row < sparse.getNumRows(); row++) {
      for (int col = 0; col < sparse.getNumCols(); col++) {
        int entry = sparse.getValueAt(row, col);
        System.out.print(entry + "\t");
      }
      System.out.println("");
    }
    
    // tests getValueAt method
    System.out.println("\n" + sparse.getValueAt(3, 1));
    System.out.println(sparse.getValueAt(3, 3) + "\n");
    
    // tests removeColumn method
    sparse.removeColumn(1);
    
    for (int row = 0; row < (sparse.getNumRows()); row++) {
      for (int col = 0; col < (sparse.getNumCols()); col++) {
        System.out.print(sparse.getValueAt(row, col) + "\t");
      }
      System.out.println("");
    }
  }
  
}