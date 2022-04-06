import java.util.ArrayList;

public class RandomPlayer extends Player {
    public RandomPlayer(String name) {
        super(name);
    }

    @Override
    public String getNextMove(GameState state) {
        ArrayList<String> currentMoves = state.getCurrentMoves();
        if (currentMoves.size() == 0) {
            return "no move";
        }
        int index = (int) (Math.random() * currentMoves.size());
        return currentMoves.get(index);
    }
}
