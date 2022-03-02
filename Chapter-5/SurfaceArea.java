// Eric Kugel

public class SurfaceArea implements Area {
  private static double totalArea = 0.0;
  private double base = 0.0;
  private double height = 0.0;
  
  public SurfaceArea(double base, double height) {
    this.base = base;
    this.height = height;
  }
  
  public void addTriangleArea() {
    double areaToAdd = .5 * base * height;
    totalArea += areaToAdd;
  }
  
  public void addRectangleArea() {
    double areaToAdd = base * height;
    totalArea += areaToAdd;
  }
  
  public static double getTotalArea() {
    return totalArea;
  }
  
  public String toString() {
    String output = "";
    output += "Base length: " + base + "; ";
    output += "Height: " + height + "; ";
    output += "Total area: " + totalArea + ";";
    return output;
  }
}