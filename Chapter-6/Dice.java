// Dice objects can be rolled and picked.

import java.util.Scanner;

public class Dice {
  private int numSides = -1;
  private int faceValue = -1;
  private boolean picked = true;
  
  /* Default constructor */
  public Dice() {
    numSides = 6; 
    faceValue = 1;
    picked = false;
  }
  
  /* Overloaded constructor */
  public Dice(int numSides) {
    Scanner userInput = new Scanner(System.in);
    while (numSides > 100 || numSides < 4) {
      System.out.println("Oops.  Choose a number of sides for your die from 4 to 100.");
      numSides = userInput.nextInt();
    }
    this.numSides = numSides;
    faceValue = 1;
    picked = false;
  }
  
  /** Returns number on the die. */
  public int getFaceValue() {
    return faceValue;
  }
  
  /** Returns true if the die is picked. */
  public boolean getStatus() {
    return picked;
  }
  
  /** Changes the status of the die to true. */
  public void pick() {
    this.picked = true;
  }
  
  /* Changes the status of the die to false. */
  public void unpick() {
    this.picked = false;
  }
  
  /** Changes the number on the die to a random integer 
    * between 1 and the number of sides of the die.
    */
  public void roll() {
    faceValue = (int) (Math.random() * numSides) + 1;
  }
    
}