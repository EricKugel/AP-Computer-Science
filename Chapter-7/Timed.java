// /**
//  * A timed game ends after an alloted amount of time.
//  */
// public class Timed extends Game {
//   private int time = -1;
  
//   /**
//    * Constructs a timed object.
//    * 
//    * @param name        the name of this timed game
//    * @param inOlympics  true if this timed game is in the Olympics; false otherwise
//    * @param points      the possible activities that score a certain number of points in this timed game
//    * @param time        the total time alloted for this timed game
//    */
//   public Timed(String name, boolean inOlympics, String[] points, int time) {
//     super(name, inOlympics, points);
//     this.time = time;
//   }
  
  
//   /**
//    * Returns the total time alloted for this timed game.
//    * 
//    * @return  the total time alloted for this timed game
//    */
//   public int getTime() {
//     return time;
//   }
  
//   /**
//    * Returns true if this game is equal to param game and the time of this timed game is equal
//    * to the time of param; false otherwise.
//    * 
//    * @return  true if this game equals param game, and this time equals the time of param;
//    *          false otherwise
//    */
//   public boolean equals(Object obj) {
//     Timed other = (Timed) obj;
//     return super.equals(obj) && time == other.getTime();
//   }
  
  
//   /**
//    * Returns all pertinent data for this timed game, including the number of minutes in this timed game.
//    * Overrides the toString method in Game.
//    * 
//    * @return  a string representation of the object
//    */
//   @Override
//   public String toString() {
//     String output = super.toString();
//     output += "\n" + getName() + " is played in " + time + " minutes.";
//     return output;
//   }

// }