/**
 * An Arabian is a horse.
 * This class is not included in the original AP question.
 */
public class Arabian implements Horse {
  private String name = null;
  private int weight = 0;
  
  /** 
   * Constructs an Arabian object.
   * 
   * @param name    the name of this Arabian horse
   * @param weight  the weight of this Arabian horse
   */
  public Arabian(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }
  
  /**
   * Returns the name of this Arabian horse.
   * Implements the getName method in Horse.
   * 
   * @return  this Arabian horse's name
   */
  public String getName() {
    return name;
  }
  
  /** 
   * Returns the name of this Arabian horse.
   * Implements the getWeight method in Horse.
   * 
   * @return  this Arabian horse's weight
   */
  public int getWeight() {
    return weight;
  }
  
  /**
   * Returns the name and weight of this Arabian horse.
   * Overrides the toString methods in Object.
   * 
   * @return  a string representation of the object
   */
  @Override
  public String toString() {
    return name + ": " + weight;
  }
  
}