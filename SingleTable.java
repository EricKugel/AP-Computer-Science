public class SingleTable {
  private int numSeats = 0;
  private int height = 0;
  private double viewQuality = 0.0;
  
  public SingleTable (int numSeats, int height, double viewQuality) {
    this.numSeats = numSeats;
    this.height = height;
    this.viewQuality = viewQuality;
  }
  
  public int getNumSeats() {
    return numSeats;
  }
  
  public int getHeight() {
    return height;
  }
  
  public double getViewQuality() {
    return viewQuality;
  }
  
  public void setViewQuality(double value) {
    viewQuality = value;
  }
  
}