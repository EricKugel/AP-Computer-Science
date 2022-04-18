public class RecursionPractice5And6 {
  //------------------------------------------------------------------------------------
  // Example 5: Fibonacci
  //------------------------------------------------------------------------------------
  
  /* PRINTS the term in the Fibonacci Sequence at index num WITHOUT recursion */
  public static void fibonacciIterationReturnVoid(int num) {
    int a = 1;
    int b = 1;
    for (int i = 2; i <= num; i++) {
      int temp = b;
      b = a + b;
      a = temp;
    }
    System.out.print(b);
  }
  
  
  /* RETURNS the term in the Fibonacci Sequence at index num WITHOUT recursion */
  public static int fibonacciIterationReturnInt(int num) {
    int a = 1;
    int b = 1;
    for (int i = 2; i <= num; i++) {
      int temp = b;
      b = a + b;
      a = temp;
    }
    return b;
  }
  
  
  /* RETURNS the term in the Fibonacci Sequence at index num WITH recursion */
  public static int fibonacciRecursionReturnInt(int num) {
    return (num < 2) ? 1 : fibonacciRecursionReturnInt(num - 1) + fibonacciRecursionReturnInt(num - 2);
  }
  
  
  //------------------------------------------------------------------------------------
  // Example 6: Power
  //------------------------------------------------------------------------------------
  
  /* PRINTS base to the exponent of power WITHOUT recursion */
  public static void powerIterationReturnVoid(int base, int power) {
    int answer = 1;
    for (int i = 0; i < power; i++) {
      answer *= base;
    }
    System.out.print(answer);
  }
  
  
  /* RETURNS base to the exponent of power WITHOUT recursion */
  public static int powerIterationReturnInt(int base, int power) {
    int answer = 1;
    for (int i = 0; i < power; i++) {
      answer *= base;
    }
    return answer;
  }
  
  
  /* RETURNS base to the exponent of power WITH recursion */
  public static int powerRecursionReturnInt(int base, int power) {
    return (power == 0) ? 1 : base * powerRecursionReturnInt(base, power - 1);
  }
  
  
  //------------------------------------------------------------------------------------
  // Main Method: test all methods here
  //------------------------------------------------------------------------------------
  
  public static void main(String[] args) {
   /* Tests base cases for Example 5 */
   System.out.println("Base cases for Example 5:");
   fibonacciIterationReturnVoid(1);
   System.out.println();
   fibonacciIterationReturnVoid(2);
   System.out.println("\n" + fibonacciIterationReturnInt(1));
   System.out.println(fibonacciIterationReturnInt(2));
   System.out.println(fibonacciRecursionReturnInt(1));
   System.out.println(fibonacciRecursionReturnInt(2) + "\n");
   /* Tests successive (non-base) cases for Example 5 */
   System.out.println("Successive (non-base) cases for Example 5:");
   fibonacciIterationReturnVoid(6);  
   System.out.println("\n" + fibonacciIterationReturnInt(7));
   System.out.println(fibonacciRecursionReturnInt(8) + "\n");
    
   /* Tests base cases for Example 6 */
   System.out.println("Base cases for Example 6:");
   powerIterationReturnVoid(1, 0);
   System.out.println("\n" + powerIterationReturnInt(1, 0));
   System.out.println(powerRecursionReturnInt(1, 0) + "\n");
   /* Tests successive (non-base) cases for Example 6 */
   System.out.println("Successive (non-base) cases for Example 6:");
   powerIterationReturnVoid(2, 3);  
   System.out.println("\n" + powerIterationReturnInt(3, 4));
   System.out.println(powerRecursionReturnInt(4, 5) + "\n"); 
  }
  
}