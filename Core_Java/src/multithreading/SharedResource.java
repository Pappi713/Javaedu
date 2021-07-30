package multithreading;

public class SharedResource {
	
	private int number;
	private boolean status;
	
	
	

	public synchronized void setNumber(int number) throws InterruptedException {
		if(status==true) {
			wait();
		}
		this.number = number;
		System.out.println("Set : " + number);
		notify();
		status = true;
	}

	synchronized public int getNumber() throws InterruptedException {
		if(status ==false) {
			wait();
		}
		System.out.println("Ge t : " + number);
		notify();
		status =false;
		return number;
	}

	
}
