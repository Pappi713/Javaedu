package multithreading;

public class PrinterMain {
	
	public static void main(String[] args) {
		
		Printer printer = new Printer();
		
		PrinterThread runnable1 = new PrinterThread("Hello", printer);
		PrinterThread runnable2 = new PrinterThread("Hi", printer);
		PrinterThread runnable3 = new PrinterThread("Welcome", printer);
		
		Thread t1 = new Thread(runnable1);
		Thread t2 = new Thread(runnable2);
		Thread t3 = new Thread(runnable3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
