// /**
//  * A game is a sport that involves points.
//  */
// public class Game extends Sport {
//   private String[] points = null;
  
//   /**
//    * Constructs a Game object.
//    * 
//    * @param name        the name of this game
//    * @param inOlympics  true if this game is a part of the Olympics
//    * @param points      the possible activities that score a certain number of points in this game
//    */
//   public Game(String name, boolean inOlympics, String[] points) {
//     super(name, inOlympics);
//     this.points = points;
//   }
  
  
//   /**
//    * Returns the array of points as a string.
//    * 
//    * @return  a string consisting of all activities that score a certain number of points in this game
//    */
//   public String pointsToString() {
//     String output = "";
//     for(String item : points) {
//       output += item + "\n";
//     }
//     return output.substring(0, output.length() - 1);
//   }
  
//   /**
//    * Returns true if this game and param have the same status in the Olympics (both in, or both out), and the 
//    * the same activities that score a certain number of points; false otherwise.
//    * Overrides the equals method in Object.
//    * 
//    * @return  true if this game and param are both in the Olympics, or both out, and have the same activities
//    *               that score a certain number of points;
//    *          false otherwise
//    */
//   @Override
//   public boolean equals(Object obj) {
//     Game other = (Game) obj;
//     return other.isInOlympics() == isInOlympics() 
//       && pointsToString().equals(other.pointsToString());
//   }
  
  
//   /**
//    * Returns all pertinent data for this game.
//    * Overrides the toString method in Object.
//    * 
//    * @return  a string representation of the object
//    */
//   @Override
//   public String toString() {
//     String output = "The game of " + getName() + " is ";
//     if (!isInOlympics()) {
//       output += "not ";
//     }
//     output += "in the Olympics.";
//     output += "\nThe means to score points are as follows:\n";
//     output += pointsToString();
//     return output;
//   }
  
// }