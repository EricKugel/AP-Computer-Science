import java.util.ArrayList;

/**
 * Club members is comprised of a list of members that can be added to,
 * removed from, and printed.
 */
public class ClubMembers {
  private ArrayList<MemberInfo> memberList;
  
  /** 
   * Constructs a ClubMembers object by instantiating memberList.
   * Not included in the original AP question.
   */ 
  public ClubMembers() {
    memberList = new ArrayList<MemberInfo>();
  }
  
  /**
   * Adds new club memebers to memberList, as described in part (a).
   * Precondition: names is a non-empty array.
   * 
   * @param names     the array of members' names to be added to the list
   * @param gradYear  the graduation year of all members being added
   */
  public void addMembers(String[] names, int gradYear) {
    for (String name : names) {
      memberList.add(new MemberInfo(name, gradYear, true));
    }
  }
  
  
  /**
   * Removes club memebers who have graduated and returns a list of members who have graduated
   * and are in good standing, as described in part (b).
   * 
   * @param year  the graduation year of all members to be removed
   * @return      a list of members who have graduated and are in good standing 
   */
  public ArrayList<MemberInfo> removeMembers(int year) {
    ArrayList<MemberInfo> gradMembers = new ArrayList<MemberInfo>();
    for (int i = 0; i < memberList.size(); i++) {
      MemberInfo member = memberList.get(i);
      if (member.getGradYear() <= year) {
        memberList.remove(i);
        i -= 1;
        if (member.inGoodStanding()) {
          gradMembers.add(member);
        }
      }
    }
    return gradMembers;
  }
  
  
  /**
   * Changes standing of all members in names.
   * Not included in the original AP question.
   * 
   * @param names  the names of any members whose standings are to be changed
   */
  public void changeStandings(String[] names) {
    for (String item : names) {
      for (int i = 0; i < memberList.size(); i++) {
        if (item.equals(memberList.get(i).getName())) {
          memberList.get(i).changeStanding();
        }
      }
    }
  }         
  
  /**
   * Returns the info of each member as a string.
   * Not included in the original AP question.
   * 
   * @return  a string representation of the object
   */
  public String toString() {
    String output = "";
    for (MemberInfo item : memberList) {
      output += item + "\n";
    }
    return output;
  }
  
}