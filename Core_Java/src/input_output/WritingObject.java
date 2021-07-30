package input_output;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class WritingObject {

	
	public static void main(String[] args) {
		
		
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);	
			System.out.println("Provide a product id");
			int pid = Integer.parseInt(br.readLine());
			System.out.println("Provide a product name");
			String pname = br.readLine();
			System.out.println("Provide a product price");
			float price = Float.parseFloat(br.readLine());
			
			Product product = new Product(pid,pname, price);
			
			FileOutputStream foat = new FileOutputStream("C:\\Users\\Student\\eclipse-workspace\\files\\product.txt");
			ObjectOutputStream obj = new ObjectOutputStream(foat);
			
			obj.writeObject(product);
			System.out.println("Writing prod object into file");
			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
