public class FrogSimulationTester {
  public static void main(String[] args) {
    FrogSimulation sim = new FrogSimulation(24, 5);
    // To test siumulate method with examples from the lab directions, enter a number 1-5 when asked for the example to simulate.
    // System.out.println(sim.simulate());
    
    // To test runSiumlations method, uncomment the following line, and enter "6" when asked for the example to simulate.
    System.out.println(sim.runSimulations(400));
  }
}