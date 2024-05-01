package c;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Before sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        long start = System.currentTimeMillis();
        selectionSort(arr);
	    long end = System.currentTimeMillis();
	    long execution = end - start;
	    System.out.println("\nAfter sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
	    System.out.println("\nExecution time: " + execution + " seconds");   
    }
}

