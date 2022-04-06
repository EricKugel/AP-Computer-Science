/**
 * A horse has a name and a weight.
 */
public interface Horse {
  // In an interface, methods are abstract by default.
  // Though we normally declare interface methods as public, they are public by default.
  // This is why the abstract methods below are acceptable as written.
  
  /**
   * Returns the name of this horse.
   * 
   * @return  the horse's name
   */
  String getName();
  
  /** 
   * Returns the weight of this horse.
   * 
   * @return  the horse's weight
   */
  int getWeight();
  
}