package multithreading;

public class SetterThread implements Runnable {

	private SharedResource resource;
	
	
	public SetterThread(SharedResource resource) {
		super();
		this.resource = resource;
	}


	public void run() {
		for (int i =1; i<=10 ; i++) {
			try {
				resource.setNumber(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
