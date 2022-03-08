/**
 * Download info consists of the the title and number of downloads of a song, which can be incremented.
 */
public class DownloadInfo {
  private String title = "";
  private int downloads = 0;
  
  /** 
   * Creates a new instance with the given unique title and sets the
   * number of times downloaded to 1.
   * Implementation not shown in the original AP question.
   * 
   * @param title  the unique title of the downloaded song
   */
  public DownloadInfo(String title) {  
    this.title = title;
    downloads = 1;
  }
  
  /**
   * Returns the title.
   * Implementation not shown in the original AP question.
   * 
   * @return  the title
   */
  public String getTitle() {  
    return title;
  }
  
  /** 
   * Returns number of downloads.
   * Implementation not shown in the original AP question.
   * 
   * @return  number of downloads */
  public int getDownloads() {
    return downloads;
  }
  
  /**
   * Increments the number of titles downloaded by 1.
   * Implementation not shown in the original AP question.
   */
  public void incrementTimesDownloaded() {    
    downloads++;
  }
  
  /**
   * Returns a string representation of the object.
   * Not included in the original AP question.
   * 
   * @return  a string representation of the object
   */
  public String toString() {
    return "DownloadInfo Object Title: " + title + "\tDownloads: " + downloads;
  }
  
}