package assignment_2;

public class Transaction {
	private Display display;
	private long transactionPrice = 5000;
	public Transaction(Display display) {
		this.display = display;
	}
	private long getTransactionPrice() {
		return transactionPrice;
	}
	public void scanAmount() {
		String line = "Your amount" + getTransactionPrice() +"is transacted successfully";
		display.displayTransaction(getTransactionPrice(), line );
	}
}
