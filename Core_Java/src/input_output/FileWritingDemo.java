package input_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingDemo {
	
	public static void main(String[] args) {
		
		String msg ="This is File Writing Demo";
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Student\\eclipse-workspace\\files\\msg.txt", true);
			fout.write(msg.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("End of App");
	}

}
