import java.util.Scanner;

public class Distance
{
  public static void main(String[] arg0)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter two coordinates.");
    System.out.println("Point 1, x value:");
    double x1 = scanner.nextDouble();
    System.out.println("Point 1, y value:");
    double y1 = scanner.nextDouble();
    System.out.println("Point 2, x value:");
    double x2 = scanner.nextDouble();
    System.out.println("Point 2, y value:");
    double y2 = scanner.nextDouble();
    
    double xDelta = x2 - x1;
    double yDelta = y2 - y1;
    double distance = Math.sqrt(Math.pow(xDelta, 2) + Math.pow(yDelta, 2));
    
    System.out.println("Distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);
  } 
}