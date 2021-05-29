package assignment;

public class MainThread {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1(1);
		Thread2 t2 = new Thread2(1);
		t1.start();
		t2.start();
	}
}


