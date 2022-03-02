public class TokenPassTester {
  public static void main(String[] args) {
    // Test initial setup
    TokenPass game1 = new TokenPass(4);
    System.out.println("Current player: " + game1.getCurrentPlayer());
    System.out.println(game1 + "\n");
    
    // Test distribution of tokens for current player
    game1.distributeCurrentPlayerTokens();
    System.out.println(game1);
  }
}