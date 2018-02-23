package lecture01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * read file by buffered reader
 * @author Poonnanun Poonnopathum
 */
public class AppendBufferedReaderTask implements Runnable{

	private int size;
	public AppendBufferedReaderTask(){
		this.size = 0;
	}
	
	/**
	 * run method readfile
	 */
	@Override
	public void run() {
		String data = readFileByBufferedReader("src/Alice-in-WonderLand.txt");
		this.size = data.length();
	}
	
	/**
	 * @return string format
	 */
	@Override
	public String toString(){
		return String.format("BufferedReader read %d chars", this.size);
	}
	
	/**
	 * read file by using bufferedReader
	 * @param filename
	 * @return data
	 */
	public static String readFileByBufferedReader(String filename){
		String data = "";
		try{
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			int a = 0;
			while(a<5){
				String s = reader.readLine();
				if(s == null) {
					a++;
					continue;
				}
				a = 0;
				data = data + s +"\n";
			}
			reader.close();
		}catch( IOException ex){
			System.out.println(ex.getMessage());
		}
		return data;
	}

}
