// Eric Kugel

public class TestGenerator
{
  public static void main (String[] arg0)
  {
    String output = "The diagonal of a square prism with dimensions of\n";
    output = output + "[width] and [height] equals [diagonal]";
    
    int width = (int) (Math.random() * 13 + 2);
    double height = Math.random() * 4 + 5;
    double diagonal = Math.sqrt(2 * Math.pow(width, 2) + Math.pow(height, 2));
    
    int widthIndex = output.indexOf("[width]");
    output = output.substring(0, widthIndex) + width + output.substring(widthIndex + "[width]".length());
    int heightIndex = output.indexOf("[height]");
    output = output.substring(0, heightIndex) + height + output.substring(heightIndex + "[height]".length());
    int diagonalIndex = output.indexOf("[diagonal]");
    output = output.substring(0, diagonalIndex) + diagonal + output.substring(diagonalIndex + "[diagonal]".length());
    
    System.out.println(output);
  }
}