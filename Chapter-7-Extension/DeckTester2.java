/**
 * DeckeTester2 contains a main method to test a Deck object, specifically the
 * shuffle method.
 * 
 * The tester constructs a Deck object, invokes the shuffle, deal, and toString
 * methods, and prints the results.
 */
public class DeckTester2 {
  public static void main(String[] args) {
    String[] ranks = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
    String[] suits = {"hearts", "clubs", "diamonds", "spades"};
    int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    Deck myDeck = new Deck(ranks, suits, pointValues);
    System.out.println(myDeck + "----------------------------------\n"); // All 52 cards should be shuffled, but none dealt.
    
    myDeck.shuffle();
    myDeck.deal();
    myDeck.deal();
    System.out.println(myDeck + "----------------------------------\n"); // All 52 cards should be shuffled, and two dealt.
    
    myDeck.shuffle();
    myDeck.deal();
    myDeck.deal();
    System.out.println(myDeck); // All 52 cards should be shuffled, and two dealt.
  
  }
}
