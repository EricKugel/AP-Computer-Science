import java.util.Scanner;

public class Time
{
 public static void main (String[] arg0)
 {
  Scanner scanner = new Scanner(System.in);
  
  int totalSeconds = scanner.nextInt();
  
  int hours = totalSeconds / (60 * 60);
  int minutes = (totalSeconds / 60) % 60;
  int seconds = totalSeconds % 60;
  
  System.out.println("There are " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds in " + totalSeconds + " seconds.");
 }
}