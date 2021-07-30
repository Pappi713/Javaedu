package multithreading;

public class MyRunnableMain {
	
	public static void main(String[] args) {
		
		MyRunnable runnable1 = new MyRunnable();
		Thread t1 = new Thread(runnable1);
		t1.setName("MyRunnable_1");
		t1.start();
		
		for(int i =1; i<11; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i); 
		}
		
		Thread t2 = new Thread(runnable1, "MyRunnable_2");
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("End of main");
		
		
	}
	
}
