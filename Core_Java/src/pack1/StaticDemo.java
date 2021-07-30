package pack1;


public class StaticDemo {
	private int number;
	private static String msg;
	
	void show() {
		System.out.println("show() : ");
		System.out.println("Number : " + number);
		System.out.println("Msg : " + msg);
	}
	
	static void display() {
		System.out.println("Display () : ");
		System.out.println("Msg : " +msg);
	}
	
	static {
		System.out.println("Static block");
		msg = "Welcome";
	}
	
	public static void main(String[] args) {
		display();
		StaticDemo obj1 = new StaticDemo();
		obj1.number =100;
		obj1.show();
		
		StaticDemo obj2 = new StaticDemo();
		obj2.number =100;
		obj2.show();
		
	}
}
