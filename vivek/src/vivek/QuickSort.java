package vivek;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
  public static void sortQ(int[] arr, int low, int high) {
    if (low < high) {
      int PI = partition(arr, low, high); //pivotIndex = PI
      sortQ(arr, low, PI - 1);
      sortQ(arr, PI + 1, high);
    }
  }

  private static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (arr[j] <= pivot) {
        i++;
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
      }
    }
    int t = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = t;
    return i + 1;
  }

  public static void main(String[] args) {
    int n = 10;
    int[] arr = new int[n];
    Random random = new Random();
    for (int i = 0; i < n; i++) {
      arr[i] = random.nextInt(10000);
    }
    System.out.println("Before Quick sorting: " + Arrays.toString(arr));
    long startQ = System.nanoTime();
    sortQ(arr, 0, n - 1);
    long endQ = System.nanoTime();
    System.out.println("After Quick sorting: " + Arrays.toString(arr));
    System.out.println("Q : Execution time: " + (endQ-startQ) + " nanoseconds");
  }
}
