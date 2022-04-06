import java.util.ArrayList;

/**
 * A game state contains methods to create a game.
 */
public interface GameState {
  // In an interface, methods are abstract by default.
  // Though we normally declare interface methods as public, they are public by default.
  // This is why the abstract methods below are acceptable as written.
  
  /**
   * Returns true if the game is over; false otherwise.
   * 
   * @return  true if the game is in an ending state;
   *          false otherwise.
   */
  boolean isGameOver();
  
  /** 
   * Returns the winner of the game.
   * 
   * Precondition: isGameOver() returns true.
   * @return  the player that won the game or null if there was no winner.
   */
  Player getWinner();
  
  /**
   * Returns the player whose turn it is.
   * 
   * Precondition: isGameOver() returns false.
   * @return  the player who is to make the next move.
   */
  Player getCurrentPlayer();
  
  /**
   * Returns the list of available moves for the current player.
   * 
   * @return  a list of valid moves for the current player;
   *          the size of the returned list is 0 if there are no valid moves.
   */
  ArrayList<String> getCurrentMoves();
  
  /** 
   * Updates game state to reflect the effect of the specified move.
   * 
   * @param move  a description of the move to be made
   */
  void makeMove(String move);
  
  /** 
   * Returns a string representation of the object.
   * 
   * @return a string representing the current game state
   */
  String toString();
  
} 