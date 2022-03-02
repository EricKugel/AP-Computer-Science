import java.util.Scanner;

public class ImproperFractions
{
 public static void main (String[] arg0)
 {
   Scanner scanner = new Scanner(System.in);
   
   System.out.println("Numerator:");
   int numerator = scanner.nextInt();
   
   System.out.println("Denominator:");
   int denominator = scanner.nextInt();
   
   int wholeNumber = numerator/denominator;
   int simplifiedNumerator = numerator % denominator;
   
   if (simplifiedNumerator != 0) {
     System.out.println(numerator + "/" + denominator + " = " + wholeNumber + " " + simplifiedNumerator + "/" + denominator);
   }
   else {
     System.out.println(numerator + "/" + denominator + " = " + wholeNumber);
   }
 }
}