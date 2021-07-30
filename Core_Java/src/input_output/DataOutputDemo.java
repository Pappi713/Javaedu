package input_output;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataOutputDemo {

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter name : ");
		try {
			
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);
			
			System.out.println("Enter ID : ");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter Name : ");
			String name = br.readLine();
			System.out.println("Enter salary : ");
			float salary  = Float.parseFloat(br.readLine());
			
		
					
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Student\\eclipse-workspace\\files\\data.txt", true);
			DataOutputStream data =  new DataOutputStream(fout);
			
			data.writeInt(id);
			data.writeUTF(name);
			data.writeFloat(salary);
					
		}catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
