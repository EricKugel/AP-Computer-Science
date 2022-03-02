public class Phrase {
  private String currentPhrase;
  
  public Phrase(String p)
  {  currentPhrase = p; }
  
  public int findNthOccurrence(String str, int n) {  
    int count = 0;
    int ans = -1;
    for (int i = 0; i < currentPhrase.length(); i++) {
      if (i + str.length() < currentPhrase.length()) {
        if (currentPhrase.substring(i, i+str.length()).equals(str)) {
          count++;
          if (count == n) {
            ans = i;
          }
        }
      }
    }
    return ans;
  }
  
  public void replaceNthOccurrence(String str, int n, String repl) {
    int index = findNthOccurrence(str, n);
    if (index > -1) {
      currentPhrase = currentPhrase.substring(0, index) + repl + currentPhrase.substring(index + str.length());
    }
  }
  
  public int findLastOccurrence(String str) {
    int n = 1;
    int index = findNthOccurrence(str, n);
    while (index > -1) {
      n++;
      index = findNthOccurrence(str, n);
    }
    return findNthOccurrence(str, n - 1);
  }
  
  public String toString() { 
    return currentPhrase;  
  }
}