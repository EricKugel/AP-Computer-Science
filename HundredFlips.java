public class HundredFlips {
  public static void main(String[] args) {
    final int NUM_FLIPS = 100;
    int heads = 0;
    int tails = 0;
    
    // Creates the Coin object called myCoin
    Coin myCoin = new Coin(); 
    
    // Flips the coin NUM_FLIPS times
    for (int i = 0; i < NUM_FLIPS; i++) {
      myCoin.flip();
      if (myCoin.isHeads()) {
        heads++;
      } else {
        tails++;
      }
    }
    
    // Tests the toString method
    System.out.println(myCoin + "\n");
    
    System.out.println("Number of heads: " + heads);
    System.out.println("Number of tails: " + tails);   
  }
}