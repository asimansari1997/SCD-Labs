package lab11;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PrimeTest {

	@Test
	void test() {
		Lab11 obj=new Lab11();
		boolean output=obj.isPrime(29);
		assertEquals(true, output);
	}

}
