import java.util.Scanner;

public class Sphere
{
  public static void main (String[] arg0)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Radius of a sphere: ");
    double radius = scanner.nextDouble();
    
    double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
    
    System.out.println("\t Volume: " + volume);
    System.out.println("\t Surface Area: " + surfaceArea);

    Sphere.cylinder();
  }

  public static void cylinder() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Radius of a cylinder: ");
    double radius = scanner.nextDouble();
    System.out.println("Height of cylinder: ");
    double height = scanner.nextDouble();

    double surfaceArea = radius * 2 * Math.PI * height + Math.PI * Math.pow(radius, 2) * 2;
    double volume = Math.PI * Math.pow(radius, 2) * height;
    
    System.out.println("\t Volume: " + volume);
    System.out.println("\t Surface Area: " + surfaceArea);
    scanner.close();
  }
}