import java.util.ArrayList;

/**
 * A word editor stores and revises text.
 */
public class WordEditor implements Edit {
  private ArrayList<String> text = null;
  
  public WordEditor(String[] words) {
    text = new ArrayList<String>();
    for (String word : words) {
      text.add(word);
    }
  }

  public ArrayList<String> copy(int start, int endBefore) {
    ArrayList<String> clipboard = new ArrayList<String>();
    for (int i = start; i < endBefore; i++) {
      clipboard.add(text.get(i));
    }
    return clipboard;
  }

  public ArrayList<String> cut(int start, int endBefore) {
    ArrayList<String> clipboard = new ArrayList<String>();
    for (int i = start; clipboard.size() < endBefore - start; i++) {
      clipboard.add(text.remove(i));
      i--;
    }
    return clipboard;
  }

  public void paste(int index, ArrayList<String> words) {
    for (int i = 0; i < words.size(); i++) {
      text.add(i + index, words.get(i));
    }
  }
  
}

