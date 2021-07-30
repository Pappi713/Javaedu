package pack2;

public class Child extends Parent {
	void show() {
		System.out.println("Show() in child");
	}
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.show(); 
		
		Parent p = new Parent();
		
		p=obj;
		p.show();
		
	}
}
 