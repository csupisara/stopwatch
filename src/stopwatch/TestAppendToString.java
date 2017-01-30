package stopwatch;
/**
 * Use to append char to the string. 
 * Its implements from the Runnable class. 
 * @author supisara
 *
 */
public class TestAppendToString implements Runnable{
	private final char CHAR = 'a';
	private String result; 
	private int count;

	/**
	 * Initialize the TestAppendToString.
	 * @param count is the number of char that want to append.
	 */
	public TestAppendToString(int count) {
		this.result = "";
		this.count = count;
	}

	/**
	 * Use to append char as much as the count.
	 */
	@Override
	public void run() {
		int k = 0;
		while(k++ < count) {
			result = result + CHAR;
		}			
	}

	/**
	 * To print out the amount of chars and length of string.
	 *  @return the amount of chars that append and the final length of the string.
	 */
	public String toString(){
		return String.format("Append %,d chars to String\nfinal string length = %s", count, result.length());
	}
}
