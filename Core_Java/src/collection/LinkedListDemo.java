package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add(new Integer(10));
		list.add(new Float(20.5));
		list.add(50);
		list.add(new String("Hello"));
		list.add("Hi");
		list.add(10);
		list.add(50);
		list.add(new String("Hello"));
		list.add("Hi");
		list.add(new Float(20.5));
		list.add(2,"Welcome");
		
		list.get(3);
		for(int i =0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Checking for String HEllo" + list.contains("Hello :"));
		
		Object firstObject =list.peekFirst();
		System.out.println(firstObject);
	}
}
