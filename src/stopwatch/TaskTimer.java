package stopwatch;

/**
 * Measure the time elapse.
 * @author supisara
 *
 */
public class TaskTimer {
	private Stopwatch timer;
	
	/**
	 * Initialize the TaskTimer.
	 */
	public TaskTimer(){
	}
	
	/**
	 * It will start and stop the time as well as tells the task to run and print the time elapse.
	 * @param task is the task that we choose to run.
	 */
	public void measureAndPrint(Runnable task){
		timer = new Stopwatch();
		timer.start();
		task.run();
		timer.stop();
		System.out.println(task.toString());
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}
}
