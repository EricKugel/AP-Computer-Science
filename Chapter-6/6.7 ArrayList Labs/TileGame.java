import java.util.ArrayList;

/**
 * A tile game uses number tiles to play.
 */
public class TileGame {
  /** Represents the game board; guaranteed never to be null. */
  private ArrayList<NumberTile> board;
  
  public TileGame()
  { board = new ArrayList<NumberTile>();  }
  
  /**
   * Adds all initial NumberTiles to board.
   * Not included in the original AP question.
   * 
   * @param initialBoard  the list of tiles to be added initially to board.
   */
  public void setUpBoard(ArrayList<NumberTile> initialBoard) {
    for (int i = 0; i < initialBoard.size(); i++) {
      board.add(i, initialBoard.get(i));
    }
  }
  
  /** 
   * Determines where to insert tile, in its current orientation, into the game board.
   *
   * @param tile the tile to be placed on the game board
   * @return the position fotile where tile is to be inserted:
   *          0 if the board is empty;
   *         -1 if tile does not fit in front, at end, or between any existing tiles;
   *         otherwise, 0 <= position returned <= board.size()
   */
  private int getIndexForFit(NumberTile tile) {
    if (board.size() == 0) {
      return 0;
    }
    
    for (int i = 0; i < board.size() + 1; i++) {
      if (i > 0) {
        if (board.get(i - 1).getRight() != tile.getLeft()) {
          continue;
        }
      }
      if (i < board.size() - 1) {
        if (board.get(i).getLeft() != tile.getRight()) {
          continue;
        }
      }
      return i;
    }
    return -1;
  }
  
  
  /** 
   * Places tile on the game board if it fits (checking all possible tile orientations if necessary).
   * If there are no tiles on the game board, the tile is placed at position 0.
   * The tile should be placed at most 1 time.
   * Precondition: board is not null
   * Postcondition: the orientations of the other tiles on the board are not changed.
   * Postcondition: the order of the other tiles on the board relative to each other is not changes.
   * 
   * @param tile  the tile to be placed on the game board
   * @return      true if tile is placed successfully; false otherwise
   */
  public boolean insertTile(NumberTile tile) {
    for (int i = 0; i < 4; i++) {
      int index = getIndexForFit(tile);
      if (index != -1) {
        board.add(index, tile);
        return true;
      } else {
        tile.rotate();
      }
    }
    return false;
  }
  
  
  /**
   * Returns a string representation of the board.
   * Not included in the original AP question.
   * 
   * @return  a string representation of the object.
   */
  public String toString() {
    String output = "Current Board\n ";
    for (NumberTile item : board) {
      output += "------- ";
    }
    output += "\n|   ";
    for (NumberTile item : board) {
      output += item.getTop() + "   |   ";
    }
    output += "\n| ";
    for (NumberTile item : board) {
      output += item.getLeft() + "   " + item.getRight() + " | ";
    }
    output += "\n|   ";
    for (NumberTile item : board) {
      output += item.getBottom() + "   |   ";
    }
    output += "\n ";
    for (NumberTile item : board) {
      output += "------- ";
    }
    output += "\n";
    return output;
  }
  
}