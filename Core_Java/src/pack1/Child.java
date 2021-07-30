package pack1;

public class Child extends Parent {
	public Child() {
		super("Hello");
		System.out.println("Child Defualt constructor");	
		}
	

	public Child(String msg) {
		this();
		System.out.println("Child " + msg);
	}
	
	public static void main(String[] args) {
		Child obj = new Child("HI");
	}
}

