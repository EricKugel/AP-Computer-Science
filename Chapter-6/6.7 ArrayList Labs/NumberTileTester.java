import java.util.ArrayList;

/**
 * NumberTileTester contains a main method to test NumberTile and TileGame objects.
 * 
 * The tester constructs NumberTile and TileGame objects, invokes the insertTile methods,
 * and prints the results.
 */
public class NumberTileTester {
  public static void main(String[] args) {
    // constructs and adds NumberTile objects to ArrayList, to be passed as a parameter to TileGame
    // these are base cases to test the specifics of your code
    NumberTile base0 = new NumberTile(5, 1, 5, 0);
    NumberTile base1 = new NumberTile(5, 2, 5, 1);
    NumberTile base2 = new NumberTile(5, 3, 5, 2);
    NumberTile base3 = new NumberTile(5, 4, 5, 3);
    ArrayList<NumberTile> testBoard = new ArrayList<NumberTile>();
    testBoard.add(base0);
    testBoard.add(base1);
    testBoard.add(base2);
    testBoard.add(base3);
    
    TileGame test = new TileGame();
    test.setUpBoard(testBoard);
    System.out.println(test);
    
    // constructs and inserts additional NumberTile objects into TileGame
    // testTile4 should insert at index 4
    NumberTile testTile4 = new NumberTile(9, 9, 9, 4);
    System.out.println("Should insert tile 4 at index 4:\n" + testTile4 + test.insertTile(testTile4));
    System.out.println(test);
    
    // testTile3 should insert at index 3
    NumberTile testTile3 = new NumberTile(8, 3, 8, 3);
    System.out.println("Should insert tile 3 at index 3:\n" + testTile3 + test.insertTile(testTile3));
    System.out.println(test);
    
    // testTile2 should insert at index 2, after rotation
    NumberTile testTile2 = new NumberTile(2, 7, 2, 7);
    System.out.println("Should insert tile 2 at index 2, after rotation:\n" + testTile2 + test.insertTile(testTile2));
    System.out.println(test);
    
    // testTile1 should NOT insert
    NumberTile testTile1 = new NumberTile(7, 7, 7, 7);
    System.out.println("Should NOT insert tile 1:\n" + testTile1 + test.insertTile(testTile1));
    System.out.println(test);
    
    // testTile0 should insert at index 0
    NumberTile testTile0 = new NumberTile(6, 0, 6, 6);
    System.out.println("Should insert tile 0 at index 0:\n" + testTile0 + test.insertTile(testTile0));
    System.out.println(test);
    
    System.out.println("End of Test Cases\n------------------------------------------\nBeginning of Lab Description Examples\n");
    
    // constructs and adds NumberTile objects to ArrayList, to be passed as a parameter to TileGame
    // these match examples from lab directions
    NumberTile index0 = new NumberTile(4, 3, 7, 4);
    NumberTile index1 = new NumberTile(6, 4, 3, 3);
    NumberTile index2 = new NumberTile(1, 2, 3, 4);
    NumberTile index3 = new NumberTile(3, 2, 5, 2);
    NumberTile index4 = new NumberTile(5, 9, 2, 2);
    ArrayList<NumberTile> exampleBoard = new ArrayList<NumberTile>();
    exampleBoard.add(index0);
    exampleBoard.add(index1);
    exampleBoard.add(index2);
    exampleBoard.add(index3);
    exampleBoard.add(index4);
    
    TileGame game = new TileGame();
    game.setUpBoard(exampleBoard);
    System.out.println(game);
    
    // constructs and inserts additional NumberTile objects into TileGame
    NumberTile exampleTile1 = new NumberTile(4, 2, 9, 2);
    NumberTile exampleTile2 = new NumberTile(4, 2, 9, 8);
    
    System.out.println("Should insert tile 1:\n" + exampleTile1 + game.insertTile(exampleTile1));
    System.out.println(game);
    System.out.println("Should insert tile 2:\n" + exampleTile2 + game.insertTile(exampleTile2));
    System.out.println(game);
  }
}