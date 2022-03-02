import java.util.ArrayList;

/** 
 * TestGrades contains a main method to construct and manipulate ArrayLists.
 */ 
public class TestGrades {
  public static void main (String[] args) {
    // Make an empty ArrayList that will hold the test grades of a class (grades will be Doubles)
    ArrayList<Double> grades = new ArrayList<Double>();
    
    // Add twenty-five grades to the list
    for (int i = 0; i < 25; i++) {
      grades.add(Math.random() * 100);
    }
    
    // Calculate the average (double) test grade
    // Use a for-each loop to do this
    double sum = 0;
    for (double grade : grades) {
      sum += grade;
    }
    double average = sum / grades.size();
        
    // Find the lowest score
    // Use a for loop to do this
    double min = grades.get(0);
    for (int i = 0; i < grades.size(); i++) {
      if (grades.get(i) < min) {
        min = grades.get(i);
      } 
    }
       
    // Find the highest score
    // Use a for-each loop to do this
    double max = grades.get(0);
    for (double grade : grades) {
      if (grade > max) {
        max = grade;
      }
    }
    
    // Print all the info
    System.out.println("There are " + grades.size() + " students in this class.");
    System.out.println("The class average was " + average);
    System.out.println("The lowest score was " + min);
    System.out.println("The highest score was " + max);
    
    // Print out a graph to show grade distribution like so:
    // A: *****
    // B: ***
    // C: *
    // D:
    // F: *
    // It should still print the correct graph if you change some of the values in the ArrayList
    String[] letters = {"A", "B", "C", "D", "F"};
    int[] gradePoints = {90, 80, 70, 60, 0};
    int[] count = new int[5];
    for (double grade : grades) {
      for (int gradePointIndex = 0; gradePointIndex < gradePoints.length; gradePointIndex++) {
        if (grade > gradePoints[gradePointIndex]) {
          count[gradePointIndex]++;
          break;
        }
      }
    }

    for (int gradePointIndex = 0; gradePointIndex < gradePoints.length; gradePointIndex++) {
      System.out.print(letters[gradePointIndex] + ": ");
      for (int i = 0; i < count[gradePointIndex]; i++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
