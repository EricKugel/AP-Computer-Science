import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day6 {
  public static void main(String[] args) throws FileNotFoundException {
    File textFile = new File("input.txt");
    Scanner scanner = new Scanner(textFile);

    String s = scanner.nextLine();
    String[] fishStrings = s.split(",");
    int[] fish = new int[fishStrings.length];
    for (int fishIndex = 0; fishIndex < fish.length; fishIndex++) {
      fish[fishIndex] = Integer.parseInt(fishStrings[fishIndex]);
    }

    long[] cycle = new long[9];
    for (int fishCycle : fish) {
      cycle[fishCycle] += 1;
    }

    System.out.println(spawn(80, cycle));
    System.out.println(spawn(256, cycle));

    scanner.close();
  }

  public static long spawn(int days, long[] fish) {
    for (int day = 0; day < days; day++) {
      long[] newFish = fish.clone();
      for (int intervalIndex = 1; intervalIndex < fish.length; intervalIndex++) {
        newFish[intervalIndex - 1] = fish[intervalIndex];
      }
      newFish[8] = fish[0];
      newFish[6] += fish[0];
      fish = newFish;
    }
    long sum = 0;
    for (long fishAmount : fish) {
      sum += fishAmount;
    }
    return sum;
  }
}