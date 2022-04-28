import java.util.ArrayList;

/**
 * A student answer sheet is comprised of the student's name and its list of answers,
 * which can be analyzed to obtain a score.
 */
public class StudentAnswerSheet {
  private String studentName;
  private ArrayList<String> answers;
  
  /** 
   * Constructs a new StudentAnswerSheet by instantiating instance variables.
   * Not included in the original AP question.
   * 
   * @param studentName  the student's name
   * @param answers      the list of answers, given as strings
   */
  public StudentAnswerSheet(String studentName, ArrayList<String> answers) {
    this.studentName = studentName;
    this.answers = answers;
  }
  
  /**
   * Returns this student's test score.
   * Precondition: key.size() is equal to the number of answers in this answer sheet
   * 
   * @param key the list of correct answers, represented as strings of length one
   * @return this student's test score
   */
  public double getScore(ArrayList<String> key) {
    double score = 0.0;
    for (int i = 0; i < answers.size(); i++) {
      if (!answers.get(i).equals("?")) {
        score += answers.get(i).equals(key.get(i)) ? 1 : -0.25;
      }
    }
    return score;
  }
  
  
  /** 
   * Returns the name of the student.
   * Not implemented in original AP question.
   * 
   * @return  the name of the student
   */
  public String getName() {
    return studentName;
  }
  
}