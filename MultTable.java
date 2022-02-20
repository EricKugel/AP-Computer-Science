import java.util.Scanner;

public class MultTable {
  public static void main(String[] arg0) {
//    for (int row = 1; row <= 12; row++) {
//      for (int col = 1; col <= 12; col++) {
//        System.out.print("\t" + row * col);
//      }
//      System.out.print("\n");
//    }
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Input a minimum value:");
    int min = scanner.nextInt();
    System.out.println("Input a maximum value:");
    int max = scanner.nextInt();
    
    for (int row = min; row <= max; row++) {
      for (int col = min; col <= max; col++) {
        System.out.print("\t" + row * col);
      }
      System.out.println();
    }
  }
}