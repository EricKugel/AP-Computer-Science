import java.util.Scanner;

public class SumFrom {
  public static void main (String[] arg0) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a minimum val:");
    int min = scanner.nextInt();
    System.out.println("Enter a max val:");
    int max = scanner.nextInt();
    while (max < min) {
      System.out.println("Max must be higher than min");
      max = scanner.nextInt();
    }
    int addend = min;
    int sum = 0;
    String output = "The sum of the integers from " + min + " to " + max + " is ";
    
    while (addend <= max) {
      sum += addend;
      output += addend + " + ";
      addend++;
    }
    
    output = output.substring(0, output.lastIndexOf("+")) + "= " + sum;
    System.out.println(output);
  }
}