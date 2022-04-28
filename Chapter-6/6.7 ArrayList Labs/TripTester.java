import java.util.ArrayList;

/**
 * TripTester contains a main method to test a Trip object.
 * 
 * The tester constructs a Trip object, invokes the getDuration and 
 * getShortestLayover methods, and prints the results.
 */
public class TripTester {
  public static void main(String[] args) {
    Flight flight0 = new Flight("11:30 a.m.", "12:15 p.m.");
    Flight flight1 = new Flight("1:15 p.m.", "3:45 p.m.");
    Flight flight2 = new Flight("4:00 p.m.", "6:45 p.m.");
    Flight flight3 = new Flight("10:15 p.m.", "11:00 p.m.");
    
    ArrayList<Flight> myFlights = new ArrayList<Flight>();
    Trip vacation = new Trip(myFlights);
       
    myFlights.add(flight0);
    System.out.println(vacation.getDuration());
    System.out.println(vacation.getShortestLayover() + "\n");
    
    myFlights.add(flight1);
    System.out.println(vacation.getDuration());
    System.out.println(vacation.getShortestLayover() + "\n");
    
    myFlights.add(flight2);
    System.out.println(vacation.getDuration());
    System.out.println(vacation.getShortestLayover() + "\n");
    
    myFlights.add(flight3);
    System.out.println(vacation.getDuration());
    System.out.println(vacation.getShortestLayover());
  }
  
}