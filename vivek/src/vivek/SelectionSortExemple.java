package vivek;

import java.util.Arrays;
import java.util.Random;

public class SelectionSortExemple {
  public static void sort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
  }

  public static void main(String[] args) {
    int n = 10; // size of the array
    int[] arr = new int[n];
    Random random = new Random();
    for (int i = 0; i < n; i++) {
      arr[i] = random.nextInt(100);
    }
    System.out.println("Before sorting: " + Arrays.toString(arr));
    sort(arr);
    System.out.println("After sorting: " + Arrays.toString(arr));
  }
}
