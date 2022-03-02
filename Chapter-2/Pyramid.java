import java.util.Scanner;

public class Pyramid
{
  
  public static void main(String[] arg0)
  {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("How many base edges does the pyramid have?");
    int baseEdges = scanner.nextInt();
    
    printPyramidInfo(baseEdges);
  }
  
  private static void printPyramidInfo(int baseEdges)
  {
    int pyramidFaces, pyramidEdges, pyramidVertices;
    
    pyramidFaces = baseEdges + 1;
    pyramidEdges = baseEdges * 2;
    pyramidVertices = baseEdges + 1;
    
    System.out.println("You input a pyramid with " + baseEdges + " base sides:");
    System.out.println("This pyramid has " + + pyramidFaces + " faces, " + pyramidEdges + " edges, and " + pyramidVertices + " vertices.");
    System.out.println();
  }
  
  
}