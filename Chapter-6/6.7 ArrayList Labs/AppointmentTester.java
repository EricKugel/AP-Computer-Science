/**
 * AppointmentTester contains a main method to test Appointment and DailySchedule objects.
 * 
 * The tester constructs a DailySchedule, invokes the addAppt method,
 * and prints the results.
 */
public class AppointmentTester {
  public static void main(String[] args) {
    // initial setup: tests adding four non-emergencty appointments that do not conflict
    DailySchedule myDentist = new DailySchedule();
    
    TimeInterval time1 = new TimeInterval(900, 1000);
    Appointment bugsBunny = new Appointment(time1);
    myDentist.addAppt(bugsBunny, false);
    
    TimeInterval time2 = new TimeInterval(1015, 1115);
    Appointment goofy = new Appointment(time2);
    myDentist.addAppt(goofy, false);
    
    TimeInterval time3 = new TimeInterval(1245, 1330);
    Appointment sid = new Appointment(time3);
    myDentist.addAppt(sid, false);
    
    TimeInterval time4 = new TimeInterval(1400, 1500);
    Appointment bob = new Appointment(time4);
    myDentist.addAppt(bob, false);
    System.out.println(myDentist);
    
    // tests adding a non-emergency appointment that conflicts with one appointment
    TimeInterval time5 = new TimeInterval(1030, 1130);
    Appointment towMater = new Appointment(time5);
    System.out.println(myDentist.addAppt(towMater, false));
    System.out.println(myDentist);
    
    // // tests adding an emergency appointment that conflicts with one appointment
    // TimeInterval time6 = new TimeInterval(1345, 1430);
    // Appointment edna = new Appointment(time5);
    // System.out.println(myDentist.addAppt(edna, true));
    // System.out.println(myDentist);
    
    // tests adding an emergency appointment that conflicts with two appointments
    TimeInterval time7 = new TimeInterval(1300, 1415);
    Appointment pinky = new Appointment(time7);
    System.out.println(myDentist.addAppt(pinky, true));
    System.out.println(myDentist);
  }
}