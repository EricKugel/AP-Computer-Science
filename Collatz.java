import java.util.Scanner;

public class Collatz {
  public static void main(String[] arg0) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a positive integer.");
    int input = scanner.nextInt();
    while (input <= 0) {
      System.out.println("Input a positive integer.");
      input = scanner.nextInt();
    }
    int number = input;
    String output = "";
    
    System.out.print(number + " ");
    while (number != 1) {
      if (number % 2 == 0) {
        number /= 2;
      } else {
        number = number * 3 + 1;
      }
      System.out.print(number + " ");
    }
  }
}