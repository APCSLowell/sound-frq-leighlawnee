import java.util.*;
public class Sound
{
  /** the array of values in   sound; guaranteed not to be null */
  int[] samples;



  /** Changes those values in   sound that have an amplitude greater than limit.
   *  Values greater than limit are changed to limit.
   *  Values less than -limit are changed to -limit.
   *  @param limit the amplitude limit
   *         Precondition: limit >= 0
   *  @return the number of values in   sound that   method changed
   */
  public int limitAmplitude(int limit)
  {  
     int count = 0;
    for(int i = 0; i< samples.length; i++){
        if( samples[i]>limit){
          samples[i]=limit;
          count++;
        }else if( samples[i]<-limit){
           samples[i]=-limit;
          count++;
        }
    }
return count;

  }



  /** Removes all silence from the beginning of   sound.
   *  Silence is represented by a value of 0.
   *  Precondition: samples contains at least one nonzero value
   *  Postcondition: the length of samples reflects the removal of starting silence
   */
  public void trimSilenceFromBeginning()
  {
    int i = 0;
    while ( samples[i] == 0){
      i++;
    }
    int [] trimmed = new int [ samples.length-i];
    int k = 0;
    for(int j = i; j< samples.length; j++){
      trimmed[k] =  samples[j];
      k++;
    }
     samples = trimmed;
  }

}

