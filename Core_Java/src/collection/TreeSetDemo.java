//package collection;
//
//import java.util.Iterator;
//import java.util.TreeSet;
//
//public class TreeSetDemo {
//
//	public static void main(String[] args) {
//		
//		TreeSet<Integer> set = new TreeSet<Integer>();
//		set.add(10);
//		set.add(50);
//		set.add(209);
//		set.add(20);
//		
//		System.out.println(set);
//		TreeSet<String> set1 = new TreeSet<String>();
//		set1.add("HEllo");
//		set1.add("apple");
//		
//		TreeSet<Product> set2 = new TreeSet<Product>(new ProductComparator());
//		set2.add(new Product(101,"Laptop",9888));
//		set2.add(new Product(103,"Mobile",9888));
//		set2.add(new Product(102,"Book",698));
//		set2.add(new Product(105,"Tablet",6988));
//		set2.add(new Product(107,"Micro",69888));
//		set2.add(new Product(1061,"Table",697888));
//		
//		Iterator<Product> it = set2.iterator();
//		
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
//		
//		TreeSet<Product> set3 = new TreeSet<>();
//		set3.add(new Product(101,"Laptop",9888));
//		set3.add(new Product(103,"Mobile",9888));
//		set3.add(new Product(102,"Book",698));
//		set3.add(new Product(105,"Tablet",6988));
//		set3.add(new Product(107,"Micro",69888));
//		set3.add(new Product(1061,"Table",697888));
//		
//		Iterator<Product> it1 = set2.iterator();
//		
//		while(it1.hasNext()){
//			System.out.println(it1.next());
//		}
//	}
//}
