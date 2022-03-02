// A Set is a collection of five Dice.
// Each turn begins with a Set of five Dice.
// A new Set is generated at the beginning of each turn.

public class Set {
  private Dice[] allDice = null;

  // Constructs a Set object of 5 dice objects.
  public Set() {
    Dice a = new Dice();
    Dice b = new Dice();
    Dice c = new Dice();
    Dice d = new Dice();
    Dice e = new Dice();
    
    Dice[] allDice = {a, b, c, d, e}; // Declares, instantiates, and initializes a local array.
    this.allDice = allDice; // Passes the local array to the instance variable array.
  }
  
  /* Returns the die at the given index. */
  public Dice getDice(int index) {
    return allDice[index];
  }
  
  /* Sets the status of each die to false. Used at the 
   * beginning of each turn to make each die unpicked.
   * MUST use a for, for-each, or while loop
   */
  public void resetStatus() {
    for (Dice d : allDice) {
      d.unpick();
    }
  }
  
  /* Rolls each of the unpicked dice in the hand
   * MUST use a for, for-each, or while loop
   */
  public void roll() {
    for (Dice d : allDice) {
      if (!d.getStatus()) {
        d.roll();
      }
    }
  }
  
  /* Returns the total of all five dice
   * MUST use a for, for-each, or while loop
   */
  public int total() {
    int sum = 0;
    for (Dice d : allDice) {
      sum += d.getFaceValue();
    }
    return sum;
  } 
  
  /* Prints face values of all dice in the set. Sample output:
   * Your roll: 2, 4, 6, 1, 2
   */
  public String toString() {
    String output = "\nYour roll: ";
    for (Dice item : allDice) {
      output += item.getFaceValue() + ",  ";
    }
    return output;
  }
  
}