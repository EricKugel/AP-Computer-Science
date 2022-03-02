public class SelfDivisor
{
  /** @param number the number to be tested.
    *        Precondition: number > 0
    * @return true if every decimal digit of number is a divisor of number
    *         false otherwise.
    */
  public static boolean isSelfDivisor(int number) {
    int originalNumber = number;
    while (number > 0) {
      int digit = number % 10;
      if (digit == 0 || originalNumber % digit != 0) {
        return false;
      }
      number /= 10;
    }
    return true;
  }
  
  
  /** @param start starting point for values to be checked.
    *        Precondition: start > 0
    * @param num the size of the array to be returned.
    *        Precondition: num > 0
    * @return an array containing the first num integers >= start that are self-divisors.
    */
  public static int[] firstNumSelfDivisors(int start, int num) {
    int[] firstDivisors = new int[num];
    for (int i = 0; i < firstDivisors.length; i++) {
      while (!isSelfDivisor(start)) {
        start += 1;
      }
      firstDivisors[i] = start;
      start += 1;
    }
    return firstDivisors;
  }
  
  
}