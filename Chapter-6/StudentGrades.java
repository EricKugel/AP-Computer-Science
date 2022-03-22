import java.util.Scanner;

/**
 * StudentGrades contains a main method that stores and accesses students' grades in a 2D array.
 */
public class StudentGrades {
  public static void main(String[] args) {
    /* Prints the introductory information.
     * You don't need to change or add anything here.
     */
    System.out.println("Precalculus Honors");
    System.out.println("Student Test Grades");
    System.out.println();
    System.out.println("ID Num " + "\t" + "T1" + "\t" + "T2" + "\t" + "T3" + "\t" + "Avg");
    
    /* The two-dimensional array that contains all the grades.
     * Each row contains the student's ID number in the first slot,
     * followed by the student's first three test grades.
     */
    int[][] grades = new int[5][5]; 
    grades[0][0] = 4550801; grades[0][1] = 89; grades[0][2] = 94; grades[0][3] = 91;
    grades[1][0] = 4354202; grades[1][1] = 67; grades[1][2] = 90; grades[1][3] = 87;
    grades[2][0] = 5673001; grades[2][1] = 70; grades[2][2] = 93; grades[2][3] = 96;
    grades[3][0] = 3490200; grades[3][1] = 75; grades[3][2] = 85; grades[3][3] = 98;
    
    /* to be implemented in part (a) */
    grades[4][0] = 4956924; grades[4][1] = 90; grades[4][2] = 64; grades[4][3] = 100;
    
    /* to be implemented in part (b) */
    for (int studentIndex = 0; studentIndex < grades.length; studentIndex++) {
      int[] student = grades[studentIndex];
      int sum = 0;
      for (int gradeIndex = 1; gradeIndex < 4; gradeIndex++) {
        sum += student[gradeIndex];
      }
      double average = sum / 3.0;
      student[4] = (int) average;
    }
    
    /* to be implemented in part (c) */
    for (int[] student : grades) {
      for (int item : student) {
        System.out.print(item + "\t");
      }
      System.out.println();
    }
    
    Scanner userInput = new Scanner(System.in);
    System.out.println("\nEnter your student ID: ");
    int userID = userInput.nextInt();
    userInput.close();
    
    System.out.println("Your scores: ");
    String output = "";
    /* to be implemented in part (d) */
    for (int studentIndex = 0; studentIndex < grades.length; studentIndex++) {
      if (grades[studentIndex][0] == userID) {
        for (int gradeIndex = 1; gradeIndex < 4; gradeIndex++) {
          output += grades[studentIndex][gradeIndex] + "\t";
        }
      }
    }
    System.out.println(output);
  }
}