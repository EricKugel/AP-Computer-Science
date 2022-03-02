/**
 * LightBoardTester contains a main method to test a LightBoard object.
 * 
 * The tester constructs a LightBoard object, using the constuctor written in part (a),
 * and prints the contents via the toString.  The tester also constructs a LightBoard
 * object, using the default constructor to create the scenario shown in the lab description,
 * invokes the evaluateLight method, and prints the results.
 */
public class LightBoardTester {
  public static void main(String[] args) {
    LightBoard myLightBoard = new LightBoard(3, 6);
    System.out.println("Test part (a): construct board with 3 rows, 6 columns, and 40% true\n" + myLightBoard);
    
    LightBoard sim = new LightBoard();
    System.out.println("Test default constructor: show sample board from part (b)\n" + sim);
    
    System.out.println(sim.evaluateLight(0, 3));
    System.out.println(sim.evaluateLight(6, 0));
    System.out.println(sim.evaluateLight(4, 1));
    System.out.println(sim.evaluateLight(5, 4));
  }
}