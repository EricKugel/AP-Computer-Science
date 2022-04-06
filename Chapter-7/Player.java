/**
 * A player plays a game involoving moves and a score.
 */
public class Player {
  /* the name of this player */
  private String name = null; 
  
  /* the player's score, not included in the original AP question */
  private int score = -1;
  
  /**
   * Constructs a player object by setting name instance variable.
   * 
   * @param  name  the name of this player
   */
  public Player(String name)
  {  this.name = name;  }
  
  /**
   * Returns the name of this player.
   * 
   * @return  the name of this player
   */
  public String getName()
  {  return name;  }
  
  /**
   * Returns the score of this player.
   * Not included in the original AP question.
   * 
   * @return  the score of this player
   */
  public int getScore()
  {  return score;  }
  
  /**
   * Revises the score of this player.
   * Not included in the original AP question.
   * 
   * @param score  the revised score for this player
   */
  public void setScore(int score)
  {  this.score = score;  }
  
  /** 
   * This implementation chooses the first valid move.
   * Override this method in subclasses to define players with other strategies.
   * Not implemented in the original AP question.
   * 
   * @param   state the current state of the game; its current player is this player
   * @return  a string representing the move chosen;
   *          "no move" if no valid moves for the current player.
   */
  public String getNextMove(GameState state) {  
    return null; // implementation not supposed to be shown, but for the sake of this lab, we will return null
  }
  
}