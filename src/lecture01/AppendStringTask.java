package lecture01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * read file by file reader
 * @author Poonnanun Poonnopathum
 */
public class AppendStringTask implements Runnable{

	private int size;
	public AppendStringTask(){
		this.size = 0;
	}
	
	/**
	 * run method readfile
	 */
	@Override
	public void run() {
		String data = readFileToString("src/Alice-in-WonderLand.txt");
		this.size = data.length();
	}
	
	/**
	 * @return string format
	 */
	@Override
	public String toString(){
		return String.format("InputStreamReader read %d chars", this.size);
	}
	
	/**
	 * read file by using filereader
	 * @param filename
	 * @return data
	 */
	private static String readFileToString(String filename){
		String data = "";
		try{
			InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
			int c;
			while( true ){
				c = reader.read();
				if(c < 0) break;
				data = data + (char)c;
			}
			reader.close();
		}catch( IOException ex){
			System.out.println(ex.getMessage());
		}
		return data;
	}
}
