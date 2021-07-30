package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class CollectionsDemo {
public static void main(String[] args) {
	
	List<String> list  = new ArrayList<>();
	list.add("Welcome");
	list.add("Bye");
	list.add("Hi");
	list.add("Asd");
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
	

	
}
}
