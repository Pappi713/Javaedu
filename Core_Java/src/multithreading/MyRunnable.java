package multithreading;

public class MyRunnable implements Runnable {

	
	public void run() {
		for(int i =1; i<11; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
