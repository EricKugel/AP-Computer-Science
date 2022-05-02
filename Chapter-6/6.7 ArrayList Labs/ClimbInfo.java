/**
 * Climb info is comprised of the name of the peak climbed and the time
 * required to do so.
 */
public class ClimbInfo {
  private String peakName;
  private int climbTime;
  
  /** 
   * Creates ClimbInfo object with name peakName and time climbTime.
   * Not implemented in the original AP question.
   * 
   * @param peakName   the name of the mountain peak
   * @param climbTime  the number of minutes taken to complete the climb
   */
  public ClimbInfo(String peakName, int climbTime) {
    this.peakName = peakName;
    this.climbTime = climbTime;
  }
  
  /**
   * Returns the peak's name.
   * 
   * @return  the name of the mountain peak
   */
  public String getName() {
    return peakName;
  }
  
  /** 
   * Returns the total minutes required to climb.
   * 
   * @return  the number of minutes taken to complete the climb
   */
  public int getTime() {
    return climbTime;
  }
  
  /**
   * Returns a string representation of the object.
   * Not included in the original AP question.
   * 
   * @return  a string representation of the object
   */
  public String toString() {
    return peakName + ": " + climbTime;
  }
  
}