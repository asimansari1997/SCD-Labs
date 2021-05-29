package lab5;

import java.util.Scanner;

public class BankAccount {
	int amount = 50000;
	Scanner sc = new Scanner(System.in);
	synchronized void withdraw(int amount) {
		System.out.println("withdrawing "+amount+"...");
		if(this.amount<amount) {
			System.out.println("\n==Withdrawal Failed==\nYour Bank balance is not enough");
			try {
				wait();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		this.amount-=amount;
		System.out.println("\n==Withdrawal Completed==\nWithdrawal amount: "+amount+"\nCurrent Balance: "+this.amount+"\n");
	}
	}



