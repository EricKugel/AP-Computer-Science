public class PhoneNumber
{
  public static void main (String[] arg0)
  {
    int firstThree = (int) (Math.random() * 900) + 100;
    while (("" + firstThree).indexOf("8") > -1 || ("" + firstThree).indexOf("9") > -1) {
      firstThree = (int) (Math.random() * 900) + 100;
    }
    int nextThree = (int) (Math.random() * 800) + 200;
    int lastFour = (int) (Math.random() * 10000);
    String lastFourString = "" + lastFour;
    while(lastFourString.length() < 4) {
      lastFourString = "0" + lastFourString;                   
    }
    
    String phoneNumber = "" + firstThree + "-" + nextThree + "-" + lastFourString;
    System.out.println(phoneNumber);
  }
}