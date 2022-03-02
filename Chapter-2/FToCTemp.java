import java.util.Scanner;

public class FToCTemp
{
 public static void main (String[] arg0)
 {
   Scanner scanner = new Scanner(System.in);
   
   System.out.println("Temperature in Fahrenheit:");
   double far = scanner.nextDouble();
   
   double cel = (far - 32) / 1.8;
   
   System.out.println((int) far + " degrees Fahrenheit\n\tis equal to\n" + (int) cel + " degrees Celsius.");
 }
}