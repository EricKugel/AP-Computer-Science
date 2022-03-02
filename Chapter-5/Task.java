public class Task implements Priority, Comparable {
  private String name;
  private String description;
  private int priority;
  
  private static int numTasks;
  public Task(String name, String description, int priority) {
    this.name = name;
    this.description = description;
    this.priority = priority;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public int getPriority() {
    return priority;
  }
  
  public void setPriority(int priority) {
    this.priority = priority;
  }
  
  public static int getNumTasks() {
    return numTasks;
  }
  
  public int compareTo(Object other) {
    Task otherTask = (Task) other;
    return this.getPriority() - otherTask.getPriority();
  }
}