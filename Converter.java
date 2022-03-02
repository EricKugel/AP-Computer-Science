public class Converter {
  public static int convertToDecimal(int number, int base) {
    int output = 0;
    int place = 0;
    while (number > 0) {
      int digit = number % 10;
      output += digit * Math.pow(base, place);
      number /= 10;
      place++;
    }
    return output;
  }
  public static int convertDecimal(int number, int base) {
    int output = 0;
    int place = 0;
    while(number > 0) {
      int digit = number % base;
      output += digit * Math.pow(10, place);
      number /= base;
      place++;
    }
    return output;
  }
  public static void main(String[] arg0) {
    int[] nums = new int[] {111001, 115, 62, 1130};
    int[] bases = new int[] {2, 8, 10, 4};
    final int[] allBases = new int[] {2, 4, 8, 10};
    for (int numIndex = 0; numIndex < nums.length; numIndex++) {
      int num = nums[numIndex];
      int numBase = bases[numIndex];
      int decimal = convertToDecimal(num, numBase);
      for (int base : allBases) {
        System.out.print(convertDecimal(decimal, base) + "   \t");
      }
      System.out.println();
    }
  }
}