package vivek;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

  public static void sortM(int[] arr) {
    int n = arr.length;
    if (n < 2)
      return;
    int mid = n / 2;
    int[] left = Arrays.copyOfRange(arr, 0, mid);
    int[] right = Arrays.copyOfRange(arr, mid, n);
    sortM(left);
    sortM(right);
    merge(arr, left, right);
  }

  private static void merge(int[] arr, int[] left, int[] right) {
    int i = 0, j = 0, k = 0;
    int l = left.length;
    int r = right.length;
    while (i < l && j < r) {
      if (left[i] <= right[j]) {
        arr[k] = left[i];
        i++;
      } else {
        arr[k] = right[j];
        j++;
      }
      k++;
    }
    while (i < l) {
      arr[k] = left[i];
      i++;
      k++;
    }
    while (j < r) {
      arr[k] = right[j];
      j++;
      k++;
    }
  }

  public static void main(String[] args) {
    int n = 10;
    int[] arr = new int[n];
    Random random = new Random();
    for (int i = 0; i < n; i++) {
      arr[i] = random.nextInt(100);
    }
    System.out.println("Before Merge sorting: " + Arrays.toString(arr));
    long startM = System.nanoTime();
    sortM(arr);
    long endM = System.nanoTime();
    System.out.println("After Merge sorting: " + Arrays.toString(arr));
    System.out.println("M : Execution time: " +(endM - startM)+" nano seconds");
  }
}




