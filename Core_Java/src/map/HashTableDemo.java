package map;

import java.util.Hashtable;

public class HashTableDemo {
public static void main(String[] args) {
	
	Hashtable<String, Integer > table1 = new Hashtable<>();
	table1.put("Hello", 50);
	table1.put("Hi", 40);
	table1.put("Welcome", 10);
	table1.put("End", 20);
	System.out.println(table1);
}
}
