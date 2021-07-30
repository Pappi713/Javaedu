//package collection;
//
//public class Product implements Comparable<Product> {
//	
//	private int pid;
//	private String pname;
//	private float price;
//	
//	public Product(int pid, String pname, float price) {
//		super();
//		this.pid = pid;
//		this.pname = pname;
//		this.price = price;
//	}
//
//	public int getPid() {
//		return pid;
//	}
//
//	public String getPname() {
//		return pname;
//	}
//
//	public float getPrice() {
//		return price;
//	}
//
//	@Override
//	public String toString() {
//		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
//	}
//
//	@Override
//	public int compareTo(Product o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	
////	@Override
////	public int compareTo(Object obj) {
////		if(obj instanceof Product) {
////			Product p = (Product) obj;
////			if(this.pid ==p.pid) {
////			return 1;
////			}
////			else if(this.pid < p.pid) {
////				return -1;
////			}
////		}
////		return 0;
////		
////	}
//	
////	public int compareTo(Product p) {
////		if(this.pid ==p.pid) {
////			return 1;
////			}
////			else if(this.pid < p.pid) {
////				return -1;
////			}
//	
//		return this.pname.compareTo(p.name);
//	}
//	
//
//}
