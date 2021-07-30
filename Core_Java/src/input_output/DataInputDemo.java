package input_output;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputDemo {
	
	public static void main(String[] args) {
			try {
		FileInputStream fin = new FileInputStream("C:\\Users\\Student\\eclipse-workspace\\files\\emp.txt");
		DataInputStream data = new DataInputStream(fin);
		
		System.out.println(data.readInt());
		System.out.println(data.readUTF());
		System.out.println(data.readFloat());
		

	}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
			catch( IOException e) {
				e.printStackTrace();
			}
	}
 
	
}
