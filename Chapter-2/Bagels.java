import java.util.Scanner;

public class Bagels
{
  
  private static final int BAGEL_PRIZE = 4;
  private static final int COFFEE_PRIZE = 2;
  private static final int GIFT_CARD_PRIZE = 1;
  
  public static final void main(String[] arg0)
  {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Hi! Welcome to \'grab a byte\'.");
    System.out.println("How many bagels would you like to order?");
    int bagelsOrdered = scanner.nextInt();
    System.out.println("How many coffees would you like to order?");
    int coffeesOrdered = scanner.nextInt();
    System.out.println("How many gift cards would you like to order?");
    int giftCardsOrdered = scanner.nextInt();
    
      
    System.out.print("\nYou are the 500th customer!\n" +
                     "You get " + BAGEL_PRIZE + " free bagels for a total of " + (bagelsOrdered + BAGEL_PRIZE) +" bagels!\n" +
                     "You get " + COFFEE_PRIZE + " free coffees for a total of " + (coffeesOrdered + COFFEE_PRIZE) +" coffees!\n" +
                     "You get " + GIFT_CARD_PRIZE + " $25 gift card for a total of " + (giftCardsOrdered + GIFT_CARD_PRIZE) +" gift cards!\n"
                    );
  }
}