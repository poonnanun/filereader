package lecture01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * read file by buffered reader
 * @author Poonnanun Poonnopathum
 */
public class AppendStringBuilderTask implements Runnable{
	
	private int size;
	public AppendStringBuilderTask(){
		this.size = 0;
	}
	
	/**
	 * run method readfile
	 */
	@Override
	public void run() {
		String data = readFileToStringBuilder("src/Alice-in-WonderLand.txt");
		this.size = data.length();
	}
	
	/**
	 * @return string format
	 */
	@Override
	public String toString(){
		return String.format("Readfile to StringBuilder read %d chars", this.size);
	}
	
	/**
	 * read file by using filereader and StringBuilder
	 * @param filename
	 * @return data
	 */
	public static String readFileToStringBuilder(String filename){
		StringBuilder data = new StringBuilder();
		try{
			InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
			int c;
			while( true ){
				c = reader.read();
				if(c < 0) break;
				data = data.append((char)c);
			}
			reader.close();
		}catch( IOException ex){
			System.out.println(ex.getMessage());
		}
		return data.toString();
	}

}
