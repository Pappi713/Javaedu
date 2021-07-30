package input_output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadWriteDemo {

	public static void main(String[] args) {
		

		try {
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);
			System.out.println("Enter Message");
			String msg = br.readLine();
			
			FileWriter writer = new FileWriter("C:\\Users\\Student\\eclipse-workspace\\files\\message.txt");
			writer.write(msg);
			writer.flush();
			System.out.println("Writing Message Into file");
			
			System.out.println("Reading file");
			
			FileReader reader = new FileReader("C:\\Users\\Student\\eclipse-workspace\\files\\message.txt");
			br = new BufferedReader(reader);
			
			String str ="";
			while((str = br.readLine()) !=null) {
				System.out.println(br.readLine());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
