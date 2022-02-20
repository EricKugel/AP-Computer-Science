import java.util.Scanner;

public class Multiples {
  public static void main(String[] arg0) {
    Scanner scanner = new Scanner(System.in);
    
    
    System.out.println("Input a min value:");
    int min = scanner.nextInt();
    System.out.println("Input a max value:");
    int max = scanner.nextInt();
    while (max < min) {
      System.out.println("Max must be greater than the min " + min);
      max = scanner.nextInt();
    }
    System.out.println("Input a 'multiple' value or type 0 to quit:");
    int multiple = scanner.nextInt();
    
    while (multiple != 0) {
      
      System.out.println("Enter 1 to find multiples, and 2 to find non-multiples.");
      int option = scanner.nextInt();
      
      if (option == 1) {
        String output = "The numbers that are multiples of " + multiple + " from " + min + " to " + max + " are ";
        for (int i = min; i <= max; i++) {
          if (i % multiple == 0) {
            output += i + " ";
          }
        }
        
        System.out.println(output);
      } else if (option == 2) {
        String output = "The numbers that are not multiples of " + multiple + " from " + min + " to " + max + " are ";
        for (int i = min; i <= max; i++) {
          if (i % multiple != 0) {
            output += i + " ";
          }
        }
        
        System.out.println(output);
      }
      
      System.out.println("Input a min value:");
      min = scanner.nextInt();
      System.out.println("Input a max value:");
      max = scanner.nextInt();
      while (max < min) {
        System.out.println("Max must be greater than the min " + min);
        max = scanner.nextInt();
      }
      System.out.println("Input a 'multiple' value or type 0 to quit:");
      multiple = scanner.nextInt();
    }
  }
}