package lab5;

public class TestPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer obj = new Printer();
		Worker1 w1 = new Worker1(obj);
		Worker2 w2 = new Worker2(obj);
		w1.start();
		w2.start();
	}

}


