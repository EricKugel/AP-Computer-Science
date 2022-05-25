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

public class MyPlayer implements IPlayer {
  private ArrayList<Move> route = new ArrayList<Move>();
  private static final Move[] DIRECTIONS = {Move.NORTH, Move.WEST, Move.SOUTH, Move.EAST};
  private int bestPathScore = Integer.MAX_VALUE;

  public String getName() {
    return "Eric Kugel";
  }

  public void analyzeBoard(IAnalysisBoard board) {
    route.clear();
  }

  public Move selectMove(IBoard board) throws Error {
    if (route.size() == 0) {
      route = getNextRoute(board);
    }
    return route.remove(0);
  }

  public void gameCompleted(IBoard board) { }

  /**
   * This builds a model of the board and returns the shortest path to a treasure.
   */
  private ArrayList<Move> getNextRoute(IBoard board) {
    // Build model
    Square[][] model = new Square[board.getHeight()][board.getWidth()];
    bestPathScore = Integer.MAX_VALUE;
    for (Treasure treasure : board.getTreasures()) {
      model[treasure.getLocation().getRow()][treasure.getLocation().getCol()] = new Square(0, null, null);
      for (Move move : DIRECTIONS) {
        calculateSteps(treasure.getLocation(), move, model, board);
      }
    }

    // Generate route
    ArrayList<Move> route = new ArrayList<Move>();
    Location playerLocation = board.getPlayerLocation();
    Square square = model[playerLocation.getRow()][playerLocation.getCol()];
    while (square.parent != null) {
      route.add(square.move);
      square = square.parent;
    }

    return route;
  }

  /**
   * Recursively builds a model of the board. The treasure is given a score of 0,
   * and each square around it is given a score of that score plus its step cost.
   * If a score for a square is found that's lower, it overrides the old one.
   */
  private void calculateSteps(Location location, Move move, Square[][] model, IBoard board) {
    Location newLocation = move.apply(location);
    int newRow = newLocation.getRow();
    int newCol = newLocation.getCol();

    if (newRow > -1 && newCol > -1 && newRow < board.getHeight() && newCol < board.getWidth() 
        && !board.getSquareAt(newLocation).getSpriteName().equals("Wall")) {
      Square parent = model[location.getRow()][location.getCol()];
      int newValue = parent.score + board.getSquareAt(newLocation).getStepCost();

      // Don't do any unnecessary recursion
      if (newValue > bestPathScore) {
        return;
      } else if (board.getPlayerLocation().equals(newLocation) && newValue < bestPathScore) {
        bestPathScore = newValue;
      }

      // If a better path is found, recurse
      if (model[newRow][newCol] == null || newValue < model[newRow][newCol].score) {
        model[newRow][newCol] = new Square(newValue, parent, move.inverse().get());
        for (Move newMove : DIRECTIONS) {
          calculateSteps(newLocation, newMove, model, board);
        }
      }
    }
  }

  public static void main(String args[]) {
    MyTreasureHunt.run(new MyPlayer());
  }

  /**
   * A helper class to use in models of the board. It stores a square's score,
   * the next square on the best route to treasure, and move to that square.
   */
  private class Square {
    public int score;
    public Square parent;
    public Move move;

    public Square(int score, Square parent, Move move) {
      this.score = score;
      this.parent = parent;
      this.move = move;
    }
  }
}