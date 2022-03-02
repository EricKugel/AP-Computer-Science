/**
 * A computer has a processor and a hard drive.
 */  
   public class Computer {
   // instance variables
   private String processor = null;
   private HardDrive drive = null;
   
   /**
    * Initializes instance variables to default values.
    */
   public Computer() {
     processor = "Pentium 4 CPI 3.0 GHz Socket 478";
     drive = new HardDrive();
   }
   
   public Computer(String processor, HardDrive drive) {
     this.drive = drive;
     this.processor = processor;
   }
   
   /**
    * Returns the value of the processor.
    *
    * @return  the value of the processor
    */
   public String getProcessor() {
     return processor;
   }
   
   /**
    * Sets processor to parameter.
    *
    * @param theProcessor  the processor in this computer
    */
   public void setProcessor(String theProcessor) {
     processor = theProcessor;
   }
   
   /**
    * Returns HardDrive object.
    *
    * @return  the hard drive in this computer
    */
   public HardDrive getDrive() {
     return drive;
   }
   
   /** 
    * Sets hard drive to parameter.
    * 
    * @param aDrive  the hard drive in this computer
    */
   public void setDrive(HardDrive aDrive) {
     drive = aDrive;
   }
   
   /**
    * Compares the hard drive of this computer with the hard drive
    * in other computer to determine which is best, based on memory.
    * 
    * @param otherComp  the computer containing the hard drive to be compared
    */
   public HardDrive findBestDrive(Computer otherComp) {
     if (drive.getMemory() > otherComp.getDrive().getMemory()) {
       return drive;
     } else {
       return otherComp.getDrive();
     }
   }
   
   
   /** 
    * Returns the values of the processor and hard drive for this computer.
    * 
    * @return  a string representation of the object
    */
   public String toString() {
     String output = "";
     output += processor + "\n";
     output += "memory: " + drive;
     return output;
   }
   
   
 }