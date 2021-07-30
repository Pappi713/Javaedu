package day3;

public class ChildAbstract extends AbstractDemo {
	
	void show() {
		System.out.println("Show() method is Child AbstractDemo");
	}
	
	void print(String str) {
		System.out.println("Print() method in child" + str);
	}
}
