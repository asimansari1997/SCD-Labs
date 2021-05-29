package lab10;

import static org.junit.Assert.*;

import org.junit.Test;

public class countATest {

	@Test
	public void test() {
		JUnitTesting obj=new JUnitTesting();
		int output=obj.countA("Muhammad Zeeshan");
		assertEquals(3, output);
	}

}
