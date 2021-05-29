package lab5;

import java.util.Scanner;

public class UserThread2 extends Thread implements CommonFunction {
BankAccount bankAcc;
Scanner sc = new Scanner(System.in);

	public UserThread2(BankAccount bankAcc) {
		this.bankAcc=bankAcc;
	}
	
	@Override
	synchronized public void menu() {
		// TODO Auto-generated method stub
		try {
			
			System.out.println(Thread.currentThread().getName()+":\nSelect an option as number:\n1.Withdrawal");
			int ch = sc.nextInt();
			switch(ch) {
		 	case 1:
				bankAcc.withdraw(20000);
				break;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public void run() {
		menu();
	}
}

