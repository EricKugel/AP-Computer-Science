public class TablePractice implements ArrayPractice {
  private int[][] table = null;

  public TablePractice(int rows, int cols) {
    table = new int[rows][cols];
  }

  public void fillRandomArray(int min, int max) {
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table[0].length; col++) {
        table[row][col] = (int) (Math.random() * (max + 1)) + min;
      }
    }
  }

  public int[] getRow(int row) {
    return table[row];
  }

  public int[] getCol(int col) {
    int[] cols = new int[table[0].length];
    for (int row = 0; row < table.length; row++) {
      cols[row] = table[row][col];
    }
    return cols;
  }

  public void setRow(int row, int[] rowElements) {
    for (int col = 0; col < rowElements.length; col++) {
      table[row][col] = rowElements[col];
    }
  }

  public void setCol(int col, int[] colElements) {
    for (int row = 0; row < table.length; row++) {
      table[row][col] = colElements[row];
    }
  }

  public void calculateDifference() {
    int[][] newTable = new int[table.length - 1][table[0].length];
    for (int row = 0; row < table.length - 1; row++) {
      for (int col = 0; col < table[0].length; col++) {
        newTable[row][col] = table[row][col] - table[row + 1][col];
      }
    }
    table = newTable;
  }
  
  public String toString() {
    String output = "";
    for (int[] row : table) {
      for (int item : row) {
        output += item + "\t";
      }
      output += "\n";
    }
    return output;
  }
}