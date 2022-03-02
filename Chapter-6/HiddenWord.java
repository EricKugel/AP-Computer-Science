public class HiddenWord {
    private String word = null;

    public HiddenWord(String word) {
        this.word = word;
    }

    public String getHint(String guess) {
        String hint = "";
        for (int letterIndex = 0; letterIndex < guess.length(); letterIndex++) {
            String guessLetter = "" + guess.charAt(letterIndex);
            String rightLetter = "" + word.charAt(letterIndex);
            if (guessLetter.equals(rightLetter)) {
                hint += rightLetter;
            } else if (word.indexOf(guessLetter) > 0) {
                hint += "+";
            } else {
                hint += "*";
            }
        }
        return hint;
    }
}
