package stopwatch;

/**
 * Use to append a char to a StringBuilder. 
 * Its implements from the Runnable class. 
 * @author supisara
 *
 */
public class TestAppendToStringBuilder implements Runnable{
	private final char CHAR = 'a';
	private int count;		
	private StringBuilder builder = new StringBuilder(); 
	private String result;

	/**
	 * Initialize the TestAppendToStringBuilder.
	 * @param count is the number of char that want to append.
	 */
	public TestAppendToStringBuilder(int count) {
		this.count = count;
	}
	
	/**
	 * Use to append char to the StringBuilder as much as the count.
	 */
	@Override
	public void run() {		
		int k = 0;
		while(k++ < count) {
			builder = builder.append(CHAR);
		}
		result = builder.toString();
	}
	
	/**
	 * To print out the amount of chars and length of string.
	 *  @return the amount of chars that append and the final length of the string.
	 */
	public String toString(){
		return String.format("Append %,d chars to StringBuilder\nfinal string length = %s", count, result.length());
	}
}
