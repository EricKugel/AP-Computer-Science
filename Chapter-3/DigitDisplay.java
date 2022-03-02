import java.util.Scanner;

public class DigitDisplay {
  public static void main(String[] arg0) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input an integer:");
    int number = Math.abs(scanner.nextInt());
    
    String output = "";
    
    int greatestDigit = -1;
    int numberCopy = number;
    while (numberCopy > 0) {
      int lastDigit = numberCopy % 10;
      if (lastDigit > greatestDigit) {
        greatestDigit = lastDigit;
      }
      numberCopy /= 10;
    }
    
    while (number > 0) {
      int lastDigit = number % 10;
      String digitsString = "";
      for (int i = 0; i < greatestDigit - lastDigit; i++) {
        digitsString += " ";
      }
      for (int i = 0; i < lastDigit; i++) {
        digitsString += lastDigit;
      }
      output = digitsString + "\n" + output;
      number /= 10;
    }
    
    System.out.println(output);
  }
}