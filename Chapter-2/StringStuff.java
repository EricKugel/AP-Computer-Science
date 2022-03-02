// String experimentation from Section 2.7
// Follow the directions in the comments.

public class StringStuff
{
  public static void main (String[] args)
  {
    // Replace the name variable with your full name.
    String name = "Eric Nicholas Kugel";
    System.out.println("My name is " + name + ".");
    System.out.println("Including spaces, my name is " + name.length() + " characters long.");
    System.out.println();
    
    // Use the indexOf method to find the beginning of index of each of your names.
    System.out.println(name.indexOf("Eric"));
    System.out.println(name.indexOf("Nicholas"));
    System.out.println(name.indexOf("Kugel"));
    System.out.println();
    
    // Use the substring method (with two parameters) to print your first name.
    System.out.println("My first name is " + name.substring(0, name.indexOf(" ")) + ".");
    
    // Use the substring method (with two parameters) to print your middle name.
    // Do this here:
    System.out.println("My middle name is " + name.substring( name.indexOf(" ") + 1, name.lastIndexOf(" ")) + ".");
    
    // Use the substring method (with one parameter) to print your last name.
    // Do this here:                   
    System.out.println("My last name is " + name.substring(name.lastIndexOf(" ") + 1) + ".");
    System.out.println();
    
    // Finally, use the toUpperCase and toLowerCase to write your name in all upper case and all lowercase.
    // Do this here:
    // Do this here:
    System.out.println("My name in all caps is " + name.toUpperCase() + ".");
    System.out.println("My name in all lower case is " + name.toLowerCase() + ".");
  }
}