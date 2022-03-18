/**
 * PacManTester contains a main method to test objects that inherit from the PacMan class,
 * roughly mimicking a video game in the PacMan series.
 * 
 * The tester constructs a MsPacMan object and four Ghost objects, invokes the MsPacMan 
 * setPowerPellet and Ghost setAttachMode methods, and prints the results via the 
 * objects' toString methods.
 */
public class PacManTester {
  public static void main(String[] args) {
    MsPacMan msPacMan1 = new MsPacMan("Pepper", Direction.left, 3, false, 0);
    Ghost ghost1 = new Ghost("Blinky", Direction.left, 3, Color.red, true, msPacMan1);
    Ghost ghost2 = new Ghost("Pinky", Direction.up, 3, Color.pink, true, msPacMan1);
    Ghost ghost3 = new Ghost("Inky", Direction.up, 3, Color.cyan, true, msPacMan1);
    Ghost ghost4 = new Ghost("Sue", Direction.up, 3, Color.orange, true, msPacMan1);
    
    PacMan[] players = {msPacMan1, ghost1, ghost2, ghost3, ghost4};
    
    for (PacMan item : players) {
      System.out.println(item + "\n");
    }
    
    System.out.println("____________________________________\n");
    
    msPacMan1.setPowerPellet(true);
    
    for (int i = 1; i < players.length; i++) {
      ((Ghost) players[i]).setAttackMode();
    }
    
    for (PacMan item : players) {
      System.out.println(item + "\n");
    }
    
    System.out.println("____________________________________\n");
    
    msPacMan1.setPowerPellet(false);
    
    for (int i = 1; i < players.length; i++) {
      ((Ghost) players[i]).setAttackMode();
    }
    
    for (PacMan item : players) {
      System.out.println(item + "\n");
    }
    
  }
}