package lab3;

public class Thread1 extends Thread {
	int num, limit,i;
	
	
	public Thread1(int num, int limit) {
		this.num = num;
		this.limit = limit;
	}
	public void run() {
		System.out.println("==Table of "+num+"==");
		for(i=1 ; i<=limit ; i++) {
			System.out.println(num+"x"+i+"= "+(num*i));
		}
	}
	
}
