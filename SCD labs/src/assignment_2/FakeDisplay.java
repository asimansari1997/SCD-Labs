package assignment_2;

public class FakeDisplay implements Display {
	long amount;
	@Override
	public void displayTransaction(long amount, String line) {
		// TODO Auto-generated method stub
		this.amount = amount;
	}
	
	public long getTransaction() {
		return amount;
	}
}
