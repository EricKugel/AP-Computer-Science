public class Student {
  private String name = "";
  private int gradeLevel = 0;
  private double gpa = -1;
  private int numberOfClasses = 0;
  private String emailAddress = "";
  private int energyLevel = -1;
  
  private Address address = null;
  
  public Student(String name, int gradeLevel, double gpa, int numberOfClasses, String emailAddress, Address address) {
    this.name = name;
    this.gradeLevel = gradeLevel;
    this.gpa = gpa;
    this.numberOfClasses = numberOfClasses;
    this.emailAddress = emailAddress;
    this.address = address;
    energyLevel = 30;
  }
  
  public void addClass(int numberOfClasses) {
    if (this.numberOfClasses + numberOfClasses <= 7) {
      this.numberOfClasses += numberOfClasses;
      energyLevel -= 3;
    }
  }
  
  public void dropClass(int numberOfClasses) {
    if (this.numberOfClasses + numberOfClasses >= 6) {
      this.numberOfClasses -= numberOfClasses;
      energyLevel -= 3;
    }
  }
  
  public void advanceGrade() {
    gradeLevel++;
    energyLevel -= 3;
  }
  
  public String getName() {
    return name;
  }
  
  public int getGrade() {
    return gradeLevel;
  }
  
  public double getGpa() {
    return gpa;
  }
  
  public int getClasses() {
    return numberOfClasses;
  }
  
  public String getEmail() {
    return emailAddress;
  }
  
  public int getEnergy() {
    return energyLevel;
  }
  
  public String toString() {
    return "Name: " + name + ", Grade: " + gradeLevel + "\n" + 
           "GPA: " + gpa + ", Classes: " + numberOfClasses + "\n" +
           "Email: " + emailAddress + ", Energy: " + energyLevel + "\n" + address;
  }
}