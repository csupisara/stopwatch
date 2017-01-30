package stopwatch;

import java.io.IOException;

/**
 * This is main method to compile the task.
 * @author supisara
 *
 */
public class Main {

	/** Create object and send the count number */
	public static void main(String[] args) throws IOException {
		TaskTimer taskTimer = new TaskTimer();
		taskTimer.measureAndPrint(new TestAppendToString(50000));
		// same task but with a larger string size (append more chars)
		taskTimer.measureAndPrint(new TestAppendToString(100000));
		// do the same thing using StringBuilder.
		taskTimer.measureAndPrint(new TestAppendToStringBuilder(100000));
		// Use a large loop count for floating point tests in order to get accurate times
		int counter = 1000000000; 
		taskTimer.measureAndPrint(new TestSumDoublePrimitive(counter));
		taskTimer.measureAndPrint(new TestSumDouble(counter));
		taskTimer.measureAndPrint(new TestSumBigDecimal(counter));
	}
}
