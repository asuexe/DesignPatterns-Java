package c;


import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class exe {
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
	public static void sortS(int[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n - 1; i++) {
	      int m = i; // MinIndex = m
	      for (int j = i + 1; j < n; j++) {
	        if (arr[j] < arr[m]) {
	          m = j;
	        }
	      }
	      int t = arr[m];
	      arr[m] = arr[i];
	      arr[i] = t;
	    }
	  }
	
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
			    // function that reverses array and stores it 
			    // in another array
			    static void reverse(int a[], int n)
			    {
			        int[] b = new int[n];
			        int j = n;
			        for (int i = 0; i < n; i++) {
			            b[j - 1] = a[i];
			            j = j - 1;
			        }
			  
			        // printing the reversed array
			        System.out.println("Reversed array is: \n");
			        for (int k = 0; k < n; k++) {
			            System.out.println(b[k]);
			        }
			    }
	public static void main(String[] args) {
		int n = 10000;
	    int[] arr = new int[n];
	    Random random = new Random();
	    for (int i = 0; i < n; i++) {
	      arr[i]=random.nextInt(1000);
	     // sortI(arr);
	    }
	   System.out.println("Before Insertion sorting: " +Arrays.toString(arr));
	    long startI = System.nanoTime();
	    sortI(arr);
	    long endI = System.nanoTime();
	    System.out.println("After Insertion sorting: " +Arrays.toString(arr));
	    System.out.println("I : Execution time: "+(endI-startI)+" nanoseconds");
	    System.out.println("Before Selection sorting: "+Arrays.toString(arr));
	    long startS = System.nanoTime();
	    sortS(arr);
	    long endS = System.nanoTime();
	    System.out.println("After Selection sorting: "+Arrays.toString(arr));
	    System.out.println("S : Execution time: " + (endS-startS) + " nanoseconds");
	    System.out.println("Before Merge sorting: " + Arrays.toString(arr));
	    long startM = System.nanoTime();
	    sortM(arr);
	    long endM = System.nanoTime();
	    System.out.println("After Merge sorting: " + Arrays.toString(arr));
	    System.out.println("M : Execution time: " +(endM - startM)+" nano seconds");
	    System.out.println("Before Quick sorting: " + Arrays.toString(arr));
	    long startQ = System.nanoTime();
	    sortQ(arr, 0, n - 1);
	    long endQ = System.nanoTime();
	    System.out.println("After Quick sorting: " + Arrays.toString(arr));
	    System.out.println("Q : Execution time: " + (endQ-startQ) + " nanoseconds");

	}


}
