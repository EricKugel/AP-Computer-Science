public class StandingsTester {
  public static void main(String[] args) {
    // Tests constructor with three parameters.
    Standings minn = new Standings("Timberwolves", 6, 4);
    
    // Tests getName and winPercentage methods.
    System.out.println(minn.getName() + " current winning percentage: " + minn.findWinPercentage());
    
    // Tests default addWins method.
    minn.addWins();
    System.out.println(minn.getName() + " current winning percentage: " + minn.findWinPercentage());
    
    // Tests default addLosses method.
    minn.addLosses();
    
    // Tests toString method.
    System.out.println("\n" + minn);
    
    System.out.println("\n----------------------------------------------------\n");
    
    // Tests constructor with one parameter.
    Standings losAng = new Standings("Lakers");
    System.out.println(losAng.getName() + " current winning percentage: " + losAng.findWinPercentage());
    
    // Tests overloaded addWins method.
    losAng.addWins(3);
    System.out.println(losAng.getName() + " current winning percentage: " + losAng.findWinPercentage());
    
    // Tests overloaded addLosses method.
    losAng.addLosses(2);
    
    // Tests toString method.
    System.out.println("\n" + losAng);
  }
}