package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		
		Vector vector = new Vector();
		
		vector.addElement(new Integer(10));
		vector.addElement(new Float(20.5));
		vector.addElement(10);
		vector.addElement("Hello");
		vector.addElement("Hello");
		vector.addElement(30.5);
		vector.addElement("Hi");
		
		Enumeration em = vector.elements();
		
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		
		
	}
	
	
}
