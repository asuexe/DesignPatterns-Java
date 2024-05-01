package vivek;

import java.util.Arrays;
import java.util.Random;

public class InsertionSortExemple {
  public static void sortI(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      int k = arr[i]; //key = k
      int j = i - 1;
      while (j >= 0 && arr[j] > k) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = k;
    }
  }
  public static void main(String[] args) {
    int n = 10; 
    int[] arr = new int[n];
    Random random = new Random();
    for (int i = 0; i < n; i++) {
      arr[i] = random.nextInt(100);
    }
    System.out.println("Before Insertion sorting: " +Arrays.toString(arr));
    long startI = System.nanoTime();
    sortI(arr);
    long endI = System.nanoTime();
    System.out.println("After Insertion sorting: " +Arrays.toString(arr));
    System.out.println("I : Execution time: "+(endI-startI)+" nanoseconds");
  }
}

