import java.util.ArrayList;
import java.util.List;

/**
 * MultipleGroups contains a list of groups, as well as methods to revise and
 * analyze the groups.
 */
public class MultipleGroups implements NumberGroup {
  private List<NumberGroup> groupList = null;

  /**
   * Constructs a MultipleGroups by instantiating groupList.
   * Not included in the original AP question.
   */
  public MultipleGroups() {
    groupList = new ArrayList<NumberGroup>();
  }

  /**
   * Adds param to groupList.
   * Not included in the original AP question.
   * 
   * @param group  the NumberGroup to be added
   */
  public void addGroup(NumberGroup group) {
    groupList.add(group);
  }

  /**
   * Returns true if at least one of the number groups in this multiple group contains num;
   *         false otherwise.
   *
   * @param num  the integer to be found, if possible
   * @return     true if num is found in groupList;
   *             false otherwise
   */
  public boolean contains(int num) {
    for (NumberGroup group : groupList) {
      if (group.contains(num)) {
        return true;
      }
    }
    return false;
  }


}
