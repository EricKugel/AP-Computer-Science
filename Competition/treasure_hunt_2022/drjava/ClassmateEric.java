
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
public class ClassmateEric implements IPlayer {
  private ArrayList<Move> moves = new ArrayList<Move>();
  private static final Move[] DIRECTIONS = { Move.NORTH, Move.EAST, Move.SOUTH, Move.WEST };

  public String getName() {
    return "Eric Kugel";
  }

  public void analyzeBoard(IAnalysisBoard board) {
    moves.clear();

    var location = board.getPlayerLocation();
    var route = new ArrayList<>(board.getTreasures());

    while (route.size() > 0) {
      var minDist = Integer.MAX_VALUE;

      // Find closest treasure
      Treasure target = null;
      for (Treasure treasure : route) {
        var dist = location.distance(treasure.getLocation());
        if (dist < minDist) {
          target = treasure;
          minDist = dist;
        }
      }
      route.remove(target);

      // Get path to current treasure
      for (Move move : findPath(target.getLocation(), location, board)) {
        moves.add(move);
      }

      // Update next start location to treasure location
      location = target.getLocation();
    }
  }

  private class MapNode {
    int score;
    MapNode parent;
    Move move;

    public MapNode(int score, MapNode parent, Move move) {
      this.score = score;
      this.parent = parent;
      this.move = move;
    }

    public MapNode getParent() {
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
    // Build model of board
    var model = new MapNode[board.getHeight()][board.getWidth()];
    model[to.getRow()][to.getCol()] = new MapNode(1000, null, null);
    // bestPathValue - lazy way to get an 'updatable' value into this recursive
    // function vs making a new class
    var bestPathValue = new int[1];

    for (Move move : DIRECTIONS) {
      calculateSteps(to, from, move, bestPathValue, model, board);
    }

    // Find moves in shortest path
    var moves = new ArrayList<Move>();
    var startNode = model[from.getRow()][from.getCol()];
    while (startNode.getParent() != null) {
      moves.add(startNode.getMove());
      startNode = startNode.getParent();
    }

    return moves;
  }

  private void calculateSteps(Location location, Location target, Move move, int[] bestPathValue, MapNode[][] model,
      IBoard board) {
    var newLocation = move.apply(location);
    var newRow = newLocation.getRow();
    var newCol = newLocation.getCol();

    if (newRow > -1 && newCol > -1 && newRow < board.getHeight() && newCol < board.getWidth() &&
        !board.getSquareAt(newLocation).getSpriteName().equals("Wall")) {

      var currentNode = model[location.getRow()][location.getCol()];
      var newValue = currentNode.getScore() - board.getSquareAt(newLocation).getStepCost();

      if (newValue > bestPathValue[0]
          && (model[newRow][newCol] == null || newValue > model[newRow][newCol].getScore())) {
        // Reassign new value
        model[newRow][newCol] = new MapNode(newValue, currentNode, move.inverse().get());

        if (newLocation.distance(target) != 0) {
          // Check all neighbors
          for (Move newMove : DIRECTIONS) {
            calculateSteps(newLocation, target, newMove, bestPathValue, model, board);
          }
        } else {
          bestPathValue[0] = newValue;
        }
      }
    }
  }

  public Move selectMove(IBoard board) throws Error {
    return moves.remove(0);
  }

  public void gameCompleted(IBoard board) {
  }
}