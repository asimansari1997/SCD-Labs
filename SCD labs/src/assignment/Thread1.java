package assignment;

public class Thread1 extends Thread {
	private int num,fact=1,temp;
	public Thread1(int num){
		this.num = num;
	}
	public void findFactorial() {
//		synchronized(this) {
			for(int i=num ; i>=1 ; i--) {
				temp = fact;
				fact = fact*i;
				if(temp!=1) {
					System.out.println(temp+"x"+i+"="+fact);
				}
			}
//		}
		}
	public void run() {
		findFactorial();
	}
}


