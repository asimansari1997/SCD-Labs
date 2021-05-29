package assignment;

public class Thread2 extends Thread{
	private int num;
	public Thread2(int num){
		this.num = num;
	}
	public void calcPower() {
		for(int i=1 ; i<=num ; i++ ) {
			System.out.println(num+"^"+i+"= "+Math.pow(num,i));
		}
	}
	public void run() {
		calcPower();
	}
}

