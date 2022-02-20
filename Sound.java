/**
 * A Sound object stores and revises samples of sound.
 */
public class Sound {
  /** the array of values in this sound; guaranteed not to be null */
  private int[] samples;
  
  /** 
   * Constructs a Sound object by setting samples variable equal to param values.
   * 
   * @param values  int array of positive and negative amplitudes of sound
   */
  public Sound(int[] values) {
    samples = values;
  }
  
  /** 
   * Changes those values in this sound that have an amplitude greater than limit.
   * Values greater than limit are changed to limit.
   * Values greater than -limit are changed to -limit.
   * @param limit  the amplitude limit
   *        Precondition: limit >= 0
   * @return the number of values in this sound that this method changed
   */
  public int limitAmplitude(int limit) {
    int changed = 0;
    for (int i = 0; i < samples.length; i++) {
      if (samples[i] > limit) {
        samples[i] = limit;
      } else if (samples[i] < limit * -1) {
        samples[i] = limit * -1;
      } else {
        changed -= 1;
      }
      changed += 1;
    }
    return changed;
  }
  
  
  /** 
   * Removes all silence from the beginning of this sound.
   * Silence is represented by a value of 0.
   * Precondition: samples contains at least one nonzero value
   * Postcondition: the length of samples reflects the removeal of starting silence
   */
  public void trimSilenceFromBeginning() {
    int index = 0;
    while (samples[index] == 0) {
      index += 1;
    }

    int[] newSamples = new int[samples.length - index];
    for (int i = index; i < samples.length; i++) {
      newSamples[i - index] = samples[i];
    }

    samples = newSamples;
  }
  
  
  /** 
   * Returns a string representation of the object.
   * 
   * @return a String representation of the object
   */
  public String toString() {
    String output = "";
    for (int item : samples) {
      output += item + "\t";
    }
    return output;
  }
  
}