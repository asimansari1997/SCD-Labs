package lab3;

public class Main {

	public static void main(String[] args) {
		try {
			
			Thread1 t1 = new Thread1(10,10);
			Thread2 t2 = new Thread2(5,10);
			t1.start();
			Thread.sleep(500);
			t2.start();
		}
		catch(InterruptedException e ) {
			System.out.println("Exception: "+e);
		}
		}
}
