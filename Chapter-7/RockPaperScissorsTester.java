import java.util.ArrayList;

/**
 * RockPaperScissorsTester contains a main method to test a RockPaperScissors object.
 * 
 * The tester constructs 2-3 RandomPlayer objects (uncomment the third to test three
 * random players), a RockPaperScissors object, and a GameDriver object, and invokes the
 * GameDriver play method.
 */
public class RockPaperScissorsTester {
  public static void main(String[] args) {
    RandomPlayer amazon = new RandomPlayer("Alexa");
    amazon.setScore(0);
    RandomPlayer apple = new RandomPlayer("Siri");
    apple.setScore(0);
//    RandomPlayer ibm = new RandomPlayer("Watson");
//    ibm.setScore(0);
    
    ArrayList<Player> myPlayers = new ArrayList<Player>();
    myPlayers.add(amazon);
    myPlayers.add(apple);
//    myPlayers.add(ibm);
    
    ArrayList<String> myMoves = new ArrayList<String>();
    myMoves.add("rock");
    myMoves.add("paper");
    myMoves.add("scissors");
    
    GameState myGameState = new RockPaperScissors(myPlayers, myMoves, 3, 2);
    GameDriver myActiveGame = new GameDriver(myGameState);
    myActiveGame.play();                                       
  }
  
}