package pack1;

public class Parent {
	
	public Parent() {
		System.out.println("Parent DEF const" );
				
	}
	
	public Parent(String msg) {
		this();
		System.out.println("Parent param const" +msg);
				
	}
}
