package input_output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingDemo {
	
	public static void main(String[] args) {
		
		
		File file = new File("C:\\Users\\Student\\eclipse-workspace\\files\\demo.txt");
		if(file.exists()) {
			try {
			FileInputStream fin = new FileInputStream(file);
				int i =0;
				while((i =fin.read()) != -1) {
					System.out.print((char)i);
				}
				
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("error"); 
		}
		System.out.println("\nEnd of App");
	}
}
