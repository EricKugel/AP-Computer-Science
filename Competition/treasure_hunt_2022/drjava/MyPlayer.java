
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
  private static final Move[] DIRECTIONS = { Move.NORTH, Move.WEST, Move.SOUTH, Move.EAST };
  private boolean completed = false;

  public String getName() {
    return "Eric Kugel";
  }

  public void analyzeBoard(IAnalysisBoard board) {
    moves.clear();
    Location location = board.getPlayerLocation();
    ArrayList<Treasure> route = new ArrayList<Treasure>(board.getTreasures());
    while (route.size() > 0) {
      int minDist = Integer.MAX_VALUE;
      // Find the closest treasure
      Treasure target = null;
      for (Treasure treasure : route) {
        int dist = location.distance(treasure.getLocation());
        if (dist < minDist) {
          target = treasure;
          minDist = dist;
        }
      }
      route.remove(target);
      for (Move move : findPath(target.getLocation(), location, board)) {
        moves.add(move);
      }
      location = target.getLocation();
    }
  }

  private class Square {
    int score;
    Square parent;
    Move move;

    public Square(int score, Square parent, Move move) {
      this.score = score;
      this.parent = parent;
      this.move = move;
    }

    public Square getParent() {
      return parent;
    }

    public int getScore() {
      return score;
    }

    public Move getMove() {
      return move;
    }
  }

  private ArrayList<Move> findPath(Location to, Location from, IBoard board) {
    // Build model
    Square[][] model = new Square[board.getHeight()][board.getWidth()];
    model[to.getRow()][to.getCol()] = new Square(0, null, null);
    for (Move move : DIRECTIONS) {
      calculateSteps(to, move, model, board);
    }

    // Find moves in the shortest path
    ArrayList<Move> moves = new ArrayList<Move>();
    Square square = model[from.getRow()][from.getCol()];
    while (square.getParent() != null) {
      moves.add(square.getMove());
      square = square.getParent();
    }

    return moves;
  }

  // Recursively builds a model of the board. The treasure is given a value of
  // 1000, and each square around it is given a value of that square minus its
  // step cost. Any bigger value that is found overrides the smaller value.
  private void calculateSteps(Location location, Move move, Square[][] model,
      IBoard board) {
    Location newLocation = move.apply(location);
    int newRow = newLocation.getRow();
    int newCol = newLocation.getCol();

    if (newRow > -1 && newCol > -1 && newRow < board.getHeight() && newCol < board.getWidth()
        && !board.getSquareAt(newLocation).getSpriteName().equals("Wall")) {
      Square square = model[location.getRow()][location.getCol()];
      int newValue = square.getScore() + board.getSquareAt(newLocation).getStepCost();
      if (model[newRow][newCol] == null || newValue < model[newRow][newCol].getScore()) {
        model[newRow][newCol] = new Square(newValue, square, move.inverse().get());
        for (Move newMove : DIRECTIONS) {
          calculateSteps(newLocation, newMove, model, board);
        }
      }
    }
  }

  public Move selectMove(IBoard board) throws Error {
    return moves.remove(0);
  }

  public void gameCompleted(IBoard board) {
    completed = true;
  }

  public static void main(String args[]) {
    MyTreasureHunt.run(new MyPlayer());
  }
}