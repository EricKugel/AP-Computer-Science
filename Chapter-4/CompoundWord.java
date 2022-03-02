public class CompoundWord {
  private String firstWord = "";
  private String secondWord = "";
  
  public CompoundWord(String firstWord, String secondWord) {
    this.firstWord = firstWord;
    this.secondWord = secondWord;
  }
  
  public String getFirstWord() {
    return firstWord;
  }
  
  public void setFirstWord(String firstWord) {
    this.firstWord = firstWord;
  }
  
  public String getSecondWord() {
    return secondWord;
  }
  
  public void setSecondWord(String secondWord) {
    this.secondWord = secondWord;
  }
  
  public int findTotalLength() {
    return (firstWord + secondWord).length();
  }
  
  public void swapWords() {
    String temp = firstWord;
    firstWord = secondWord;
    secondWord = temp;
  }
  
  public String toString() {
    return firstWord + secondWord;
  }
}