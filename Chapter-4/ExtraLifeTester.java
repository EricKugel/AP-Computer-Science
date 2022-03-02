public class ExtraLifeTester {
  public static void main(String[] args) {
    // Tests constructor with three parameters.
    ExtraLife donor1 = new ExtraLife(123456.78, "Link", "Thanks for helping the kids!");
    
    // Tests overloaded serviceFee method.
    donor1.coverServiceFee(true);
    
    // Tests toString method.
    System.out.println(donor1 + "\n");
    
    // Tests constructor with two parameters.
    ExtraLife donor2 = new ExtraLife(678924.13, "Zelda");
    
    donor2.coverServiceFee(false);
    System.out.println(donor2 + "\n");
    
    // Tests constructor with one parameter.
    ExtraLife donor3 = new ExtraLife(100);
    
    // Tests default serviceFee method.
    donor3.coverServiceFee();
    System.out.println(donor3 + "\n");
    
    // Tests getDonation method.
    double total = donor1.getDonation() + donor2.getDonation() + donor3.getDonation();
    System.out.println("Total donations (including service fees): " + total);
  } 
}