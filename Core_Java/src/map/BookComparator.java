package map;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

	public int compare(Book b1, Book b2) {
		return b1.getName().compareTo(b2.getName());
	}
}
