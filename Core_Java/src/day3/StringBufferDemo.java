package day3;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		sb1.append("Hi");
		sb1.substring(0,5);
		
		boolean status = sb2.equals("Hello");
		System.out.println(status);
	}
}
