import java.util.ArrayList;

public class RandomStringChooser {
    private ArrayList<String> strings = new ArrayList<String>();
    
    public RandomStringChooser(String[] strings) {
        for (String string : strings) {
            this.strings.add(string);
        }
    }

    public String getNext() {
        if (strings.size() == 0) {
            return "None";
        }
        int index = (int) (Math.random() * strings.size());
        return strings.remove(index);
    }

    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }
}
