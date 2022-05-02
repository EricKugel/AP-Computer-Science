/**
 * A log message is comprised of the machine ID and the description, which can be searched.
 */
public class LogMessage {
  private String machineID;
  private String description;
  
  /** 
   * Constructs a LogMessage by parsing machineID and description from param.
   * Precondition: message is a valid log message.
   */
  public LogMessage(String message) {
    machineID = message.substring(0, message.indexOf(":"));
    description = message.substring(message.indexOf(":") + 1);
  }
  
  
  /** 
   * Determines if the log message description contains param.
   * 
   * @return  true if the description in this log message properly contains keyword;
   *          false otherwise.
   */
  public boolean containsWord(String keyword) {
    int index = description.indexOf(keyword);
    if (index < 0) {
      return false;
    } else if (!(index == 0 || description.charAt(index - 1) == ' ')) {
      return false;
    } else if (!(index + keyword.length() >= description.length() || description.charAt(index + keyword.length()) == ' ')) {
      return false;
    }
    return true;
  }
  
  
  /**
   * Returns machine ID.
   * 
   * @return  the machine ID of this log message
   */
  public String getMachineID()
  {  return machineID;  }
  
  /**
   * Returns description.
   * 
   * @return  the description of this log message
   */
  public String getDescription()
  {  return description;  }
  
  /**
   * Returns the content of this log message in the format  machineID:description.
   * 
   * @return  a string representation of the object
   */
  public String toString()
  {  return machineID + ":" + description;  }
  
}