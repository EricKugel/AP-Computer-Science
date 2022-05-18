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
  private static final Move[] DIRECTIONS = {Move.NORTH, Move.WEST, Move.SOUTH, Move.EAST};
  
  public String getName() {
      return "Eric Kugel";
  }

  public void analyzeBoard(IAnalysisBoard board) {
    moves = new ArrayList<Move>();
    Location location = board.getPlayerLocation();
    ArrayList<Treasure> route = new ArrayList<Treasure>();
    while (route.size() < board.getRemainingTreasureCount()) {
      int minCost = Integer.MAX_VALUE;
      Treasure target = null;
      for (Treasure treasure : board.getTreasures()) {
        boolean added = false;
        for (Treasure other : route) {
          if (treasure.equals(other)) {
            added = true;
          }
        }

        if (!added) {
          int cost = getPathCost(location, findPath(treasure.getLocation(), location, board), board);
          if (cost < minCost) {
            target = treasure;
            minCost = cost;
          }
        }
      }

      route.add(target);
      for (Move move : findPath(target.getLocation(), location, board)) {
        moves.add(move);
      }
      location = target.getLocation();
    }
  }

  private ArrayList<Move> findPath(Location to, Location from, IBoard board) {
    int[][] model = new int[board.getHeight()][board.getWidth()];
    model[to.getRow()][to.getCol()] = 1000;
    for (Move move : DIRECTIONS) {
      calculateSteps(to, move, model, board);
    }

    ArrayList<Move> moves = new ArrayList<Move>();
    while(from.distance(to) != 0) {
      int maxValue = 0;
      Move next = null;
      for (Move move : DIRECTIONS) {
        Location newLocation = applyMove(from, move);
        if (model[newLocation.getRow()][newLocation.getCol()] > maxValue) {
          maxValue = model[newLocation.getRow()][newLocation.getCol()];
          next = move;
        }
      }
      from = applyMove(from, next);
      moves.add(next);
    }
    return moves;
  }
  
  private void calculateSteps(Location location, Move move, int[][] model, IBoard board) {
    Location newLocation = applyMove(location, move);
    if (newLocation.getRow() > -1 && newLocation.getCol() > -1 && newLocation.getRow() < board.getHeight() && newLocation.getCol() < board.getWidth() && !board.getSquareAt(newLocation).getSpriteName().equals("Wall")) {
      int newValue = model[location.getRow()][location.getCol()] - board.getSquareAt(newLocation).getStepCost();
      if (newValue > model[newLocation.getRow()][newLocation.getCol()]) {
        model[newLocation.getRow()][newLocation.getCol()] = newValue;
        for (Move newMove : DIRECTIONS) {
          calculateSteps(newLocation, newMove, model, board);
        }
      }
    }
    for (int[] r : model) {
      for (int c : r) {
        System.out.print(c + "\t");
      }
      System.out.println();
    }
  }

  private int getPathCost(Location location, ArrayList<Move> moves, IBoard board) {
    int cost = 0;
    for (Move move : moves) {
      location = applyMove(location, move);
      cost += board.getSquareAt(location).getStepCost();
    }
    return cost;
  }

  public Move selectMove(IBoard board) throws Error {
    return moves.remove(0);
  }

  public void gameCompleted(IBoard board) {
    
  } 

  // Their Move.apply(Location loc) method doesn't work so I'll write it myself.
  private Location applyMove(Location loc, Move move) {
    if (move.equals(Move.NORTH)) {
      return new Location(loc.getRow() - 1, loc.getCol());
    } else if (move.equals(Move.WEST)) {
      return new Location(loc.getRow(), loc.getCol() - 1);
    } else if (move.equals(Move.SOUTH)) {
      return new Location(loc.getRow() + 1, loc.getCol());
    } else {
      return new Location(loc.getRow(), loc.getCol() + 1);
    }
  }
  
  public static void main(String args[]) {
      MyTreasureHunt.run(new MyPlayer());
  }
}