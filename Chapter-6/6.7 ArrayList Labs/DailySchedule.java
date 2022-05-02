import java.util.ArrayList;

/**
 * A daily schedule is a list of appointments that can be appended to and cleared.
 */
public class DailySchedule {
  /** Contains non-overlapping Appointment objects. */
  private ArrayList<Appointment> apptList;
  
  /**
   * Constructs a DailySchedule by instantiating apptList.
   */
  public DailySchedule() {
    apptList = new ArrayList<Appointment>();
  }
  
  /**
   * Removes all appointments that overlap the given Appointment.
   * 
   * Postcondition: all appointments that have a time conflict with
   *                appt have been removed from this DailySchedule
   */
  public void clearConflicts(Appointment appt) {
    for (int i = 0; i < apptList.size(); i++) {
      if (apptList.get(i).conflictsWith(appt)) {
        apptList.remove(i);
        i--;
      }
    }
  }
  
  
  /** 
   * Clears any overlapping appointments if emergency is true, and adds
   * appt to this DailySchedule; otherwise, if there are no conflicting
   * appointments, adds appt to this DailySchedule;
   * 
   * @return  true if the appointment was added;
   *          false, otherwise.
   */
  public boolean addAppt(Appointment appt, boolean emergency) {
    if (emergency) {
      clearConflicts(appt);
      apptList.add(appt);
      return true;
    } else {
      boolean conflicts = false;
      for (Appointment appointment : apptList) {
        if (appointment.conflictsWith(appt)) {
          conflicts = true;
          break;
        }
      } if (!conflicts) {
        apptList.add(appt);
        return true;
      }
    }
    return false;
  }
  
  
  /** 
   * Returns a string representation of the object.
   * Not included in the original AP question.
   * 
   * @return  a string representation of the object
   */
  public String toString() {
    String output = "";
    for (Appointment item : apptList) {
      output += item + "\n";
    }
    return output;
  }
}