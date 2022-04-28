/**
 * A flight contains the departure time and arrival time.
 */
public class Flight {
  private Time departure = null;
  private Time arrival = null;
  
  /** 
   * Constructs a Flight object by instantiating departure and arrival.
   * Not included in the original AP question.
   * 
   * @param departureString  the time of departure, passed as a sttring
   * @param arrivalString    the time of arrival, passed as a string
    */
  public Flight(String departureString, String arrivalString) {
    this.departure = new Time(departureString);
    this.arrival = new Time(arrivalString);
  }
  
  /** 
   * Returns the time at which the flight departs.
   * Not implemented in the original AP question.
   * 
   * @return  the time at which the flight departs
    */
  public Time getDepartureTime() {
    return departure;
  }
  
  /** Returns the time at which the flight arrives.
    * Not implemented in the original AP question.
    * 
    * @return  the time at which the flight arrives
    */
  public Time getArrivalTime() {
    return arrival;
  }
  
}