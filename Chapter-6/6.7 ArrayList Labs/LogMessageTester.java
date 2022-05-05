import java.util.List;

/**
 * LogMessageTester contains a main method to test LogMessage and SystemLog objects.
 * 
 * The tester constructs a LogMessage object, invokes the containsWord method,
 * and prints the results.  The tester then constructs a SystemLog object, invokes
 * the addMessage and removeMessages methods, and prints the results.
 */
public class LogMessageTester {
  public static void main(String[] args) {
    // tests LogMessage constructor
    LogMessage message1 = new LogMessage("CLIENT3:security alert - repeated login failures");
    LogMessage message2 = new LogMessage("Webserver:disk offline");
    LogMessage message3 = new LogMessage("SERVER1:file not found");
    LogMessage message4 = new LogMessage("SERVER2:read error on disk DSK1");
    LogMessage message5 = new LogMessage("SERVER1:write error on disk DSK2");
    LogMessage message6 = new LogMessage("Webserver:error on /dev/disk");
    
    System.out.println(message1.getMachineID());
    System.out.println(message1.getDescription());
    System.out.println(message2.getMachineID());
    System.out.println(message2.getDescription());
    System.out.println(message3.getMachineID());
    System.out.println(message3.getDescription());
    System.out.println(message4.getMachineID());
    System.out.println(message4.getDescription());
    System.out.println(message5.getMachineID());
    System.out.println(message5.getDescription());
    System.out.println(message6.getMachineID());
    System.out.println(message6.getDescription() + "\n");

    // tests LogMessage containsWord method
    // descriptions that properly contain "disk":
    LogMessage message7 = new LogMessage("CLIENT3:disk");
    LogMessage message8 = new LogMessage("Webserver:error on disk");
    LogMessage message9 = new LogMessage("SERVER1:error on /dev/disk disk");
    LogMessage message10 = new LogMessage("SERVER2:error on disk DSK1");
    
    System.out.println(message7.containsWord("disk"));
    System.out.println(message8.containsWord("disk"));
    System.out.println(message9.containsWord("disk"));
    System.out.println(message10.containsWord("disk") + "\n");
    
    // descriptions that do NOT properly contain "disk":
    LogMessage message11 = new LogMessage("SERVER1:DISK");
    LogMessage message12 = new LogMessage("Webserver:error on disk3");
    LogMessage message13 = new LogMessage("Server1:error on /dev/disk");
    LogMessage message14 = new LogMessage("Server2:diskette");
    
    System.out.println(message11.containsWord("disk"));
    System.out.println(message12.containsWord("disk"));
    System.out.println(message13.containsWord("disk"));
    System.out.println(message14.containsWord("disk") + "\n");
    
    // tests SystemLog constructor and addMessage method
    SystemLog theLog = new SystemLog();
    theLog.addMessage(message1);
    theLog.addMessage(message2);
    theLog.addMessage(message3);
    theLog.addMessage(message4);
    theLog.addMessage(message5);
    theLog.addMessage(message6);
    
    // tests SystemLog removeMessages method
    List<LogMessage> removedMessages = theLog.removeMessages("disk");
    // prints SystemLog removed messages that properly contiain "disk"
    for (LogMessage item : removedMessages) {
      System.out.println(item);
    }
    // prints remaining SystemLog messages that do NOT properly contain "disk"
    System.out.println("\n" + theLog);
    
  }
}