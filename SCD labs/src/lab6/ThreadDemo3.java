package lab6;

public class ThreadDemo3 extends Thread {
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	public static Object Lock3 = new Object();
	public void run() {
		synchronized (Lock3) {
		System.out.println("Thread 3: Holding lock 3...");

		try { Thread.sleep(10); }
		catch (InterruptedException e) {}
		System.out.println("Thread 3: Waiting for lock 1 and lock 2...");

		synchronized (Lock2) {
		System.out.println("Thread 3: Holding lock 3 & 2...");
	}
		synchronized (Lock1) {
			System.out.println("Thread 3: Holding lock 3 & 1...");
		}  }  }  }


