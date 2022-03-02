import java.util.Scanner;

public class ExtraLife {
  private double donation = 0.0;
  private String donorName = "";
  private String message = "";
  private boolean coverServiceFee = false;
  
  public ExtraLife(double donation, String donorName, String message) {
    this.donation = donation;
    this.donorName = donorName;
    this.message = message;
  }
  
  public ExtraLife(double donation, String donorName) {
    this.donation = donation;
    this.donorName = donorName;
  }
  
  public ExtraLife(double donation) {
    this.donation = donation;
    this.donorName = "Anonymous";
  }
  
  public void coverServiceFee(boolean willCoverServiceFee) {
    this.coverServiceFee = willCoverServiceFee;
    if (willCoverServiceFee) {
      this.donation += 3.5;
    }
  }
  
  public void coverServiceFee() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the amount of fee to cover");
    double amountPaid = scanner.nextDouble();
    this.coverServiceFee = true;
    this.donation += amountPaid;
  }
  
  public double getDonation() {
    return donation;
  }
  
  public String getName() {
    return donorName;
  }
  
  public String getMessage() {
    return message;
  }
  
  public String toString() {
    String output = "Thank you, " + donorName + ", for your donation of " + donation;
    if (coverServiceFee) {
      output += " and for covering the service fee";
    }
    output += ".";
    return output;
  }
}