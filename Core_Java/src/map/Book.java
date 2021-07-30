package map;

public class Book implements Comparable<Book> {

		private int id;
		private String name;
		private float price;
		
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public float getPrice() {
			return price;
		}
		public Book(int id, String name, float price) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}
		@Override
		public String toString() {
			return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
		}	
		
		public int  compareTo(Book b ) {
			return this.id -b.id;
		}
}
