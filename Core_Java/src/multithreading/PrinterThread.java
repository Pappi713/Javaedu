package multithreading;

public class PrinterThread implements Runnable {

	private String msg;
	private Printer printer;
	
	public PrinterThread(String msg, Printer printer) {
		super();
		this.msg = msg;
		this.printer = printer;
	}
	public void run() {
		try {
			printer.print(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
