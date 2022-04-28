import java.util.ArrayList;

/**
 * TestResultsDrive contains a main method to test a TestResults object.
 * 
 * The drive constructs a TestResults object, invokes the highestScoringStudent
 * method, and prints the result.
 */
public class TestResultsDriver {
  public static void main(String[] args) {
    ArrayList<String> key = new ArrayList<String>();
    key.add("A");
    key.add("C");
    key.add("D");
    key.add("E");
    key.add("B");
    key.add("C");
    key.add("E");
    key.add("B");
    key.add("B");
    key.add("C");
    
    ArrayList<String> answers1 = new ArrayList<String>();
    answers1.add("A");
    answers1.add("B");
    answers1.add("D");
    answers1.add("E");
    answers1.add("A");
    answers1.add("C");
    answers1.add("?");
    answers1.add("B");
    answers1.add("D");
    answers1.add("C");
    StudentAnswerSheet student1 = new StudentAnswerSheet("Charlie", answers1);
    System.out.println(student1.getScore(key));

    ArrayList<String> answers2 = new ArrayList<String>();
    answers2.add("A");
    answers2.add("C");
    answers2.add("D");
    answers2.add("E");
    answers2.add("A");
    answers2.add("C");
    answers2.add("E");
    answers2.add("B");
    answers2.add("?");
    answers2.add("C");
    StudentAnswerSheet student2 = new StudentAnswerSheet("Lucy", answers2);
    System.out.println(student2.getScore(key));
    
    ArrayList<String> answers3 = new ArrayList<String>();
    answers3.add("A");
    answers3.add("C");
    answers3.add("D");
    answers3.add("E");
    answers3.add("B");
    answers3.add("C");
    answers3.add("E");
    answers3.add("B");
    answers3.add("B");
    answers3.add("C");
    StudentAnswerSheet student3 = new StudentAnswerSheet("Snoopy", answers3);
    System.out.println(student3.getScore(key));
    
    ArrayList<String> answers4 = new ArrayList<String>();
    answers4.add("A");
    answers4.add("C");
    answers4.add("D");
    answers4.add("E");
    answers4.add("B");
    answers4.add("C");
    answers4.add("E");
    answers4.add("B");
    answers4.add("C");
    answers4.add("B");
    StudentAnswerSheet student4 = new StudentAnswerSheet("Schroeder", answers4);
    System.out.println(student4.getScore(key));
    
    ArrayList<StudentAnswerSheet> sheets = new ArrayList<StudentAnswerSheet>();
    sheets.add(student1);
    sheets.add(student2);
    sheets.add(student3);
    sheets.add(student4);
    
    TestResults testChapter1 = new TestResults(sheets);
    System.out.println(testChapter1.highestScoringStudent(key));
  }
}