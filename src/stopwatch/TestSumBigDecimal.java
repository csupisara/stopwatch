package stopwatch;

import java.math.BigDecimal;

/**
 * Add the values to array.
 * Its implements from the Runnable class. 
 * @author supisara
 *
 */
public class TestSumBigDecimal implements Runnable{
	static final int ARRAY_SIZE = 500000;
	private BigDecimal sum ;
	private int counter;
	private BigDecimal[] values = new BigDecimal[ARRAY_SIZE];

	/**
	 * Initialize the TestSumBigDecimal.
	 * @param counter is the number of array that want to add.
	 */
	public TestSumBigDecimal(int counter) {
		this.counter = counter;
	}

	/**
	 * Use to add the number until the last number.
	 * Find the sum of those number.
	 */
	@Override
	public void run() {
		// create array of values to add, before we start the timer
		for(int i = 0 ; i < ARRAY_SIZE ; i++) 
			values[i] = new BigDecimal(i+1);

		sum = new BigDecimal(0.0);

		for(int count = 0 , i = 0 ; count < counter ; count++ , i++) {
			if (i >= values.length) 
				i = 0;
			sum = sum.add( values[i] );
		}
	}

	/**
	 * To print out the sum of BigDecimal object. 
	 * @return how many array that need to add and the sum of them.
	 */
	public String toString(){
		return String.format("Sum array of BigDecimal with count = %,d\nsum = %s", counter, sum);
	}
}
