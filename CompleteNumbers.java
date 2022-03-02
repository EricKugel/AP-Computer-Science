import java.util.Scanner;

public class CompleteNumbers {
  public static void main (String[] arg0) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a three-digit integer:");
    int number = scanner.nextInt();
    
    int digit0 = number / 100;
    int digit1 = number % 100 / 10;
    int digit2 = number % 10;
    int[] digits = {digit0, digit1, digit2};
    
    int evenCount = 0;
    for (int digit : digits) {
      if (isEven(digit)) {
        evenCount++;
      }
    }
    
    String result = "";    
    if (evenCount == 3) {
      result = "completely even";
    } else if (evenCount == 2 && isEven(digit2)) {
      result = "partially even";
    } else if (evenCount == 2 && !isEven(digit2)) {
      result = "simply odd";
    } else if (evenCount == 1 && !isEven(digit2)) {
      result = "partially odd";
    } else if (evenCount == 1 && isEven(digit2)) {
      result = "simply even";
    } else {
      result = "completely odd";
    }
    
    System.out.println(number + " is " + result);
  }

  public static boolean isEven(int number) {
    return number % 2 == 0;
  }
}