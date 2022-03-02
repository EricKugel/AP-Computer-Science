public class CodeWordCheckerTester {
  public static void main(String[] args) {
    StringChecker sc1 = new CodeWordChecker(5, 8, "$");
    System.out.println(sc1.isValid("happy"));
    System.out.println(sc1.isValid("happy$"));
    System.out.println(sc1.isValid("Code"));
    System.out.println(sc1.isValid("happyCode"));
    
    StringChecker sc2 = new CodeWordChecker("pass");
    System.out.println("\n" + sc1.isValid("MyPass"));
    System.out.println(sc2.isValid("Mypassport"));
    System.out.println(sc2.isValid("happy"));
    System.out.println(sc2.isValid("1,000,000,000,000,000"));
  }
}