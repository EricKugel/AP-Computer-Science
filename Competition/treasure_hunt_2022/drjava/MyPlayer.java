/**
 * (C) Copyright IBM Corp. 2016,2022. All Rights Reserved. US Government Users Restricted Rights - Use,
 * duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

import com.ibm.vie.mazerunner.*;
import com.ibm.vie.mazerunner.squares.*;
import java.util.ArrayList;

/**
 * This class is your implementation of a player who
 * searches a board for treasure. Your goal is to do so
 * using the fewest number of steps you can.
 */
public class MyPlayer implements IPlayer {
  private ArrayList<Move> moves = new ArrayList<Move>();
    
    /**
     * Gives the board, and the IBM judges a way to identify
     * your player, and differentiate it from other student submissions.
     *
     * @return Your name
     */
    public String getName() {
        return "Eric Kugel";
    }

    /**
     * In the first phase of the game, your player can examine the board,
     * see where the treasure is located and make a strategy to
     * find all the treasure in the fewest possible steps.
     * <p>
     * Since this method is called every time a board is loaded, use
     * this method to reset any data kept from a previous board during the
     * analyze or selectMove phases. The same instance of your player
     * is used to play every time, and not resetting your data
     * from a previous board could cause unexpected results as
     * you play the next one.
     * </p>
     *
     * @param board The game board for your player to analyze
     */
    public void analyzeBoard(IAnalysisBoard board) {
      
    }

    /**
     * In the second phase of the game, your player moves about
     * the board to claim the treasures. This method will be called
     * repeatedly until one of the conditions are met for a board:
     * <ul>
     * <li>All treasures are found</li>
     * <li>The maximum number of steps has been reached</li>
     * </ul>
     * <p>
     * A default implementation is provided to show you how to
     * interact with the board.
     * </p>
     *
     * @param board The game board for your player to move about
     *
     * @return Your next move
     */
    public Move selectMove(IBoard board) throws Error {
      return moveFromTo(board.getPlayerLocation(), board.getTreasures().get(0).getLocation());
    }

    /**
     * The gameCompleted method is called when the game is over and
     * no further moves are required of your player for this board.
     * <p>
     * This may be called under various circumstances, but will always
     * be called for each board:
     * - If you run out of available steps
     * - If you've obtained the last available treasure (Congratulations!)
     * - Your analyzeBoard or selectMove implementation took too long to execute.
     * </p>
     *
     * @param board The game board for your player to analyze
     */
    public void gameCompleted(IBoard board) {
        /*
         * TODO Your code here.
         * Using this method is optional.
         */
    }
    
    private Move moveFromTo(Location from, Location to) {
      int row1 = from.getRow();
      int row2 = to.getRow();
      int col1 = from.getCol();
      int col2 = to.getCol();
      
      double direction = 0;
      if (col1 != col2) {
        direction = Math.atan((row1 - row2) / (double) (col2 - col1)) + (col1 > col2 ? Math.PI : 0);
        if (direction < 0) {
          direction += Math.PI * 2;
        }
      }
      System.out.println(Math.toDegrees(direction));
      if (direction >= Math.PI / 4 && direction < Math.PI * 3 / 4) {
        return Move.NORTH;
      } else if (direction >= Math.PI * 3 / 4 && direction < Math.PI * 5 / 4) {
        return Move.WEST;
      } else if (direction >= Math.PI * 5 / 4 && direction < Math.PI * 7 / 4) {
        return Move.SOUTH;
      } else {
        return Move.EAST;
      }
    }

    /**
     * Game launcher. Create an instance of your player class and
     * run the game with it.
     *
     * @param args
     */
    public static void main(String args[]) {
        MyTreasureHunt.run(new MyPlayer());
    }
}
