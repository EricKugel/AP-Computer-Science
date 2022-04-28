import java.util.ArrayList;

/**
 * Test results contain a list of student answer sheets, that can be analyzed to find the
 * highest scoring student.
 */
public class TestResults {
  private ArrayList<StudentAnswerSheet> sheets;
  
  /** 
   * Constructs a TestResults object by instantiating instance variable.
   * Not included in the original AP question.
   * 
   * @param sheets  the list of all student answers sheets
   */
  public TestResults(ArrayList<StudentAnswerSheet> sheets) {
    this.sheets = sheets;
  }
  
  /** 
   * Returns the name of the student with the highest score.
   * Precondition: sheets.size() > 0;
   *               all answer sheets in sheets have the same number of answers
   * Precondition: key.size() is equal to the number of answers
   *               in each of the answer sheets in sheets
   * 
   * @param   key the list of correct answers represented as strings of length one
   * @return  the name of the student with the highest score
   */
  public String highestScoringStudent(ArrayList<String> key) {
    double highestScore = Integer.MIN_VALUE;
    String student = "";
    for (StudentAnswerSheet sheet : sheets) {
      double score = sheet.getScore(key);
      if (score > highestScore) {
        highestScore = score;
        student = sheet.getName();
      }
    }
    return student;
  }
  
  
}