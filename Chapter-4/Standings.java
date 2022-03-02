public class Standings {
  private String teamName = "";
  private int wins = 0;
  private int losses = 0;
  
  public Standings(String teamName, int wins, int losses) {
    this.teamName = teamName;
    this.wins = wins;
    this.losses = losses;
  }
  
  public Standings(String teamName) {
    this.teamName = teamName;
  }
  
  public String getName() {
    return teamName;
  }
  
  public int getLosses() {
    return losses;
  }
  
  public int getWins() {
    return wins;
  }
  
  
  public void addWins() {
    wins++;
  }
  
  public void addWins(int wins) {
    this.wins += wins;
  }
  
  public void addLosses() {
    losses++;
  }
  
  public void addLosses(int losses) {
    this.losses += losses;
  }
  
  public double findWinPercentage() {
    if (wins > 0 || losses > 0) {
      return (double) wins / (wins + losses);
    } else {
      return 0.0;
    }
  }
  
  public String toString() {
    return "Team name: " + teamName + "\n" +
           "Wins: " + wins + "  Losses: " + losses + "\n" + 
           "Winning percentage: " + findWinPercentage();
  }
}