import java.util.Scanner;

public class LeapYear {
  public static void main (String[] arg0) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Input a year: ");
    int year = scanner.nextInt();
    
    if (year > 1582 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
      System.out.println("That's a leap year!");
    } else {
      System.out.println("That's not a leap year");
    }

    scanner.close();
  }
}