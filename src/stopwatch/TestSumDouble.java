package stopwatch;

/**
 * Add the values which is double to array.
 * Its implements from the Runnable class. 
 * @author supisara
 *
 */
public class TestSumDouble implements Runnable{
	private int counter;
	static final int ARRAY_SIZE = 500000;
	private Double sum;

	/**
	 * Initialize the TestSumDouble.
	 * @param counter is the number of array that want to add.
	 */
	public TestSumDouble(int counter) {
		this.counter = counter;
	}
	
	/**
	 * Use to add the double number until the last number.
	 * Find the sum of those number.
	 */
	@Override
	public void run() {		
		Double[] values = new Double[ARRAY_SIZE];
		for(int i = 0 ; i < ARRAY_SIZE ; i++) 
			values[i] = new Double(i+1);

		// count = loop counter, i = array index
		sum = new Double(0.0);
		for(int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length) 
				i = 0;
			sum = sum + values[i];
		}
	}

	/**
	 * To print out the sum of Double objects.
	 * @return how many array that need to add and the sum of array.
	 */
	public String toString(){
		return 	String.format("Sum array of Double objects with count = %,d\nsum = %s", counter, sum);
	}

}
