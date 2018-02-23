package lecture01;

public class TaskTimer {
	
	public static void runTask(Runnable runnable) {
		Stopwatch s = new Stopwatch();
		s.start();
		runnable.run();
		s.stop();
		System.out.print(runnable.toString() + " in " + String.format("%.6f", s.getElapsed()) +" sec\n");
	}
	
	
}
