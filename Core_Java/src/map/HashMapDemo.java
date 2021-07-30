package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
public static void main(String[] args) {
	
	
	HashMap<Integer, String> map1 = new HashMap<>();
	map1.put(10,  "Hello");
	map1.put(20,  "Hi");
	map1.put(30,  "Welcome");
	map1.put(40,  "Map Demo");
	map1.put(10,  "Bye");
	map1.put(50, "Hi");
	
	Set<Integer> keySet =map1.keySet();
	
	Iterator <Integer> it = keySet.iterator();
	
	while(it.hasNext()) {
		Integer key = it.next();
		System.out.println(key + "   " +map1.get(key));
	}
	
	
	HashMap<Student, String> map2 = new HashMap<>();
	map2.put(new Student(101,"FEri",99.99f), "Good");
	map2.put(new Student(102,"KLaci",59.99f), "BAd");
	map2.put(new Student(103,"Adam",3.99f), "Sad");
	map2.put(new Student(101,"FEri",99.99f), "Mood");
	map2.put(new Student(102,"KLaci",59.99f), "Kaad");
	
	Set<Student> keySet1 =map2.keySet();
	
	Iterator <Student> it1 = keySet1.iterator();
	System.out.println("-----------------------------------------------------");
	while(it1.hasNext()) {
		Student key = it1.next();
		System.out.println(key + "   m" +map2.get(key));
	}
}
}
