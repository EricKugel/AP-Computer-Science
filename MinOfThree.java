// MinOfThree Program
// Determines the smallest value of three inputs
// Adapted from Java Software Solutions, page 129

import java.util.Scanner;

public class MinOfThree {
  // Reads three integers from the user and determines the smallest value
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter three integers: ");
    int num1 = userInput.nextInt();
    int num2 = userInput.nextInt();
    int num3 = userInput.nextInt();
    
    int min = 0;
    
    if (num1 < num2) {
      if (num1 < num3) {
        min = num1;
      } 
      else {
        min = num3;
      }
    } 
    else {
      if (num2 < num3) {
        min = num2;
      }
      else {
        min = num3;
      }
    }
      
    System.out.println("Minimum value: " + min);
  }
}