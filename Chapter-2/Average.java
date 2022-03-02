import java.util.Scanner;

public class Average {
  public static void main (String[] arg0) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Type 3 doubles to find the average.");
    System.out.println("Double 1:");
    double double1 = scanner.nextDouble();
    System.out.println("Double 2:");
    double double2 = scanner.nextDouble();
    System.out.println("Double 3:");
    double double3 = scanner.nextDouble();
    
    double average = (double1 + double2 + double3) / 3;
    System.out.println("The average of " + double1 + ", " + double2 + ", and " + double3 + " is " + average);
  }
  
}