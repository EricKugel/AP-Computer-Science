public class Account {
  // Instance variables.
  public final double RATE = 0.035; // interest rate of 3.5%
  private int accountNumber = 0;
  private double balance = 0.0;
  
  /** Constructs an Account object by storing three parameters in three instance variables. */
  public Account(int accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }
  
  /** Returns account number. */
  public int getAccountNumber() {
    return accountNumber;
  }
  
  /** Returns current balance. */
  public double getBalance() {
    return balance;
  }
  
  /** Validates the transaction, then deposits the specified amount into the account.
    * Returns the new balance.
    */
  public double deposit(double amount) {
    if (amount < 0) {
      System.out.println("\nError: Deposit amount is invalid.");
    } else {
      balance = balance + amount;
    }
    return balance;
  }
  
  /** Validates the transaction, then withdraws the specified amount from the account and $1.5 service fee.
    * Returns the new balance.
    */
  public double withdraw(double amount) {
    if (amount < 0) {
      System.out.println("\nError: Deposit amount is invalid.");
    } else if (balance-amount < 0) {
      System.out.println("Error: Withdrawal requested would result in a negative balance.");
    } else {
      balance = balance-amount - 1.5;
    }
    return balance;
  }
  
  /** Adds interest to the account and returns nothing. */
  public void addInterest() {
    balance += (balance * RATE);
  }
  
  /* toString method, to be written in 4.2 Lab. */
  public String toString() {
    String output = "";
    output += "Account number: " + accountNumber; 
    output += "\nBalance: " + balance;
    return output;
  }
  
}