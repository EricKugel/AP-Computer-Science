import java.util.List;
import java.util.ArrayList;

/**
 * A climbing club contains a list of all climbs completed by the club that can
 * be added to and analyzed for distinct peaks.
 */
public class ClimbingClub {
  /** 
   * The list of climbs completed by members of the club.
   * Guaranteed not to be null.  Contains only non-null references.
   */
  private List<ClimbInfo> climbList;
  
  /**
   * Creates a new ClimbingClub object by instantiating climbList.
   */
  public ClimbingClub()
  {  climbList = new ArrayList<ClimbInfo>();  }
  
  /** 
   * Adds a new climb with name peakName and time climbTime to the list of climbs.
   * Alphabetical order is determined by the compareTo method of the String class.
   * Precondition: entries in climbList are in alphbetical order by name.
   * Postcondition: entries in climbList are in alphabetical order by name.
   * 
   * @param peakName   the name of the mountain peak climbed
   * @param climbTime  the number of minutes taken to complete the climb
   */
  public void addClimb(String peakName, int climbTime) {
    ClimbInfo info = new ClimbInfo(peakName, climbTime);
    for (int i = 0; i < climbList.size(); i++) {
      if (climbList.get(i).getName().compareTo(peakName) > 0) {
        climbList.add(i, info);
        return;
      }
    }
    climbList.add(info);
  }
  
  
  /** 
   * Returns the total number of different peaks climbed by the club.
   * 
   * @return  the number of distinct names in the list of climbs
   */
  public int distinctPeakNames() {
    ArrayList<String> peakNames = new ArrayList<String>();
    for (ClimbInfo info : climbList) {
      String name = info.getName();
      boolean distinct = true;
      for (String peak : peakNames) {
        if (peak.equals(name)) {
          distinct = false;
          break;
        }
      }

      if (distinct) {
        peakNames.add(name);
      }
    }
    return peakNames.size();
  }
  
  
  /**
   * Returns a string representation of the object.
   * Not included in the original AP question.
   * 
   * @return  a string representation of the object
   */
  public String toString() {
    String output = "";
    for(ClimbInfo item : climbList) {
      output += item.toString() + "\n";
    }
    return output;
  }
}