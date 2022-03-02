public class NumberPair {
  private double num1 = 0.0;
  private double num2 = 0.0;
  
  public NumberPair(double num1, double num2) {
    this.num1 = num1;
    this.num2 = num2;
  }
  
  public double getNum1() {
    return num1;
  }
  
  public double getNum2() {
    return num2;
  }

  public double calculateArithmeticMean() {
    return (num1 + num2) / 2;
  }
  
  public double calculateGeometricMean() {
    return Math.sqrt(num1 * num2);
  }
  
  public double calculateHypotenuse() {
    return Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
  }
  
  public boolean isMadeOfInts() {
    return num1 % 1 == 0 && num2 % 1 == 0;
  }
  
  public String toString() {
    String output = "For the numbers ";
    if (num1 < num2) {
      output += num1 + " and " + num2 + "\n";
    } else {
      output += num2 + " and " + num1 + "\n";
    }
    
    output += "The arithmetic mean is " + calculateArithmeticMean();
    output += "\nThe geometric mean is " + calculateGeometricMean();
    output += "\nThe hypotenuse is " + calculateHypotenuse();
    output += "\n";
    
    return output;
  }
}