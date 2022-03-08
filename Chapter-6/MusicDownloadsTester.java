import java.util.List;
import java.util.ArrayList;

/**
 * MusicDownloadsTester contains a main method to test a MusicDownloads object.
 * 
 * The tester constructs and fills a MusicDownloads object, invokes the getDownloadInfo
 * and updateDownloads methods, and prints the results.
 */
public class MusicDownloadsTester {
  public static void main(String[] args) {
    // initial setup
    DownloadInfo song1 = new DownloadInfo("Hey Jude");
    DownloadInfo song2 = new DownloadInfo("Soul Sister");
    DownloadInfo song3 = new DownloadInfo("Aqualung");
    
    ArrayList <DownloadInfo> allSongs = new ArrayList<DownloadInfo>();
    allSongs.add(song1);
    allSongs.add(song2);
    allSongs.add(song3);
    
    MusicDownloads webMusic = new MusicDownloads(allSongs);
    
    for (int i = 0; i < 4; i++) {
      allSongs.get(0).incrementTimesDownloaded();
    }
    for (int i = 0; i < 2; i++) {
      allSongs.get(1).incrementTimesDownloaded();
    }
    for (int i = 0; i < 9; i++) {
      allSongs.get(2).incrementTimesDownloaded();
    }
    // initial setup complete
    
    
    // tests getDownloadInfo method
    System.out.println(webMusic.getDownloadInfo("Hey Jude"));
    System.out.println(webMusic.getDownloadInfo("Soul Sister"));
    System.out.println(webMusic.getDownloadInfo("Aqualung"));
    System.out.println(webMusic.getDownloadInfo("Happy Birthday") + "\n");
    
    // setup to test updateDownloads method
    List<String> songTitles = new ArrayList<String>();
    songTitles.add("Lights");
    songTitles.add("Aqualung");
    songTitles.add("Soul Sister");
    songTitles.add("Go Now");
    songTitles.add("Lights");
    songTitles.add("Soul Sister");
    
    // tests updateDownloads method
    webMusic.updateDownloads(songTitles);
    System.out.println(webMusic);
  
  }
}