import core.data.*;
import java.util.Scanner;

public class WeatherTester {
  public static void main(String[] args) {
    // Tests Sinbad installation in part (a).
    String cityId1 = "KFLG";
    DataSource data1 = DataSource.connect("http://weather.gov/xml/current_obs/" + cityId1 + ".xml"); 
    data1.setCacheTimeout(15 * 60);  
    data1.load();
    double temp = data1.fetchDouble("temp_f");
    String location = data1.fetchString("location");
    System.out.println("The temperature at " + location + " is " + temp + "°F");

    
    // Prints a list of weather attributes to be used in part (b).
//    data1.printUsageString();
    
    
    // Tests Observation constructor and toString method in part (c).
    Observation cityObservation1 = data1.fetch("Observation", "temp_f", "weather", "wind_mph");
    System.out.println("\n" + cityId1 + ": " + cityObservation1);

    
    // Tests colderThan method in part (d).
    String cityId2 = "PAKP";//"/* choose another city id */";
    DataSource data2 = DataSource.connect("http://weather.gov/xml/current_obs/" + cityId2 + ".xml"); 
    data2.setCacheTimeout(15 * 60);  
    data2.load();
    
    Observation cityObservation2 = data2.fetch("Observation", "temp_f", "weather", "wind_mph");
    System.out.println("\n" + cityId2 + ": " + cityObservation2 + "\n");

    if (cityObservation1.colderThan(cityObservation2)) {
      System.out.println(cityId1 + " is colder than " + cityId2);
    } else {
      System.out.println(cityId2 + " is colder than " + cityId1);
    }
    
    
    /* ----------------------------------------------------------------------- *
     * This concludes 4.5 Lab, Part 2.  You will extend this lab in Chapter 6. *
     * ----------------------------------------------------------------------- */
    
    
    // Tests storage of all WeatherStation objects in allStations in part (e).
//    DataSource data3 = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
//    WeatherStation[] allStations = data3.fetchArray("WeatherStation", "station/station_name",
//                                                    "station/station_id", "station/state",
//                                                    "station/latitude", "station/longitude");
//    System.out.println("\nTotal stations: " + allStations.length);
    
    
    // Tests WeatherReporter class in part (g).
//    System.out.println("\nPlease enter the two-character abbreviation of a state");
//    Scanner userInput = new Scanner(System.in);
//    String userState = userInput.next();
//    
//    WeatherReporter myWeatherApp = new WeatherReporter(allStations, userState);
//    myWeatherApp.report();
    
  }
}
