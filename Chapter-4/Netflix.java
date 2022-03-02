public class Netflix {
  private String title = "";
  private double rating = 0.0;
  
  public Netflix(String title) {
    this.title = title;
  }
  
  public double getRating() {
    return rating;
  }
  
  public void setRating() {
    rating = 4.0;
  }
  
  public void setRating(double rating) {
    this.rating = rating;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public boolean isPopular() {
    return rating >= 4.0;
  }
  
  public boolean isPopular(boolean isPromoted) {
    return isPromoted && rating > 2.0;
  }
  
  public String toString() {
    return title + " is rated " + rating + " stars.";
  }
}