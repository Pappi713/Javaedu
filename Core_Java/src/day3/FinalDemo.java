package day3;

public class FinalDemo {
	final String msg = "Hello";
	
	final void show() {
		System.out.println("Final show() in FinalDemo");
	}
	
	public static void main(String[] args) {
		FinalDemo obj = new FinalDemo();
		System.out.println(obj.msg);
	}
}

class FinalDemoChild extends FinalDemo{
	
}
