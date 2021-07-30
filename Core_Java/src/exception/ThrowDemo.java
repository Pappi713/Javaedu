package exception;

public class ThrowDemo {
	void division(int a, int b) {
		if(b==0) {
			throw new ArithmeticException();
		}
		System.out.println(a/b);
		System.out.println("End of Division");
	}
	
	public static void main(String[] args) {
		int a =20;
		int b =0;
		ThrowDemo obj = new ThrowDemo();
		try {
			obj.division(a, b);
		}
		catch(ArithmeticException e) {
			System.out.println("Div by zero not possible");
		}
		System.out.println("End of App");
	}
}
