/**
 * FuelDepotTester contains a main method to test a FuelDepot object.
 * 
 * The tester constructs a FuelDepot object, invokes the nextTankToFill,
 * moveToLocation, and fillTankToThreshold methods, and prints the results.
 */
public class FuelDepotTester {
  public static void main(String[] args) {
    int[] theTanks = {20, 30, 80, 55, 50, 75, 20};
    FuelDepot station = new FuelDepot(theTanks);
    
    // tests nextTankToFill method
    System.out.println(station.nextTankToFill(50) + "\n");
    
    // tests moveToLocation method
    // Note that the FuelDepot class constructs a FuelRobot at FuelTank 2 facing right.
    station.moveToLocation(0);
    System.out.println(station);
    
    station.moveToLocation(6);
    System.out.println(station + "\n-------------------------------\n");
    
    // tests automatic filling of all tanks using both methods
    int threshold = 100;
    int fillNext = -1;
    while(station.nextTankToFill(threshold) != fillNext) {
      fillNext = station.nextTankToFill(threshold);
      station.moveToLocation(fillNext);
      station.fillTankToThreshold(fillNext,threshold);
      System.out.println(station);
    }
  }
}