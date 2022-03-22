// Eric Kugel

import java.util.Scanner;

public class IntArray {
  private int[] digits = null;
  
  public IntArray(int length) {
    digits = new int[length];
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < length; i++) {
      System.out.println("Enter an integer");
      int input = scanner.nextInt();
      digits[i] = input;
    }
    scanner.close();
  }
  
  public int evenIndexSum() {
    int sum = 0;
    for (int i = 0; i < digits.length; i += 2) {
      sum += digits[i];
    }
    return sum;
  }
  
  public String subToString(int beginIndex, int endIndex) {
    String output = "";
    for (int i = beginIndex; i < endIndex; i++) {
      output += digits[i] + " ";
    }
    return output;
  }
}