import java.util.ArrayList;

public class Range implements NumberGroup {
    private ArrayList<Integer> numbers = new ArrayList<Integer>();

    public Range(int min, int max) {
        for (int i = min; i <= max; i++) {
            numbers.add(i);
        }
    }

    public boolean contains(int num) {
        for (int i : numbers) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
}
