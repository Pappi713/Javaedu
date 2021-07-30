package pack1;

public class ProductTest {
	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setPid(101);
		product1.setPname("Laptop");
		product1.setPrice(9000);
		
		Product product2 = new Product(102,"Mobile",8000);
		
	}
}
