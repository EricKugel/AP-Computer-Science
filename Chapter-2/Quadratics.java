import java.util.Scanner;

public class Quadratics
{
 public static void main (String[] arg0)
 {
   Scanner scanner = new Scanner(System.in);
   
   System.out.println("Solve a quadratic equation");
   
   int[] coefficients = new int[3];
   String[] variables = {"a", "b", "c"};
   
   for (int i = 0; i < 3; i++) {
     System.out.println(variables[i] + " = ");
     coefficients[i] = scanner.nextInt();
   }
   
   int a = coefficients[0], b = coefficients[1], c = coefficients[2];
   
   double posX = ((b * -1) + (Math.sqrt(b * b - 4 * a * c))) / 2.0 * a;
   double negX = ((b * -1) - (Math.sqrt(b * b - 4 * a * c))) / 2.0 * a;
   
   System.out.println("X is equal to " + posX + " or " + negX + ".");
   
 }
}