package vivek;

public class Time {
	public void display() {
	    System.out.println("Calculating Method execution time:");
	  }

	  // main method
	  public static void main(String[] args) {

	    // create an object of the Main class
	    execute obj = new execute();
	    InsertionSortExemple a = new InsertionSortExemple();

	    // get the start time
	    long start = System.nanoTime();

	
	    // get the end time
	    long end = System.nanoTime();

	    // execution time
	    long execution = end - start;
	    System.out.println("Execution time: " + execution + " nanoseconds");
	  }

}
