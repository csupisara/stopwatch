package stopwatch;

/**
 * Add the values which is primitive double to array.
 * Its implements from the Runnable class. 
 * @author supisara
 *
 */
public class TestSumDoublePrimitive implements Runnable{
	private double sum;
	private int counter;
	static final int ARRAY_SIZE = 500000;

	/**
	 * Initialize the TestSumDoublePrimitive.
	 * @param counter is the number of array that want to add.
	 */
	public TestSumDoublePrimitive(int counter) {
		this.counter = counter;
	}
	
	/**
	 * Use to add the number which is primitive double until the last number.
	 * Find the sum of those number.
	 */
	@Override
	public void run() {
		double[] values = new double[ARRAY_SIZE];
		
		for(int k = 0 ; k < ARRAY_SIZE ; k++) 
			values[k] = k+1;
		// count = loop counter, i = array index value
		sum = 0.0;
		for(int count = 0, i = 0; count < counter ; count++, i++) {
			
			if (i >= values.length) 
				i = 0;  // reuse the array when get to last value
			sum = sum + values[i];
		}		
	}
	
	/**
	 * To print out the sum of double primitives.
	 *  @return how many array that need to add and the sum of array.
	 */
	public String toString(){
		return 	String.format("Sum array of double primitives with count = %,d\nsum = %s", counter, sum);

	}
}
