/**
 * ArrayResizerTester contains a main method to test static methods in the ArrayResizer class.
 * 
 * The tester constructs a two-dimensional array, invokes the isNonZeroRow and resize
 * methods, and prints the results.
 */
public class ArrayResizerTester {
  public static void main(String[] args) {
    int[][] arr = {{2, 1, 0},
      {1, 3, 2},
      {0, 0, 0},
      {4, 5, 6}};
    System.out.println(ArrayResizer.isNonZeroRow(arr, 0));
    System.out.println(ArrayResizer.isNonZeroRow(arr, 1));
    System.out.println(ArrayResizer.isNonZeroRow(arr, 2));
    System.out.println(ArrayResizer.isNonZeroRow(arr, 3) + "\n");
    
    int[][] smaller = ArrayResizer.resize(arr);
    for (int[] row : smaller) {
      for (int item : row) {
        System.out.print(item + "\t");
      }
      System.out.println();
    }
  }
}