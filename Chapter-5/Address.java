public class Address {
  // Instance variables.
  private String street = null;
  private String city = null;
  private String state = null;
  private int zipCode = 0;
  
  /** Constructs an Address object by storing four parameters as instance variables. */
  public Address(String aStreet, String aCity, String aState, int aZipCode) {
    street = aStreet;
    city = aCity;
    state = aState;
    zipCode = aZipCode;
  }
 
  /** Returns street. */
  public String getStreet() {
    return street;
  }
  
  /** Sets street to parameter. */
  public void setStreet(String aStreet) {
    street = aStreet;
  }
  
  /** Returns city. */
  public String getCity() {
    return city;
  }
  
  /** Sets city to parameter. */
  public void setCity(String aCity) {
    city = aCity;
  }
  
  /** Returns state. */
  public String getState() {
    return state;
  }
  
  /** Sets state to parameter. */
  public void setState(String aState) {
    state = aState;
  }
  
  /** Returns zip code. */
  public int getZipCode() {
    return zipCode;
  }
  
  /** Sets zip code to parameter. */
  public void setZipCode(int aZipCode) {
    zipCode = aZipCode;
  }
  
  /** Returns a string representation of the object. */
  public String toString() {
    return street + "\n" + city + ", " + state + " " + zipCode;
  }
}