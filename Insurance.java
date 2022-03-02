import java.util.Scanner;

public class Insurance {
  public static void main(String[] arg0) {
    Scanner scanner = new Scanner(System.in);
    int age = (int) (Math.random() * 84) + 16;
    int accidents = (int) (Math.random() * 10) + 1;
    int credit = (int) (Math.random() * 551) + 300;
    
    System.out.print("Age: " + age + "\n" + "Accidents: " + accidents + "\n" + "Credit Rating: " + credit + "\n");
    
    if (age < 25) {
      System.out.println("This client is a potential risk due to age. They do not qualify for a discount.");
    } else if (accidents > 0) {
      System.out.println("This client is a potential risk due to previous accidents. They do not qualify for a discount.");
    } else if (credit < 500) {
      System.out.println("This client is a potential risk due to a low credit rating. They do not qualify for a discount.");
    } else {
      System.out.println("This client is risk free. They qualify for a discount!");
    }
  }
}