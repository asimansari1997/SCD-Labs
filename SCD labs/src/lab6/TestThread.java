package lab6;

public class TestThread {

	public static void main(String[] args) {
		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		ThreadDemo3 T3 = new ThreadDemo3();
		 T1.start();
		 T2.start();
		 T3.start();

	}
}


