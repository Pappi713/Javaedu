package exception;

public class DivisonDemo {

	public static void main(String[] args) {
		try {		
				int a = Integer.parseInt(args[0]);
				int b = Integer.parseInt(args[1]);
				System.out.println(a/b);
			}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("not enough argument");
		}
		
		catch(NumberFormatException e) {
			System.out.println("provide numbers only");
		}
		
		catch(ArithmeticException e) {
			System.out.println("one of the imput is Zero");
		}
		System.out.println("End of App");
		
	}
}
