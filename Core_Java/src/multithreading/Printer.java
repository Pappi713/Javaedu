package multithreading;

public class Printer {
	
	 public void print(String msg) throws InterruptedException {
		 synchronized (this) {
			System.out.print("[ " + msg);
		Thread.sleep(600);
		System.out.println(" ]");
		}
		
	}
}
