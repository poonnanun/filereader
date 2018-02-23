package lecture01;

public class Main {

	public static void main(String[] args){
		
		AppendStringTask task1 = new AppendStringTask();
		TaskTimer.runTask(task1);
		
		AppendStringBuilderTask task2 = new AppendStringBuilderTask();
		TaskTimer.runTask(task2);
		
		AppendBufferedReaderTask task3 = new AppendBufferedReaderTask();
		TaskTimer.runTask(task3);
		
	}
	
}
