public abstract class ReadingMaterial {
  private String author = null;
  private String title = null;
  private String publisher = null;
  private int numPages = 0;
  private String condition = null;
  
  // constructor to be used by classes that extend ReadingMaterial
  public ReadingMaterial(String author, String title, String publisher, int numPages, String condition) {
    this.author = author;
    this.title = title;
    this.publisher = publisher;
    this.numPages = numPages;
    this.condition = condition;
  }
  
  /**
   * Revises the condition of this reading material.
   * 
   * @param newCondition  the revised condition of this reading material
   */
  public void setCondition(String newCondition) {
    condition = newCondition;
  }
  
  /**
   * Returns the author of this reading material.
   * 
   * @return  the author of this reading material
   */
  public String getAuthor() {
    return author;
  }
  
  /**
   * Returns the title of this reading material.
   * 
   * @return  the title of this reading material
   */
  public String getTitle() {
    return title;
  }
  
  /**
   * Returns the publisher of this reading material.
   * 
   * @return  the publisher of this reading material
   */
  public String getPublisher() {
    return publisher;
  }
  
  /**
   * Returns the number of pages of this reading material.
   * 
   * @return  the number of pages of this reading material
   */
  public int getPages() {
    return numPages;
  }
  
  /**
   * Returns the condition of this reading material.
   * 
   * @return  the condition of this reading material
   */
  public String getCondition() {
    return condition;
  }
  
  /**
   * Returns a string message stating the title and author of this reading material.
   */
  public void read() {
    System.out.println("You're reading " + title + " by " + author + ".");
  }
  
  /**
   * Designates that this reading matierial is checked out by param holder.
   * 
   * @param holder  the id number of the person checking out this reading material
   */
  public abstract void checkOut(int holder);
  
  /**
   * Returns the pertinent data of this reading material as a string.
   * Overrides the toString method in Object.
   * 
   * @return  a string representation of the object
   */
  @Override
  public String toString() {
    return (title + ", by " + author + ". Published by " + publisher + ".\n" + numPages + " pages.  Condition: " + condition);
  }
  
}