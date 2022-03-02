import jeliot.io.*;
import java.util.Scanner;

public class Positive {
    private static final String[] responses = {"Input must be positive.", "Hey! Make sure it's positive.", "Stop it! It must be positive!", "Do you even know what positive means?", "GREATER THAN ZERO!!", "AUUUUGGGGGGGHHHHHHHHH","..."};
    
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a positive value.");
        double input = scanner.nextDouble();
        int count = 0;
        while (input < 0) {
            System.out.println(responses[count % responses.length]);
            input = scanner.nextDouble();
            count++;
        }
        if (count == 0) {
            System.out.println("Thank you very much.");
        }
        
        else {
            System.out.println("THANK you. Hmphh.");
        }

    }
}