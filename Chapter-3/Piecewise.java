import java.util.Scanner;

public class Piecewise {
  public static void main (String[] arg0) {
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Input a double, x:");
    double x = userInput.nextDouble();
    
    double y = 0;
    
    if (x < 2) {
      y = 3 * x - 4;
    } else if (x >= 2) {
      y = 0.5 * Math.pow(x, 2);
    }
    
    System.out.println("Your coordinates are (" + x + ", " + y + ")");
    
    partB();
  }
  
  private static void partB() {
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Input a pivot point, x:");
    double x = userInput.nextDouble();
    double piece1 = 3 * x - 4;
    double piece2 = 0.5 * Math.pow(x, 2);
    
    if (piece1 == piece2) {
      System.out.println("The function is continuous at pivot value " + x);
    }
    else {
      System.out.println("The function is discontinuous at pivot value " + x);
    }
  }
}