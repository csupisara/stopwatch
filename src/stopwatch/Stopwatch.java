package stopwatch;
/**
 * A Stopwatch that measure elapsed time between a starting time
 * and stopping time, or until the present time.
 * @author supisara
 * @version 1.0
 */
public class Stopwatch {
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was ended, in nanoseconds. */
	private long endTime;
	/** tell the status of the stopwatch. */
	private boolean run;
	
	/**
	 * Initialize the Stopwatch.
	 */
	public Stopwatch(){
		this.run = false;
		this.startTime = 0;
		this.endTime = 0;
	}

	/** Start the stopwatch if it is not already running. */
	public void start(){
		if(run == false){
			run = true;
			startTime = System.nanoTime();
		}
	}

	/** End the stopwatch if it is already running. */
	public void stop(){
		if(run == true){
			run = false;
			endTime = System.nanoTime();
		}
	}
	
	/** 
	 * The elapsed time from the beginning to the end or the current time.
	 * @return the elapsed time in seconds.
	 */
	public double getElapsed(){
		if(run == true){
			return (System.nanoTime() - startTime) * NANOSECONDS;
		}
			return (endTime - startTime) * NANOSECONDS;
	}

	/**
	 * Tell that the stopwatch is running or not.
	 * @return the status of the stopwatch.
	 */
	public boolean isRunning(){
		if(run == true){
			return true;
		}
		return false;
	}
}
