package lab5;

public class Worker2 extends Thread {
	Printer p;
	public Worker2(Printer p) {
		this.p=p;
	}
	public void run() {
		p.calculatePages();
	}
}
