package lab10;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		JUnitTesting obj=new JUnitTesting();
		int output=obj.square(2);
		assertEquals(4, output);

	}

}
