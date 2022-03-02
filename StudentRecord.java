public class StudentRecord
{
  /* contains scores.length values
   * scores.length > 1
   */
  private int[] scores;
  
  /** constructs a StudentRecord object */
  public StudentRecord(int[] theScores)
  {
    scores = theScores;
  }
  
  /** returns the average (arithmetic mean) of the values in scores
    * whose subscripts are between first and last, inclusive
    * precondition: 0 <= first <= last < scores.length
    */
  private double average(int first, int last) {
    int sum = 0;
    for (int i = first; i <= last; i++) {
      sum += scores[i];
    }
    return sum / (double) (last - first + 1);
  }
  
  
  /** returns true if each successive value in scores is greater
    * than or equal to the previous value;
    * otherwise, returns false
    */
  private boolean hasImproved() {
    int lastScore = scores[0];
    for (int score : scores) {
      if (score < lastScore) {
        return false;
      }
      lastScore = score;
    }
    return true;
  }
  
  
  /** if the values in scores have improved, returns the average
    * of the elements in scores with indexes greater than or equal
    * to scores.length/2;
    * otherwise, returns the average of all of the values in scores
    */
  public double finalAverage() {
    if (hasImproved()) {
      return average(scores.length / 2, scores.length - 1);
    } else {
      return average(0, scores.length - 1);
    }
  }
  
  
}