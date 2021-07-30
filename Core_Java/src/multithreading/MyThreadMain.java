package multithreading;

public class MyThreadMain {

	public static void main(String[] args) {
		MyThread myThread1 = new MyThread();
		myThread1.setName("MyThread_1");
		myThread1.start();
		
		for(int i =1; i<11; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i); 
		}
		MyThread myThread2 = new MyThread("MyThread_2");
		myThread2.start();
		
		
		try {
			myThread1.join();
			myThread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("End of main Tread");
	}
	
}
