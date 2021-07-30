package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDmo {
	
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add(new Integer(10));
		set.add(new Float(20.5));
		set .add("Hello");
		set.add("Hi");
		set.add(30.5);
		set.add(50);
		set.add(new Integer(10));
		set.add(new Float(20.5));
		set .add("Hello");
		set.add(101);
		set.add(new Employee(101,"Feri", 9000));
		set.add(new Employee(102,"LAcii", 9000));
		set.add(new Employee(101,"Feri", 9000));
		set.add(new Employee(102,"LAcii", 9000));
		set.add(101);
		System.out.println(set.size());
		
		Iterator it =set.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());	
		}
		System.out.println(set.contains(20.5));
		
		System.out.println("After remove Hello");
		set.remove("Hello");
		it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());	
		}
	}
}
