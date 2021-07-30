package pack1;

public class Demo {
	void show() {
		System.out.println("show() with the default access");
	}
	
	private void display() {
		System.out.println("display() with the private access");
	}
	
	protected void print() {
		System.out.println("printy() with the protected access");
	}
	
	public void myMehtod() {
		System.out.println("myMethod() with the public access");
	}
	
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.display();
	}
}
