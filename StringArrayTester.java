/**
 * StringArrayTester contains a main method to test a StringArray object.
 *
 * The tester will create a new StringArray object, invoke overwrite and append methods,
 * and print out the object via the toString method.
 */
public class StringArrayTester {
  public static void main(String[] args) {
    String[] text = {"Bad", "puns", "are", "not", "that", "punny"};
    StringArray pun = new StringArray(text);
    pun.overwrite(3, 3);
    System.out.println(pun);
    pun.append(2);
    System.out.println(pun);
  }
}