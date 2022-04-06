/**
 * HorseBarnTester contains a main method to test a HorseBarn object.
 * 
 * The tester constructs a HorseBarn object, invokes the addHorse, findHorseSpace,
 * consolidate, and toString methods, and prints the results.
 */
public class HorseBarnTester {
  public static void main(String[] args) {
    // sets up HorseBarn and adds horses
    HorseBarn sweetHome = new HorseBarn(7);
    Horse horse1 = new Arabian("Trigger", 1340);
    Horse horse2 = new Arabian("Silver", 1210);
    Horse horse3 = new Arabian("Patches", 1350);
    Horse horse4 = new Arabian("Duke", 1410);
    sweetHome.addHorse(0, horse1);
    sweetHome.addHorse(2, horse2);
    sweetHome.addHorse(5, horse3);
    sweetHome.addHorse(6, horse4);
    System.out.println(sweetHome);
    
    // tests findHorseSpace method  
    System.out.println(sweetHome.findHorseSpace("Trigger"));
    System.out.println(sweetHome.findHorseSpace("Silver"));
    System.out.println(sweetHome.findHorseSpace("Coco") + "\n");
    
    // tests consolidate method
    sweetHome.consolidate();
    System.out.println(sweetHome);
  }
  
}