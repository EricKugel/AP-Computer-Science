public class TablePracticeTester {
  public static void main(String[] args) {
    TablePractice myTable = new TablePractice(4, 6);
    myTable.fillRandomArray(5, 11);
    System.out.println("Initial random set up:\n" + myTable);
    
    myTable.setRow(3, myTable.getRow(2));
    System.out.println("Get row 2 and set to row 3:\n" + myTable);
    
    myTable.setCol(0, myTable.getCol(5));
    System.out.println("Get col 5 and set to col 0:\n" + myTable);
        
    myTable.calculateDifference();
    System.out.println("Calculate difference:\n" + myTable);
  }
}