/**
 * An appointment contains the time interval, which can be checked for conflicts.
 */
public class Appointment {
  private TimeInterval time = null;
  
  /**
   * Constructs an Appointment object by instantiating time interval.
   * Not included in the original AP question.
   * 
   * @param time  the time interval of this appointment
   */
  public Appointment(TimeInterval time) {
    this.time = time;
  }
  
  /**
   * Returns the time interval of this appointment.
   * Not implemented in the original AP question.
   * 
   * @return  the time interval of this appointment
   */
  public TimeInterval getTime() {
    return time;
  }
  
  /** 
   * Determines if this appointment conflicts with other appointment.
   * 
   * @return true if the time interval of this Appointment
   *              overlaps with the time interval of the other;
   *         false, otherwise.
   */
  public boolean conflictsWith(Appointment other) {
    return getTime().overlapsWith(other.getTime());
  }
  
  
  /**
   * Returns a string represntation of the object.
   * Not included in the original AP question.
   * 
   * @return  a String representation of the object
    */
  public String toString() {
    return time.toString();
  }
}