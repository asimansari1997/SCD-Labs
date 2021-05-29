package lab5;


class Customer{
int amount=10000;

synchronized void withdraw(int amount){
System.out.println("going to withdraw...");

if(this.amount<amount){
System.out.println("Less balance; waiting for deposit...");
try{wait();}catch(Exception e){}
}
this.amount-=amount;
System.out.println("withdraw completed...");
}

synchronized void deposit(int amount){
System.out.println("going to deposit...");
this.amount+=amount;
System.out.println("deposit completed... ");
notify();
}
}
class Threadd1 extends Thread
{
Customer c=new Customer();
public void run()
{
c.withdraw(15000);
}
}
class Threadd2 extends Thread
{
Customer c=new Customer();
public void run()
{
c.deposit(10000);
}
}

public class Use {

	public static void main(String[] args) {
		Threadd1 t1=new Threadd1();
		Threadd2 t2=new Threadd2();
		t1.start();
		t2.start();
	}

}
