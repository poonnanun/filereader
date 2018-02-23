package lecture01;

/**
 *create stop watch to count the time elasped when reading file.
 * @author Poonnanun Poonnopathum
 */
public class Stopwatch {

	private static final double NANOSECOND = 1.0E-9;
	private long startTime;
	private long stopTime;
	private boolean isRun;
	
	/**
	 * create new stop watch
	 */
	public Stopwatch(){
		isRun = false;
	}
	
	/**
	 * Start timer
	 */
	public void start(){
		this.startTime = System.nanoTime();
		this.isRun = true;
	}
	
	/**
	 * Stop timer
	 */
	public void stop(){
		this.stopTime = System.nanoTime();
		this.isRun = false;
	}
	
	/**
	 * Check if stopwatch is running
	 */
	public boolean isRunning(){
		return this.isRun;
	}
	
	/**
	 * get the elapsed time
	 * @return elapsed time
	 */
	public double getElapsed(){
		if(isRun) return (System.nanoTime() - startTime)*NANOSECOND;
		return (this.stopTime - startTime)*NANOSECOND;
	}
}
