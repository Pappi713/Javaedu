package multithreading;

public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}
	
	public MyThread() {
	
	}
	
	public void run() {
		for(int i =1; i<11; i++) {
			System.out.println(getName() + " : " + i); 
		}
	}
	
}
