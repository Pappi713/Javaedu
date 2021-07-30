package tasks4;

import multithreading.MyThread;

public class TaskTwoMain {

	public static void main(String[] args) {
		MyThreadTasks myThread1 = new MyThreadTasks(args[0]);
		MyThreadTasks myThread2 = new MyThreadTasks(args[1]);
		MyThreadTasks myThread3 = new MyThreadTasks(args[2]);
		MyThreadTasks myThread4 = new MyThreadTasks(args[3]);
		
		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();		
	}
	
}
