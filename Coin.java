enum State {heads, tails}

public class Coin {
  private State faceVal = null;
  
  /** Constructs a coin object */ 
  public Coin() {
    faceVal = State.heads;
  }
  
  /** Flips the coin */
  public void flip() {
    if ((int) (Math.random() * 2) == 0) {
      faceVal = State.tails;
    } else {
      faceVal = State.heads;
    }
  }
  
  /** 
   * Checks to see if faceVal is Heads
   * Returns true if it is Heads
   *         false otherwise
   */
  public boolean isHeads() {
    if (faceVal.equals(State.heads)) {
      return true;
    } else {
      return false;
    }
  }
  
  /** Returns a string representation of the object */
  public String toString() {
      return "The coin is " + faceVal + " up";
  }
}