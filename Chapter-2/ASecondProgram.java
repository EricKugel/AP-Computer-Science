public class ASecondProgram {
  
  private String goodAt;
  private int age;
  
  public void printInfo() {
    String ageLine = "I am " + age + " years old";
    String goodAtLine = "and I'm good at " + goodAt;
    
    System.out.println(ageLine);
    System.out.println(goodAtLine);
  }
  
  public ASecondProgram(int age, String goodAt) {
    this.age = age;
    this.goodAt = goodAt;
  }
  
  public static void main(String[] arg0) {
    new ASecondProgram(15, "violin").printInfo(); 
  }
  
}
