package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	
	public static void main(String[] args) {
		
		LinkedHashSet set = new LinkedHashSet();
		
		set.add(new String ("HEllo"));
		set.add(10);
		set.add(20.5);
		set.add(50.0f);
		set .add("Hello");
		set.add(101);
		set.add(new Employee(101,"Feri", 9000));
		set.add(new Employee(102,"LAcii", 9000));
		set.add(new Employee(101,"Feri", 9000));
		set.add(new Employee(102,"LAcii", 9000));
		set.add(101);
		
		System.out.println(set);
		
	}
}
