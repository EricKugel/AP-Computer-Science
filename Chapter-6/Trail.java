/**
 * A Trail object stores and revises samples of sound.
 */
public class Trail {
  /** Representation of the trail. The number of markers on the trail is markers.length. */
  private int[] markers;
  
  /**
   * Constructs a Trail object that instantiates instance variable markers.
   * Not included in the original AP question.
   */
  public Trail(int[] markers) {
    this.markers = markers;
  }
  
  /** 
   * Determines if a trail segment is level.  A trail segment is defined by a starting marker,
   * an ending marker, and all markers between those two markers.
   * A trail segment is level if it has a difference between the maximum elevation
   * and minimum elevation that is less than or equal to 10 meters.
   * @param start the index of the starting marker
   * @param end the index of the ending marker
   *        Precondition: 0 <= start < end <= markers.length - 1
   * @return true if the difference between the maximum and minimum
   *         elevation on this segment of the trail is less than or equal to 10 meters;
   *         false otherwise.
   */
  public boolean isLevelTrailSegment(int start, int end) {
    int max = markers[start];
    for (int i = start; i <= end; i++) {
      if (markers[i] > max) {
        max = markers[i];
      }
    }

    int min = markers[start];
    for (int i = start; i <= end; i++) {
      if (markers[i] < min) {
        min = markers[i];
      }
    }

    int difference = Math.abs(max - min);
    return difference <= 10;
  }
  
  
  /** 
   * Determines if this trail is rated difficult.  A trail is rated by counting the number of changes in
   * elevation that are at least 30 meters (up or down) between two consecutive markers. A trail
   * with 3 or more such changes is rated difficult.
   * @return true if the trail is rated difficult, false otherwise.
   */
  public boolean isDifficult() {
    int changes = 0;
    for (int i = 1; i < markers.length; i++) {
      int difference = Math.abs(markers[i] - markers[i - 1]);
      if (difference >= 30) {
        changes += 1;
      }
    }
    return changes >= 3;
  }
  
  
}