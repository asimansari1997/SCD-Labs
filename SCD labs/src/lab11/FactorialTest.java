package lab11;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		Lab11 obj=new Lab11();
		int output=obj.calculateFactorial(5);
		assertEquals(120, output);
	}

}
