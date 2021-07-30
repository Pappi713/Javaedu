package tasks;

public class Rectangle {
	
	private int length;
	private int breadth;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public Rectangle() {
		
	}
	
	public Rectangle(int lenght, int breadth) {
		this.breadth = breadth;
		this.length = lenght;
	}
	
	public int area() {
		return (this.length * this.breadth);
	}
	
	public void rectangeInfo() {
		System.out.println("-----------------------------------------------");
		System.out.println("The lenght of the Rectangle is: " + this.length);
		System.out.println("The breadth of the Rectangle is: " + this.breadth);
		System.out.println("The area of the Rectangle is: " + this.area());
		System.out.println("-----------------------------------------------");
	}

}
