package tasks3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class ListEvenNumbers {

	public static void main(String[] args) {
		
		
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);
			System.out.println("Provide a number");
			int number = Integer.parseInt(br.readLine());
			
			System.out.println("The list of even numbers til N:");
			for(int i =1; i<= number; i++) {
				if(i%2 ==0) {
					System.out.println(i);
				}
			} 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
