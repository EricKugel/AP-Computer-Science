public class ComputerTester {
  public static void main(String[] args) {
    // Tests Computer default constructor.
    Computer myComputer1 = new Computer();
    
    // Tests Computer overloaded constructor.
    HardDrive myDrive2 = new HardDrive(2000);
    Computer myComputer2 = new Computer("AMD Ryzen 7 1700X 3.4 GHz 8-Core", myDrive2);
    
    // Tests HardDrive toString method.
    System.out.println(myComputer1.getDrive() + "\n");
    
    // Tests Computer toString method.
    System.out.println(myComputer1 + "\n");
    System.out.println(myComputer2 + "\n");
    
    // Tests getBestDrive method.
    System.out.println("The best hard drive's " + myComputer1.findBestDrive(myComputer2));
  }
}