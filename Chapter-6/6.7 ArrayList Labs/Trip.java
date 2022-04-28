import java.util.ArrayList;

/**
 * A trip contains any/all flights in succession.
 */
public class Trip
{
  /** Stores the flights (if any) in chronological order. */
  private ArrayList<Flight> flights;
  
  /**
   * Instantiates the list of flights.
   * 
   * @param flights  the list of flights
   */
  public Trip(ArrayList<Flight> flights) {
    this.flights = flights;
  }
  
  /** 
   * Returns the number total length (in minutes) of the trip.
   * 
   * @return  the number of minutes from the departure of the first flight to the arrival
   *          of the last flight if there are one or more flights in the trip;
   *          0, if there are no flights in the trip.
   */
  public int getDuration() {
    return flights.get(0).getDepartureTime().minutesUntil(flights.get(flights.size() - 1).getArrivalTime());
  }
  
  
  /** 
   * Returns the shortest layover in the trip.
   * Precondition: the departure time for each flight is later than the arrival time of its
   *               preceding flight
   * @return  the smallest number of minutes between the arrival of a flight and the departure
   *          of the flight immediately after it, if there are two or more flights in the trip;
   *          -1, if there are fewer than two flights in the trip
   */
  public int getShortestLayover() {
    if (flights.size() < 2) {
      return -1;
    } else {
      int shortestLayover = Integer.MAX_VALUE;
      for (int i = 0; i < flights.size() - 1; i++) {
        int layover = flights.get(i).getArrivalTime().minutesUntil(flights.get(i + 1).getDepartureTime());
        if (layover < shortestLayover) {
          shortestLayover = layover;
        }
      }
      return shortestLayover;
    }
  }
  
  
}