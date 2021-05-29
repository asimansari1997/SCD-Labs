package lab5;

public class Worker1 extends Thread {
	Printer p;
	public Worker1(Printer p) {
		this.p=p;
	}
	public void run() {
		p.printPages(15);
	}
}
