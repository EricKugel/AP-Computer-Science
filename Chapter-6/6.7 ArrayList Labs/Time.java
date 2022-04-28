/**
 * A time is measured in minutes from 12:00 a.m.
 */
public class Time {
  private int timeInMinutes = -1;
  
  /** 
   * Constructs a Time object by converting a string representing time into time in minutes measured from 12:00 a.m.
   * Not included in the oritinal AP question
   * 
   * @param timeString  the time as given on a digital display: ##:## a.m. or ##:## p.m.
   */
  public Time(String timeString) {
    String time = timeString.substring(0, timeString.indexOf(" "));
    String night = timeString.substring(timeString.length() - 4);
    boolean isPM = true;
    if (night.equals("a.m.")) {
      isPM = false;
    }
    int hours = 0;
    if (isPM) {
      hours = 12;
    }
    int additionalHours = Integer.parseInt(time.substring(0, time.indexOf(":")));
    if (additionalHours == 12) {
      additionalHours = 0;
    }
    hours += additionalHours;
    timeInMinutes = hours * 60 + Integer.parseInt(time.substring(time.indexOf(":") + 1));
  }
  
  public int getTimeInMinutes() {
    return timeInMinutes;
  }
  
  /** 
   * Returns the difference, in minutes, between this time and other; difference is negative if other is earlier than this time.
   * Not implemented in the original AP question.
   * 
   * @return  the difference, in minutes, between this time and other
   */
  public int minutesUntil(Time other) {
    return other.getTimeInMinutes() - this.timeInMinutes;
  }
  
  /** 
   * Returns a string representation of the object.
   * Not included in the original AP question.
   * 
   * @return  a string representation of the object
   */
  public String toString() {
    int hour = timeInMinutes / 60;
    boolean isPM = false;
    if (hour > 11) {
      isPM = true;
      if (hour > 12) {
        hour -= 12;
      }
    }
    if (hour == 0) {
      hour = 12;
    }
    int minutesLeft = timeInMinutes % 60;
    
    String output = "" + hour + ":" + minutesLeft;
    if (minutesLeft == 0) {
      output += 0;
    }
    if (!isPM) {
      output += " a.m.";
    } else {
      output += " p.m.";
    }
    return output;
  }
  
}