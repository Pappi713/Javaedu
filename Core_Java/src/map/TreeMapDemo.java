package map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
	
		
		TreeMap<String,Integer> map1 = new TreeMap<>();
		
		map1.put("Hello",1);
		map1.put("Hi",2);
		map1.put("Welcome",3);
		map1.put("Bye",4);
		map1.put("End",5);
		
		System.out.println(map1);
		
		
		TreeMap<Book,String> map2 = new TreeMap<>();
		map2.put(new Book(101,"Hello",90001),"HEllo");
		map2.put(new Book(102,"Hi",90010),"Hi");
		map2.put(new Book(103,"End",90100),"End");
		map2.put(new Book(104,"Bye",91000),"Bye");
		map2.put(new Book(104,"Bye",91000),"Bye");
		
		Set<Book> keys = map2.keySet();
		Iterator<Book> it = keys.iterator();
		
		while(it.hasNext()) {
			Book b = it.next();
			System.out.println(b+"    " +map2.get(b));
		}
		System.out.println("----------------------------------------------");
		
		
		TreeMap<Book,String> map3 = new TreeMap<>(new BookComparator());
		map3.put(new Book(101,"Hello",90001),"HEllo");
		map3.put(new Book(102,"Hi",90010),"Hi");
		map3.put(new Book(103,"End",90100),"End");
		map3.put(new Book(104,"Bye",91000),"Bye");
		map3.put(new Book(104,"Bye",91000),"Bye");
		
		keys = map3.keySet();
		it = keys.iterator();
		
		while(it.hasNext()) {
			Book b = it.next();
			System.out.println(b+"    " +map3.get(b));
		}
	}
}
