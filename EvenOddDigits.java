import java.util.Scanner;

public class EvenOddDigits {
  public static void main (String[] arg0) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = scanner.nextInt();
    String numString = "" + number;
    int index = 0;
    int odd = 0, even = 0, zero = 0;
    
    while (index < numString.length()) {
      int digit = Integer.parseInt("" + numString.charAt(index));
      if (digit % 2 == 0 && digit != 0) {
        even++;
      }
      else if (digit % 2 == 1) {
        odd++;
      }
      else {
        zero++;
      }
      index++;
    }
    
    String output = numString + "\n";
    String oddStars = "";
    while (oddStars.length() < odd) {
      oddStars += "*";
    }
    String evenStars = "";
    while (evenStars.length() < even) {
      evenStars += "*";
    }
    String zeroStars = "";
    while (zeroStars.length() < zero) {
      zeroStars += "*";
    }
    output += "Odd: " + odd + "\t" + oddStars + "\n";
    output += "Even: " + even + "\t" + evenStars + "\n";
    output += "Zero: " + zero + "\t" + zeroStars + "\n";
    
    System.out.println(output);
  }
}