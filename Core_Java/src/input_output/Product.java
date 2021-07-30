package input_output;

import java.io.Serializable;

public class Product implements Serializable {
	private int pid;
	private String pname;
	private float price;
	
	
	public Product(int pid, String pname, float price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
}
