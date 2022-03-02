import java.util.Scanner;

public class GetUserInput {
  public static void main(String[] arg0) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("What's your name?");
    String name = scanner.next();
    
    System.out.println("Nice to meet you, " + name + "!");
  }
  
}