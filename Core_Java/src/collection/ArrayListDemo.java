package collection;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
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
		
		list.add(new Employee(101,"Feri", 9000));
		
		list.get(3);
		for(int i =0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Checking for String HEllo" + list.contains("Hello"));
		
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(20);
		list1.add(new Integer("50"));
		System.out.println(list1);
	}
}
