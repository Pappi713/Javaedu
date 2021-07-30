package tasks;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(1,1);
		Rectangle r3 = new Rectangle(2,3);
		Rectangle r4 = new Rectangle(5,1);
		Rectangle r5 = new Rectangle(6,2);
		
		r1.rectangeInfo();
		r2.rectangeInfo();
		r3.rectangeInfo();
		r4.rectangeInfo();
		r5.rectangeInfo();
	}
}
