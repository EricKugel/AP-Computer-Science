public class NumberCubeTester 
{
  /** Returns an array of the values obtained by tossing a number cube numTosses times.
    * @param cube a numberCube
    * @param numTosses the number of tosses to be recorded
    *        Precondition: numTosses > 0
    * @return an array of numTosses values
    */
  public static int[] getCubeTosses(NumberCube cube, int numTosses) {
    int[] result = new int[numTosses];
    for (int i = 0; i < result.length; i++) {
      result[i] = cube.toss();
    }
    return result;
  }
  
  
  /** Returns the starting index of a longest run of two or more consecutive repeated values
    * in the array values.
    * @param values an array of integer values representing a series of number cube tosses
    *        Precondition: values.length > 0
    * @return the starting index of a run of maximum size;
    *         -1 is there is no run
    */
  public static int getLongestRun(int[] values) {
    int longestRunSize = 1;
    int longestRunIndex = -1;
    int currentRunSize = 0;
    int currentRunValue = -1;

    for (int i = 0; i < values.length; i++) {
      int value = values[i];
      if (value == currentRunValue) {
        currentRunSize += 1;
      } else {
        currentRunSize = 1;
        currentRunValue = value;
      }

      if (currentRunSize > longestRunSize) {
        longestRunSize = currentRunSize;
        longestRunIndex = i - currentRunSize + 1;
      }
    }

    return longestRunIndex;
  }
  
  
  public static void main(String[] args) {
    NumberCube myCube = new NumberCube();
    int[] randomResult = getCubeTosses(myCube, 10);
    for (int i = 0; i < randomResult.length; i++) {
      System.out.print(randomResult[i] + ", ");
    }
    
    int[] exampleResult = {1, 5, 5, 4, 3, 1, 2, 2, 2, 2, 6, 1, 3, 3, 5, 5, 5, 5};
    System.out.println("\n" + getLongestRun(exampleResult)); // Should return 6 or 14
    
    int[] otherResult1 = {1, 2, 3};
    System.out.println( getLongestRun(otherResult1)); // Should return -1
    
    int[] otherResult2 = {1, 2, 3, 3};
    System.out.println(getLongestRun(otherResult2)); // Should return 2
  }
  
}