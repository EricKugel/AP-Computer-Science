public class WordMatch {
  private String secret;
  
  public WordMatch(String word) {
    secret = word;
  }
  
  public int scoreGuess(String guess) {
    int occurences = 0;
    int guessIndex = secret.indexOf(guess);
    while (guessIndex > -1) {
      occurences++;
      guessIndex = secret.indexOf(guess, guessIndex + guess.length());
    }
    
    int score = occurences * (int) Math.pow(guess.length(), 2);
    return score;
  }
  
  
  /**
   * Returns the better of two guesses, as determined by scoreGuess and the rules for a
   * tie-breaker that are descibed in part (b).
   * Precondition: guess1 and guess2 contain all lowercase letters.
   *               guess1 is not the same as guess2.
   *
   * @param guess1  the first guess to be compared
   * @param guess2  the second guess to be compared
   * @return        guess1 or guess2, whichever is better
   */
  public String findBetterGuess(String guess1, String guess2) {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    
    int score1 = scoreGuess(guess1);
    int score2 = scoreGuess(guess2);
    if (score1 > score2) {
      return guess1;
    } else if (score1 < score2) {
      return guess2;
    } else {
      boolean guess1Greater = true;
      boolean isComplete = false;
      int index = 0;
      while(!isComplete) {
        try {
          String letter1 = ("" + guess1.charAt(index)).toLowerCase();
          String letter2 = ("" + guess2.charAt(index)).toLowerCase();
          if (!letter1.equals(letter2)) {
            guess1Greater = alphabet.indexOf(letter1) > alphabet.indexOf(letter2);
            isComplete = true;
          }
        } catch (Exception e) {
          guess1Greater = guess1.length() > guess2.length();
          isComplete = true;
        }
        index++;
      }
      if (guess1Greater) {
        return guess1;
      } else {
        return guess2;
      }
    }  
  }
  
  
}