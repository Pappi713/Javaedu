package day3;

public abstract class AbstractDemo {
	
	 abstract void show();
	 
	 void display() {
		 System.out.println("Display() in AbstractDemo;");
	 }
	 
	 public static void main(String[] args) {
		 AbstractDemo obj = new ChildAbstract();
		 obj.show();
		 obj.display();
	}
}
