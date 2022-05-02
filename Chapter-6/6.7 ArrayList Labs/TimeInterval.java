/**
 * A time interval is comprised of the start and end times, that can be checked
 * for overlap with other time intervals.
 */
public class TimeInterval {
  private int startTime = -1;
  private int endTime = -1;
  
  /** 
   * Constructs a TimeInterval object.
   * Not included in the original AP question.
   * 
   * @param startTime  the start time in military time
   * @param endTime    the end time in military time
   */
  public TimeInterval(int startTime, int endTime) {
    this.startTime = startTime;
    this.endTime = endTime;
  }
  
  /**
   * Returns start time in military time.
   * Not included in the original AP question.
   * 
   * @return startTime  the time that the timeInterval begins
   */
  public int getStartTime() {
    return startTime;
  }
  
  /**
   * Returns end time in military time.
   * Not included in the original AP question.
   * 
   * @return endTime  the time that the timeInterval end
   */
  public int getEndTime() {
    return endTime;
  }
  
  /** 
   * Checks if this time interval overlaps with param interval.
   * Not implemented in the original AP question.
   * 
   * @return  true if interval overlaps with this TimeInterval;
   *          false, otherwise.
   */
  public boolean overlapsWith(TimeInterval interval) {
    if ((interval.getStartTime() < startTime && interval.getEndTime() > startTime) ||
        (interval.getStartTime() < endTime && interval.getEndTime() > endTime) ||
        (startTime < interval.getStartTime() && endTime > interval.getStartTime()) ||
        (startTime < interval.getEndTime() && endTime > interval.getEndTime())) {
      return true;
    } else {
      return false;
    }
  }
  
  /** 
   * Returns a string representation of the object.
   * Not included in the original AP question.
   * 
   * @return  a string representation of the object
   */
  public String toString() {
    return "" + startTime + " to " + endTime;
  }
}