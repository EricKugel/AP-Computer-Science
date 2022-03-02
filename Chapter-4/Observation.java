import core.data.*;

public class Observation {
  private double tempF = 0.0; 
  private String weather = "";
  private double windSpeed = 0.0;
  /* two more instance variables to be added in part (b) */
  
  
  /** Constructs an Observation object using temperature and two additional data points.
    */
  public Observation(double tempF, String weather, double windSpeed) {
    this.tempF = tempF;
    this.weather = weather;
    this.windSpeed = windSpeed;
  }
 
  
  /** Returns temperature in degrees Fahrenheit. */
  public double getTempF() {
    return tempF;
  }
  
  public String getWeather() {
    return weather;
  }
  
  public double getWindSpeed() {
    return windSpeed;
  }
  
  /** Returns true is this Observation has a lower temperature than param other, 
    *         false otherwise.
    */
  public boolean colderThan(Observation other) {
    return tempF < other.getTempF();
  }
  
  
  /** Returns a string representation of the the object. */
  public String toString() {
    String output = "";
    output += "Temperature: " + tempF;
    if (tempF < 0) {
      output += " (brr)";
    }
    output += "\nWeather: " + weather + "\n";
    output += "Wind Speed: " + windSpeed;
    if (windSpeed > 45) {
      output += " (it's pretty windy)";
    }
    output += "\n";
    return output;
  }
  
  
}