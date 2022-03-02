/**
 * A group is comprised of a pair of undergraduate students, who can be switched.
 * The group average can be calculated.
 */
public class Group {
  // instance variables
  private Undergrad student1 = null;
  private Undergrad student2 = null;
  
  /** 
   * Constructs a Group object by initializing instance variables to parameter values.
   *
   * @param aStudent1  the first undergraduate student
   * @param aStudent2  the second undergraduate student
   */
  public Group(Undergrad aStudent1, Undergrad aStudent2) {
    student1 = aStudent1;
    student2 = aStudent2;
  }
  
  /**
   * Calculates the average score of both undergraduate students in this group.
   * 
   * @return  the average score
   */
  public double calculateGroupAverage() {
    return (student1.calculateAverage() + student2.calculateAverage()) / 2.0;
  }
  
  
  /**
   * Switches new undergraduate student into this group, if the student to be replaced is found.
   */
  public void switchStudent(Undergrad newStudent, Undergrad oldStudent) {
    if (oldStudent.getName().equals(student1.getName())) {
      student1 = newStudent;
    } else if (oldStudent.getName().equals(student2.getName())) {
      student2 = newStudent;
    } else {
      System.out.println("Student \"" + oldStudent.getName() + "\" not found");
    }
  }
  
  
  /**
   * Returns the names of both undergraduate students in this group, as well as their group average.
   * 
   * @return  a string representation of the object.
   */
  public String toString() {
    String output = student1.getName() + " and " + student2.getName();
    output += " have a group average of " + calculateGroupAverage();
    return output;
  }
  
}