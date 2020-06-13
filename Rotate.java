/*This application takes an array of N elements and rotates
 * the elements to the right K number of times, it accomplishes this by
 * saving the value of the last element, then moving the rest of the list
 * to the right, then placing the value of the last element in the front of
 * the list; this is done K times 
 * Author: Mike Urbano
*/
import java.io.*;
import java.util.Arrays;
public class Rotate{
  public static void main(String[] args){
    int[] input1 = new int[]{3,8,9,7,6};
    rotateRight(input1, 3);

  }
  public static void rotateRight(int[] input, int K){
    //get size of input array
    int size = input.length;
    System.out.println("Array before rotation: " + Arrays.toString(input));
    for(int i=1; i<=K; i++){
      //save value of last element
      int temp = input[size-1];
      for(int j = size-1; j > 0; j--){
        //move all remaining elements to the right
        input[j] = input[j-1];
      }
      //place last element in front of list
      input[0] = temp;
      System.out.println("Array after " + i + " rotation(s): " +
      Arrays.toString(input));
    }
  }
}
