package lab9;
import java.util.*;
public class MainMenu {
	private Accounts acc;
	private Scanner sc = new Scanner(System.in);
	private BillPayment bp = new BillPayment();
	private Loan loan = new Loan();
	public MainMenu(Accounts acc) {
		this.acc = acc;
		bp.setBillAmount("5500");
		bp.setBillType("Electricity Bill");
		bp.setBillAmount("500");
		bp.setBillType("Gass Bill");
		bp.setBillAmount("400");
		bp.setBillType("Water Bill");
		bp.addBillPayments();
		loan.addLoan(55000,"Zeeshan");
		loan.addLoan(65000,"Asim");
		loan.addLoan(35000,"Ayesha");
		loan.addLoan(5500,"Osama");

	}
	public void displayUserMainMenu() {
		System.out.println("\nselect one of these:\n1. Recieve Bill Payments\n"
				+ "\2. Clear dues\n3. View account details\n"
				+ "4.Expired loan Taker\n");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			bp.recieveBillPayments();
			displayUserMainMenu();
			break;
		case 2:
			bp.clearAllDues();
			displayUserMainMenu();
			break;
		case 3:
			acc.viewAccountDetails();
			displayUserMainMenu();
			break;
		case 4:
			loan.displayLoan();
			displayUserMainMenu();
			break;
		}
	}
}
