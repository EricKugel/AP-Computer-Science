import java.util.List;
import java.util.ArrayList;

/**
 * A system log contains a list of all log entries, which can be added and removed.
 */
public class SystemLog {
  /** 
   * Contains all the entries in this system log.
   * Guarenteed not to be null and to contain only non-null entries.
   */
  private List<LogMessage> messageList;
  
  /**
   * Constructor instantiates list of log messages
   */
  public SystemLog() {
    messageList = new ArrayList<LogMessage>();
  }
  
  /**
   * Adds log message to end of message list.
   * 
   * @param item  the log message to be added
   */
  public void addMessage(LogMessage item) {
    messageList.add(item);
  }
  
  /** 
   * Removes from the system log all entries whose descriptions properly contain keyword,
   * and returns a list(possibly empty) containing the removed entries.
   * Postcondition:
   *  - Entries in the returned list properly contain keyword and
   *    are in the order in which they appeared in the system log.
   *  - The remaining entries in the system log do not properly contain keyword and
   *    are in their original order.
   *  - The returned list is empty if no messages properly contain keyword.
   */
  public List<LogMessage> removeMessages(String keyword) {
    ArrayList<LogMessage> messages = new ArrayList<LogMessage>();
    for (int i = 0; i < messageList.size(); i++) {
      if (messageList.get(i).containsWord(keyword)) {
        messages.add(messageList.remove(i));
        i--;
      }
    }
    return messages;
  }
  
  
  /**
   * Returns a string of log messages, one message per line.
   * Not included in the original AP question.
   * 
   * @return  a string representation of the object
   */
  public String toString() {
    String output = "";
    for (LogMessage item : messageList) {
      output += item.toString() + "\n";
    }
    return output;
  }
  
}