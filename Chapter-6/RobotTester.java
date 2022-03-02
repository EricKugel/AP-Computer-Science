public class RobotTester {
  public static void main(String[] args) {
    int[] jetsonsHall = {1, 1, 2, 2};
    Robot Rosie = new Robot(jetsonsHall, 1, true);
    System.out.println(Rosie.clearHall());
  }
}