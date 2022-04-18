public class RecursionPractice3And4 {
  //------------------------------------------------------------------------------------
  // Example 3: Count To 100
  //------------------------------------------------------------------------------------
  
  /* counts up from num to 100 WITHOUT recursion and PRINTS String */
  public static void countTo100IterationReturnVoid(int num) {
    for (int i = num; i <= 100; i++) {
      System.out.print(i + " ");
    }
  }
  
  
  /* counts up from num to 100 WITHOUT recursion and RETURNS String */
  public static String countTo100IterationReturnString(int num) {
    String output = "";
    for (int i = num; i <= 100; i++) {
      output += i + " ";
    }
    return output;
  }
  
  
  /* counts up from num to 100 WITH recursion and PRINTS String */
  public static void countTo100RecursionReturnVoid(int num) {
    if (num == 100) {
      System.out.print("100");
    } else {
      System.out.print(num + " ");
      countTo100RecursionReturnVoid(num + 1);
    }
  }
  
  
  /* counts up from num to 100 WITH recursion and RETURNS String */
  public static String countTo100RecursionReturnString(int num) {
    return (num == 100) ? "100" : num + " " + countTo100RecursionReturnString(num + 1);
  }
  
  
  //------------------------------------------------------------------------------------
  // Example 4: Factorial
  //------------------------------------------------------------------------------------
  
  /* finds the factorial of num WITHOUT recursion and PRINTS int */
  public static void factorialIterationReturnVoid(int num) {
    int answer = 1;
    for (int i = 1; i <= num; i++) {
      answer *= i;
    }
    System.out.print(answer);
  }
  
  
  /* finds the factorial of num WITHOUT recursion and RETURNS int */
  public static int factorialIterationReturnInt(int num) {
    int answer = 1;
    for (int i = 1; i <= num; i++) {
      answer *= i;
    }
    return answer;
  }
  
  
  /* finds the factorial of num WITH recursion and RETURNS int */
  public static int factorialRecursionReturnInt(int num) {
    return (num == 1) ? 1 : num * factorialRecursionReturnInt(num - 1);
  }
  
  
  //------------------------------------------------------------------------------------
  // Main Method: test all methods here
  //------------------------------------------------------------------------------------
  
  public static void main(String[] args) {
   /* Tests base cases for Example 3 */
   System.out.println("Base cases for Example 3:");
   countTo100IterationReturnVoid(100);  
   System.out.println("\n" + countTo100IterationReturnString(100));
   countTo100RecursionReturnVoid(100);
   System.out.println("\n" + countTo100RecursionReturnString(100) + "\n");
   /* Tests successive (non-base) cases for Example 3 */
   System.out.println("Successive (non-base) cases for Example 3:");
   countTo100IterationReturnVoid(86);  
   System.out.println("\n" + countTo100IterationReturnString(87));
   countTo100RecursionReturnVoid(88);
   System.out.println("\n" + countTo100RecursionReturnString(89) + "\n");
    
   /* Tests base cases for Example 4 */
   System.out.println("Base cases for Example 4:");
   factorialIterationReturnVoid(1);
   System.out.println();
   factorialIterationReturnVoid(2);
   System.out.println("\n" + factorialIterationReturnInt(1));
   System.out.println(factorialIterationReturnInt(2));
   System.out.println(factorialRecursionReturnInt(1));
   System.out.println(factorialRecursionReturnInt(2) + "\n");
   /* Tests successive (non-base) cases for Example 4 */
   System.out.println("Successive (non-base) cases for Example 4:");
   factorialIterationReturnVoid(6);  
   System.out.println("\n" + factorialIterationReturnInt(7));
   System.out.println(factorialRecursionReturnInt(8) + "\n");
  }
  
}