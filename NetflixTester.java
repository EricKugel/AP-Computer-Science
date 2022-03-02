public class NetflixTester {
  public static void main (String[] args) {
    // Tests constructor default setRating, getRating, and toString methods.
    Netflix movie1 = new Netflix("Home Alone");
    movie1.setRating();
    System.out.println(movie1.getRating()); 
    System.out.println(movie1 + "\n");
    
    // Tests default setTitle, isPopular and getTitle methods.
    movie1.setTitle("HOME ALONe");
    if (movie1.isPopular()) {
      System.out.println(movie1.getTitle() + " is popular");
    } else {
      System.out.println(movie1.getTitle() + " is NOT popular");
    }
    
    // Tests toString method.
    System.out.println(movie1 + "\n");
    
    // Tests constructor and overloaded setRating method with a second object.
    Netflix movie2 = new Netflix("Pee Wee's Playhouse Christmas Special");
    movie2.setRating(1);
    
    // Tests overloaded isPopular and getTitle methods.
    if (movie2.isPopular(true)) {
      System.out.println(movie2.getTitle() + " is popular");
    } else {
      System.out.println(movie2.getTitle() + " is NOT popular");
    }
    
    // Tests toString method.
    System.out.println(movie2 + "\n");
  }
}