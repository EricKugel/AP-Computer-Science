public class TwoCoins {
  public static void main(String[] args) {
    // Creates Coin objects
    Coin myCoin1 = new Coin(); 
    Coin myCoin2 = new Coin(); 
    
    myCoin1.flip();
    myCoin2.flip();
    
    System.out.println("T/F: myCoin1 is heads.  Answer: " + myCoin1.isHeads());
    System.out.println("T/F: myCoin2 is heads.  Answer: " + myCoin2.isHeads());
    
    myCoin1.flip();
    myCoin2.flip();
    
    System.out.println("\nAfter flip,");
    System.out.println("T/F: myCoin1 is heads.  Answer: " + myCoin1.isHeads());
    System.out.println("T/F: myCoin2 is heads.  Answer: " + myCoin2.isHeads());
  }
}