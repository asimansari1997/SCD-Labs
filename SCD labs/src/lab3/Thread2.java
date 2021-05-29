package lab3;

public class Thread2 extends Thread{
int num, limit,i;
	
	
	public Thread2(int num, int limit) {
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
