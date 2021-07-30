package exception;

import java.io.IOException;

public class ThrowsDemo {
	
	void division(int a, int b) throws ArithmeticException, IOException {
		System.out.println(a/b);
		System.out.println("end of Div");
	}
	public static void main(String[] args) throws IOException {
		int a =10;
		int b =0;
		
		ThrowsDemo obj = new ThrowsDemo();
		
		try {
		obj.division(a,b);
		}
		catch(ArithmeticException e) {
			System.out.println("div withh zero is not possible");
		}
		System.out.println("end of app");
	}
}
