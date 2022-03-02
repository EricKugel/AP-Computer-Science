// Eric Kugel

import java.util.Scanner;

public class Division
{
 public static void main (String[] arg0)
 {
   Scanner userInput = new Scanner(System.in);
   
   System.out.println("What is the \tinteger\t\"dividend\"?");
   int dividend = userInput.nextInt();
   System.out.println("What is the \tdecimal number\t\"divisor?\"?");
   double divisor = userInput.nextDouble();
   
   double answer = dividend / divisor;
   System.out.println(dividend + 
                      "\n----\n" + 
                      divisor + " = " + answer);
 }
}