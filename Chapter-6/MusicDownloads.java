import java.util.List;
import java.util.ArrayList;

/**
 * Music downloads contains a list of DownloadInfo objects that can be updated and printed.
 */
public class MusicDownloads {
  /** 
   * The list of downloaded information.
   * Guaranteed not to be null and not to contain duplicate titles.
   */
  private List<DownloadInfo> downloadList;
  
  /** 
   * Creates the list of downloaded information.
   * 
   * @param downloadList  the current list of downloads
   */
  public MusicDownloads(ArrayList<DownloadInfo> downloadList)
  {  this.downloadList = downloadList;  }
  
  /** 
   * Returns a reference to the DownloadInfo object with the requested title if it exists.
   * Postcondition: no changes were made to downloadList
   * 
   * @param title  the requested title
   * @return       a reference to the DownloadInfo objet with the
   *               title that matches the parameter title if it exists in the list;
   *               null otherwise.
   */
  public DownloadInfo getDownloadInfo(String title) {
    DownloadInfo downloadInfo = null;
    for (DownloadInfo info : downloadList) {
      if (info.getTitle().equals(title)) {
        downloadInfo = info;
        break;
      }
    }
    return downloadInfo;
  }
  
  
  /** 
   * Updates downloadList with information from titles.
   * Postcondition:
   *  - there are no duplicate titles in downloadList.
   *  - no entries were removed from downloadList.
   *  - all songs in titles are represented in downloadList.
   *  - for each existing entry in downloadList, the download count is increased by
   *        the number of times its title appeared in titles.
   *  - the order of the existing entries in downloadList is not changed.
   *  - the first time an object with a title from titles is added to downloadList, it
   *        is added to the end of the list.
   *  - new entries in downloadList appear in the same order
   *        in which they first appear in titles.
   *  - for each new entry in downloadList, the download count is equal to
   *        the number of times its title appeared in titles.
   * 
   * @param titles  a list of song titles
   */
  public void updateDownloads(List<String> titles) {
    for (String title : titles) {
      DownloadInfo downloadInfo = getDownloadInfo(title);
      if (downloadInfo != null) {
        downloadInfo.incrementTimesDownloaded();
      } else {
        downloadList.add(new DownloadInfo(title));
      }
    }
  }
  
  
  /** 
   * Returns a string representation of the object.
   * Not included in the original AP question.
   * 
   * @return  a string representation of the object
   */
  public String toString() {
    String output = "";
    for (DownloadInfo item : downloadList) {
      output += item + "\n";
    }
    return output;
  }
  
}