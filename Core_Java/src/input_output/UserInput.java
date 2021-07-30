package input_output;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) {

		
		System.out.println("Enter is: ");
		try {
			
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);
			String id = br.readLine();
			
			System.out.println("Enter name : ");
			String name = br.readLine();
			
			System.out.println("Enter salary : ");
			String salary  = br.readLine();
			
			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);
			
			
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Student\\eclipse-workspace\\files\\emp.txt", true);
			fout.write(id.getBytes());
			fout.write(name.getBytes());
			fout.write(salary.getBytes());
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
