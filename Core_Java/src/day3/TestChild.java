package day3;

public class TestChild implements Test, Test1 {
	
	public void show() {
		System.out.println("Show() in TestChild");
	}
	
	public void display() {
		System.out.println("Display() in TestChild");
	}
	
	
	public void myMethod() {
		System.out.println("mymethod in TestChild");
	}
	
	
	public static void main(String[] args) {
		TestChild obj = new TestChild();
		obj.show();
		obj.display();
		obj.myMethod();
		System.out.println("Number: " + Test.number);
		
	}
	
}
