package lab6;

public class ThreadDemo1 extends Thread{
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	public static Object Lock3 = new Object();

	public void run() {
		synchronized (Lock1) {
		System.out.println("Thread 1: Holding lock 1...");

		try { Thread.sleep(10); }
		catch (InterruptedException e) {}
		System.out.println("Thread 1: Waiting for lock 2 and lock 3...");
		
		synchronized (Lock2) {
		System.out.println("Thread 1: Holding lock 1 & 2...");
		}
		synchronized (Lock3) {
		System.out.println("Thread 1: Holding lock 1 & 3...");
		}
		}
		}
}
