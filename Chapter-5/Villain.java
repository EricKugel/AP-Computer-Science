/**
 * A hero is a character who is the protagonist in the game.
 */
public class Villain implements Character, Comparable {
  // instance variables
  private String name = null;
  private int stamina = -1; // Ranges from 0 to 10. If stamina reaches 0, villain dies.
  private int strength = -1; // Ranges from 0 to 10.
  private int currentRoom = -1;
  
  private boolean isDead = false;
    
  /**
   * Initializes name, stamina, strength, and death status.  Also adds 1 to class
   * variable for total number of heroes.
   *
   * @param name      the name of this hero
   * @param strength  the initial strength of this hero
   */
  public Villain(String name, int strength) {
    this.name = name;
    stamina = 8;
    this.strength = strength;
    isDead = false;
  }
  
  // The next 12 methods implement the Character interface.  Note that the JavaDoc comments
  // are inherited from the interface and do not need to be rewritten here.
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
    
  
  public int addStamina(int addition) {
    stamina = stamina + addition;
    if (stamina > 10) {
      stamina = 10;
    }
    return stamina;
  }
  
  public int decreaseStamina(int deletion) {
    stamina = stamina - deletion;
    if (stamina < 0) {
      stamina = 0;
    }
    return stamina;
  }
  
  public int getStamina() {
    return stamina;
  }
  
  
  public int addStrength(int addition) {
    strength = strength + addition;
    if (strength > 10) {
      strength = 10;
    }
    return strength;
  }
  
  public int decreaseStrength(int deletion) {
    strength = strength - deletion;
    if (strength < 0) {
      strength = 0;
    }
    return strength;
  }
  
  public int getStrength() {
    return strength;
  }
  
  
  public void setCurrentRoom(int currentRoom) {
    this.currentRoom = currentRoom;
  }
  
  public int getCurrentRoom() {
    return currentRoom;
  }
  
  
  public boolean isDead() {
    if (stamina == 0) {
      isDead = true;
    }
    return isDead;
  }
  
  public void setDead(boolean x) {
    isDead = x;
  }
  
  /**
   * Implemented from Comparable.
   * 
   * @return  the difference in strength between two Characters.
   */
  public int compareTo(Object other) {
    Character c = (Character) other;
    if (this.getStrength() < c.getStrength()) {
      return -1;
    } else if (this.getStrength() == this.getStrength()) {
      return 0;
    } else {
      return 1;
    }
  }
}