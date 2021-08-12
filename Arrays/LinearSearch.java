import java.io.*;
import java.util.*;

public class LinearSearch {
  public static void main(String[] args) {
    System.out.println(linearSearch(new int[]{1,2,3,4,5,6,7}, 7));  
    System.out.println(linearSearch(new int[]{17, 23, 45, 78}, 7));  
  }
  
  public static boolean linearSearch(int[] array, int key) {
    if(array == null || array.length < 1) return false;
    for(int index = 0; index < array.length; index++)
      if(array[index] == key) return true;
    return false;
  }  
}


