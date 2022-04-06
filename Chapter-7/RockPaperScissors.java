import java.util.ArrayList;

/**
 * RockPaperScissors is a game state that can be played by two or more players.
 * This class is not included in the original AP question.
 */
public class RockPaperScissors implements GameState {
  private Player currentPlayer = null;
  private ArrayList<Player> playerList = null;
  private ArrayList<String> currentMoves = null;
  private int numToWin = -1;
  private int marginOfVictory = -1;
  private ArrayList<String> currentHands = null;
  
  /**
   * Constructs a RockPaperScissors object.
   * 
   * @param playerList  the list of players playing this game
   * 
   */
  public RockPaperScissors(ArrayList<Player> playerList, ArrayList<String> currentMoves, int numToWin, int marginOfVictory) {
    this.playerList = playerList;
    currentPlayer = playerList.get(0);
    this.currentMoves = currentMoves;
    this.numToWin = numToWin;
    this.marginOfVictory = marginOfVictory;
    initializeCurrentHands();
  }
  
  // initializes currentHands to help constructor
  private void initializeCurrentHands() {
    currentHands = new ArrayList<String>();
    for(int i = 0; i < playerList.size(); i++) {
      currentHands.add("none");
    }
  }
  
  /** 
   * Returns true if the game is over; false otherwise.
   * Implements abstract method from GameState interface.
   * 
   * @return  true if the game is in an ending state (any player is at or above the minimum score to win)
   *          false otherwise.
   */
  public boolean isGameOver() {
    for (Player item : playerList) {
      if (item.getScore() >= numToWin) {
        return true;
      }
    }
    return false;
  }
  
  /** 
   * Returns the winner of the game.
   * Implements abstract method from GameState interface.
   * 
   * Precondition: isGameOver() returns true.
   * @return the player that won the game or null if there was no winner.
   */
  public Player getWinner() {
    // finds index of winner
    int winningIndex = 0;
    for (int i = 0; i < playerList.size(); i++) {
      if (playerList.get(i).getScore() >= numToWin) {
        winningIndex = i;
      }
    }
    
    // swaps winner to index 0
    Player temp = playerList.get(winningIndex);
    playerList.set(winningIndex, playerList.get(0));
    playerList.set(0, temp);
    
    // finds smallest margin of victory between winner and all other players
    int smallestFoundMarginOfVictory = playerList.get(0).getScore() - playerList.get(1).getScore();
    for (int i = 2; i < playerList.size(); i++) {
      if (playerList.get(0).getScore() - playerList.get(i).getScore() < smallestFoundMarginOfVictory) {
        smallestFoundMarginOfVictory = playerList.get(0).getScore() - playerList.get(i).getScore();
      }
    }
    
    if (smallestFoundMarginOfVictory >= marginOfVictory) {
      return playerList.get(0);
    } else {
      return null;
    }
  }
  
  /** 
   * Returns the player whose turn it is.
   * Implements abstract method from GameState interface.
   * Precondition: isGameOver() returns false.
   * 
   * @return  the player who is to make the next move.
   */
  public Player getCurrentPlayer() {
    return currentPlayer;
  }
  
  /** 
   * Returns the list of available moves for the current player.
   * Implements abstract method from GameState interface.
   * 
   * @return  a list of valid moves for the current player;
   *          the size of the returned list is 0 if there are no valid moves.
   */
  public ArrayList<String> getCurrentMoves() {
    return currentMoves;
  }
  
  /** 
   * Updates game state to reflect the effect of the specified move.
   * Implements abstract method from GameState interface.
   * 
   * @param move  a description of the move to be made
   */
  public void makeMove(String move) {    
    // finds index of currentPlayer and sets corresponding index in currentHands to parameter
    int currentIndex = -1;
    for (int i = 0; i < playerList.size(); i++) {
      if (playerList.get(i).equals(currentPlayer)) {
        currentIndex = i;
      }
    }
    currentHands.set(currentIndex, move);
    
    // if currentIndex is last in PlayerList, score all hands, and change currentPlayer to index 0;
    //                                        else change currentPlayer to next index
    if (currentIndex == playerList.size() - 1) {
      scorePoints();
      currentPlayer = playerList.get(0);
    } else {
      currentPlayer = playerList.get(currentIndex + 1);
    }  
  }
  
  // updates player scores based on current moves to help makeMove method
  private void scorePoints() {
    for (int i = 0; i < currentHands.size() - 1; i++) {
      for (int j = i + 1; j < currentHands.size(); j++) {
        if ((currentHands.get(i).equals("rock") && currentHands.get(j).equals("scissors")) ||
            (currentHands.get(i).equals("scissors") && currentHands.get(j).equals("paper")) ||
            (currentHands.get(i).equals("paper") && currentHands.get(j).equals("rock"))) {
          playerList.get(i).setScore(playerList.get(i).getScore() + 1);
        } else if ((currentHands.get(i).equals("scissors") && currentHands.get(j).equals("rock")) ||
                   (currentHands.get(i).equals("paper") && currentHands.get(j).equals("scissors")) ||
                   (currentHands.get(i).equals("rock") && currentHands.get(j).equals("paper"))) {
          playerList.get(j).setScore(playerList.get(j).getScore() + 1);
        }
      }
    }
  }
  
  /** 
   * Returns a string representation of the object.
   * 
   * @return a string representing the current game state
   */
  public String toString() {
    String output = "";
    for (int i = 0; i < playerList.size(); i++) {
      output += playerList.get(i).getName() + ": " + playerList.get(i).getScore() + " points";
      if (i % 2 == 0) {
        output += "    ";
      } else {
        output += "\n";
      }
    }
    return output;
  }
  
}