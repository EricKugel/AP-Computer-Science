import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    ArrayList<String> numbers = new ArrayList<String>();
    File textFile = new File("6.7 Lab/input.txt");
    Scanner userInput = new Scanner(textFile);
    while (userInput.hasNextLine()) {
      numbers.add(userInput.nextLine());
    }

    // Your code to solve the puzzle!
    String gammaString = "";
    String epsilonString = "";
    for (int digitIndex = 0; digitIndex < numbers.get(0).length(); digitIndex++) {
        int numberOfOnes = 0;
        for (String number : numbers) {
            if (("" + number.charAt(digitIndex)).equals("1")) {
                numberOfOnes += 1;
            }
        }
        gammaString += numberOfOnes >= numbers.size() / 2 ? "1" : "0";
        epsilonString += numberOfOnes >= numbers.size() / 2 ? "0" : "1";
    }
    int gamma = Integer.parseInt(gammaString, 2);
    int epsilon = Integer.parseInt(epsilonString, 2);
    System.out.println("Part 1: " + (gamma * epsilon));

    ArrayList<String> oxygenNumbers = (ArrayList<String>) numbers.clone();
    for (int digitIndex = 0; digitIndex < oxygenNumbers.get(0).length(); digitIndex++) {
        int numberOfOnes = 0;
        for (String number : oxygenNumbers) {
            if (("" + number.charAt(digitIndex)).equals("1")) {
                numberOfOnes += 1;
            }
        }
        String mostCommon = numberOfOnes >= (oxygenNumbers.size() - numberOfOnes) ? "1" : "0";
        boolean done = false;
        for (int oxygenNumberIndex = 0; oxygenNumberIndex < oxygenNumbers.size() && !done; oxygenNumberIndex++) {
            if (!("" + oxygenNumbers.get(oxygenNumberIndex).charAt(digitIndex)).equals(mostCommon)) {
                oxygenNumbers.remove(oxygenNumberIndex);
                oxygenNumberIndex--;
            }
            if (oxygenNumbers.size() == 1) {
                done = true;
            }
        }
        if (done) {
            break;
        }
    }
    int oxygen = Integer.parseInt(oxygenNumbers.get(0), 2);

    ArrayList<String> co2Numbers = (ArrayList<String>) numbers.clone();
    for (int digitIndex = 0; digitIndex < co2Numbers.get(0).length(); digitIndex++) {
        int numberOfOnes = 0;
        for (String number : co2Numbers) {
            if (("" + number.charAt(digitIndex)).equals("1")) {
                numberOfOnes += 1;
            }
        }
        String mostCommon = numberOfOnes >= (co2Numbers.size() - numberOfOnes) ? "1" : "0";
        boolean done = false;
        for (int co2NumbersIndex = 0; co2NumbersIndex < co2Numbers.size() && !done; co2NumbersIndex++) {
            if (("" + co2Numbers.get(co2NumbersIndex).charAt(digitIndex)).equals(mostCommon)) {
                co2Numbers.remove(co2NumbersIndex);
                co2NumbersIndex--;
            }
            if (co2Numbers.size() == 1) {
                done = true;
            }
        }
        if (done) {
            break;
        }
    }
    int co2 = Integer.parseInt(co2Numbers.get(0), 2);
    System.out.println("Part 2: " + (oxygen * co2));
  }
}

