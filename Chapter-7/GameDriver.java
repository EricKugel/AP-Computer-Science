/**
 * A game driver determines the play of the game.
 */
public class GameDriver {
  /* the current state of the game */
  private GameState state;
  
  /**
   * Constructs a GameDriver object with the initial game state.
   * 
   * @param initial  the beginning games state played by this GameDriver
   */
  public GameDriver(GameState initial)
  {  state = initial;  }
  
  /** 
   * Plays an entire game, as described in the problem description.
   */
  public void play() {
    System.out.println(state);
    while (true) {
      Player player = state.getCurrentPlayer();
      String move = player.getNextMove(state);
      System.out.println(player.getName() + " made move " + move);
      state.makeMove(move);
      System.out.println(state);
      if (state.isGameOver()) {
        if (state.getWinner() != null) {
          System.out.println(state.getWinner().getName() + " wins!");
        } else {
          System.out.println("Draw");
        }
        return;
      }
    }
  }
}