/**
 * An undergrad is a college student who has not yet completed a bachelor's degree.
 */
public class Undergrad {
  // instance variables
  private String name = null;
  private int test1 = 0;
  private int test2 = 0;
  private int test3 = 0;
  private int testsTaken = 0;
  
  public Undergrad(String name) {  
    this.name = name;
  }
  
  public Undergrad(String name, int test1) {
    this(name);
    this.test1 = test1;
    testsTaken = 1;
  }
  
  public Undergrad(String name, int test1, int test2) {
    this(name, test1);
    this.test2 = test2;
    testsTaken = 2;
  }
  
  public Undergrad(String name, int test1, int test2, int test3) {
    this(name, test1, test2);
    this.test3 = test3;
    testsTaken = 3;
  }
  
  public String getName() {
    return name;
  }
  
  public int getTest1() {
    return test1;
  }
  
  public int getTest2() {
    return test2;
  }
  
  public int getTest3() {
    return test3;
  }
  
  public void addTest(int nextTest) {
    if (testsTaken == 0) {
      testsTaken = 1;
      test1 = nextTest;
    } else if (testsTaken == 1) {
      testsTaken = 2;
      test2 = nextTest;
    } else if (testsTaken == 2) {
      testsTaken = 3;
      test3 = nextTest;
    } else {
      System.out.println("Score invalid, already three tests taken");
    }
  }
  
  
  /**
   * Returns test average if number of tests is greater than 0; otherwise returns 0.0.
   * 
   * @return  average of all test scores, if there is at least one test;
   *          otherwise 0.0
   */
  public double calculateAverage() {
    if (testsTaken > 0) {
      return (test1 + test2 + test3) / (double) testsTaken;
    } else {
      return 0.0;
    }
  }
  
  
  /** 
   * Returns the name and current average of this undergrad.
   * 
   * @return  a string representation of the object.
   */
  public String toString() {
    return "Name: " + name + ", Current Average: " + calculateAverage();
  }
  
}