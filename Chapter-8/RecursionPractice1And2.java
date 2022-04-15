public class RecursionPractice1And2 {
  //------------------------------------------------------------------------------------
  // Example 1: Count Down
  //------------------------------------------------------------------------------------
  
  /* counts down from num to 1 WITHOUT recursion and PRINTS String */
  public static void countDownIterationReturnVoid(int num) {
    while (num > 0) {
      System.out.print("" + num + (num > 1 ? ", " : ""));
      num--;
    }
  }
  
  
  /* counts down from num to 1 WITHOUT recursion and RETURNS String */
  public static String countDownIterationReturnString(int num) {
    String output = "";
    while (num > 0) {
      output += "" + num + (num > 1 ? ", " : "");
      num--;
    }
    return output;
  }
  
  
  /* counts down from num to 1 WITH recursion and PRINTS String */
  public static void countDownRecursionReturnVoid(int num) {
    if (num == 1) {
      System.out.print("1");
    } else {
      System.out.print(num + ", ");
      countDownRecursionReturnVoid(num - 1);
    }
  }
  
  
  /* counts down from num to 1 WITH recursion and RETURNS String */
  public static String countDownRecursionReturnString(int num) {
    if (num == 1) {
      return "1";
    } else {
      return num + ", " + countDownRecursionReturnString(num - 1);
    }
  }
  
  
  //------------------------------------------------------------------------------------
  // Example 2: Count Down and Up
  //------------------------------------------------------------------------------------
  
  /* counts down from num to 1 and back up WITHOUT recursion and PRINTS String */
  public static void countDownUpIterationReturnVoid(int num) {
    int n = num;
    while (n > 0) {
      System.out.print(n + ", ");
      n--;
    }
    n++;
    
    while (n < num) {
      n++;
      System.out.print(n + (n != num ? ", " : ""));
    }
  }
  
  
  /* counts down from num to 1 and back up WITHOUT recursion and RETURNS String */
  public static String countDownUpIterationReturnString(int num) {
    String output = "";
    int n = num;
    while (n > 0) {
      output += n + ", ";
      n--;
    }
    n++;
    
    while (n < num) {
      n++;
      output += n + (n != num ? ", " : "");
    }
    return output;
  }
  
  
  /* counts down from num to 1 and back up WITH recursion and PRINTS String */
  public static void countDownUpRecursionReturnVoid(int num) {
    if (num == 1) {
      System.out.print("1, ");
    } else {
      System.out.print(num + ", ");
      countDownUpRecursionReturnVoid(num - 1);
      System.out.print(num + ", ");
    }
  }
  
  
  /* counts down from num to 1 and back up WITH recursion and RETURNS String */
  public static String countDownUpRecursionReturnString(int num) {
    String output = "";
    if (num == 1) {
      output = "1, ";
    } else {
      output = num + ", " + countDownUpRecursionReturnString(num - 1) + num + ", ";
    }
    return output;
  }
  
  
  //------------------------------------------------------------------------------------
  // Main Method: test all methods here
  //------------------------------------------------------------------------------------
  
  public static void main(String[] args) {
    /* Tests base cases for Example 1 */
    System.out.println("Base cases for Example 1:");
    countDownIterationReturnVoid(1);  
    System.out.println("\n" + countDownIterationReturnString(1));
   countDownRecursionReturnVoid(1);
    System.out.println("\n" + countDownRecursionReturnString(1) + "\n");
    /* Tests successive (non-base) cases for Example 1 */
    System.out.println("Successive (non-base) cases for Example 1:");
    countDownIterationReturnVoid(6);  
    System.out.println("\n" + countDownIterationReturnString(7));
   countDownRecursionReturnVoid(8);
    System.out.println("\n" + countDownRecursionReturnString(9) + "\n");
    
    /* Tests base cases for Example 2 */
    System.out.println("Base cases for Example 2:");
    countDownUpIterationReturnVoid(1);  
    System.out.println("\n" + countDownUpIterationReturnString(1));
    countDownUpRecursionReturnVoid(1);
    System.out.println("\n" + countDownUpRecursionReturnString(1) + "\n");
    /* Tests successive (non-base) cases for Example 2 */
    System.out.println("Successive (non-base) cases for Example 2:");
    countDownUpIterationReturnVoid(6);  
    System.out.println("\n" + countDownUpIterationReturnString(7));
    countDownUpRecursionReturnVoid(8);
    System.out.println("\n" + countDownUpRecursionReturnString(9) + "\n");
  }
  
}