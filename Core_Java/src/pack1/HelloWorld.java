package pack1;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		HelloWorld obj = new HelloWorld();
		obj.show("asd");
	}
	
	void show(String msg) {
		System.out.println("Show () :" +msg);
	}
}
