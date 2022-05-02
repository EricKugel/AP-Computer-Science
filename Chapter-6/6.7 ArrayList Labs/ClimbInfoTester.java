/**
 * ClimbInfoTester contains a main method to test a ClimbInfo object.
 * 
 * The tester constructs a ClimbInfo object, invokes the addClimb and 
 * distinctPeakNames methods, and prints the results.
 */
public class ClimbInfoTester {
  public static void main(String[] args) {
    ClimbingClub hikerClub = new ClimbingClub();
    
    // tests addClimb method
    hikerClub.addClimb("Eagle", 274);
    hikerClub.addClimb("Lima", 301);
    hikerClub.addClimb("Brule", 225);
    hikerClub.addClimb("Eagle", 344);
    System.out.println(hikerClub);

    // tests distinctPeakNames method
    int numNames = hikerClub.distinctPeakNames();
    System.out.println(numNames);
  }
}