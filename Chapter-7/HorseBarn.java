/**
 * A horse barn contains spaces for horses that can be consolidated.
 */
public class HorseBarn {
  /**
   * The spaces in the barn.  Each array element holds a reference to the horse
   * that is currently occupying the space.  A null value indicates an empty space.
   */
  private Horse[] spaces;
  
  /** 
   * Constructs a HorseBarn object by instantiating spaces array to represent
   * the number of spaces to house horses.
   * Not included in the original AP question.
   * 
   * @param num  the length of the array
   */
  public HorseBarn(int num) {
    spaces = new Horse[num];
  }
  
  /** 
   * Adds horse object to appropriate index in spaces.
   * Not included in the original AP question.
   * 
   * @param index  the index to be placed into
   * @param horse  the horse object to be added
   */
  public void addHorse(int index, Horse horse) {
    spaces[index] = horse;
  }
  
  /** 
   * Returns the index of the space that contains the horse with the specified name.
   * Precondition: No two horses in the barn have the same name.
   * 
   * @param name  the name of the horse to find
   * @return      the index of the space containing the horse with the specified name;
   *              -1 if no horse with the specified name is in the barn.
   */
  public int findHorseSpace(String name) {
    for (int i = 0; i < spaces.length; i++) {
      if (spaces[i] != null) {
        if (spaces[i].getName().equals(name)) {
          return i;
        }
      }
    }
    return -1;
  }
  
  
  /** 
   * Consolidates the barn by moving horses so that the horses are in adjacent spaces,
   * starting at index 0, with no empty space between any two horses.
   * Postcondition: The order of the horses is the same as before the consolidation.
   */
  public void consolidate() {
    
  }
  
  
  /** 
   * Returns a string representing the spaces in this horse barn, one per line.
   * Overrides the equals method in Object.
   * Not included in the original AP question.
   * 
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    String output = "";
    for (Horse item : spaces) {
      if (item == null) {
        output += "null \n";
      } else {
        output += item.toString() + "\n";
      }
    }
    return output;
  }
  
}