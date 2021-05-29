package lab11;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class OddTest {

	@Test
	void test() {
		Lab11 obj=new Lab11();
		boolean output=obj.isOdd(5);
		assertEquals(true, output);
	}

}
