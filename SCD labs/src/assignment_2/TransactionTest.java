package assignment_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TransactionTest {

	@Test
	void test() {
		FakeDisplay fakeDisplay = new FakeDisplay();
		Transaction transaction = new Transaction(fakeDisplay);
		transaction.scanAmount();
		assertEquals(5000, fakeDisplay.getTransaction());
	}

}
