package pack1;

public class Product {
	private int pid;
	private String pname;
	private float price;
	
	public Product(){
		System.out.println("Product Default constructor");
	}

	public Product(int pid, String pname, float price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		System.out.println("Product Parametrized constructor");
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
