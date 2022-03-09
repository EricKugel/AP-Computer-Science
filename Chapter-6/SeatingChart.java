import java.util.List;

/** 
 * A seating chart contains the arrangement of students in a classroom, as well as the
 * option to remove absent students.
 */
public class SeatingChart {
  /** seats[r][c] represencts the Student in row r and column c in the classroom. */
  private Student[][] seats;
  
  /** 
   * Creates a seating chart with the given number of rows and columns from the students in
   * studentList. Empty seats in the seating chart are represented by null.
   * Precondition: rows > 0; cols > 0;
   *               rows * columns >= studentList.size()
   * Postcondition:
   *  - Students appear in the seating chart in the same order as they appear
   *    in studentList, starting at seats[0][0].
   *  - seats is filled column by column from studentList, followed by any
   *    empty seats (represented by null).
   *  - studentList is unchanged.
   * 
   * @param rows  the number of rows of seats in the classroom
   * @param cols  the number of columns of seats in the classroom
   */
  public SeatingChart(List<Student> studentList, int rows, int cols) {
    seats = new Student[rows][cols];
    int studentIndex = 0;
    for (int col = 0; col < cols; col++) {
      for (int row = 0; row < rows; row++) {
        if (studentIndex < studentList.size()) {
          seats[row][col] = studentList.get(studentIndex);
        } else {
          seats[row][col] = null;
        }
        studentIndex++;
      }
    }
  }
  
  
  /** 
   * Removes students who have more than a given number of absences from the
   * seating chart, replacing those entries in the seating chart with null
   * and returns the number of students removed.
   * Postcondition:
   *  - All students with allowedAbsences or fewer are in their original positions in seats.
   *  - No student in seats has more than allowedAbsences absences.
   *  - Entries without students contain null.
   * 
   * @param   allowedAbsences as integer >=0
   * @return  number of students removed from seats
   */
  public int removeAbsentStudents(int allowedAbsences) {
    int removed = 0;
    for (int row = 0; row < seats.length; row++) {
      for (int col = 0; col < seats[0].length; col++) {
        if (seats[row][col] != null && seats[row][col].getAbsenceCount() > allowedAbsences) {
          seats[row][col] = null;
          removed++;
        }
      }
    }
    return removed;
  }
  
  
  /** 
   * Creates a string representation of the object.
   * 
   * @return  a string representation of the object
   */
  public String toString() {
    String output = "";
    for (int row = 0; row < seats.length; row++) {
      for (int col = 0; col < seats[0].length; col++) {
        Student student = seats[row][col];
        if (student == null) {
          output += "null\t\t";
        } else {
          output += student.getName() + "\t" + student.getAbsenceCount() + "\t";
        }
      }
      output += "\n";
    }
    return output;
  }
  
  
}