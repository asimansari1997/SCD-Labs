package lab11;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class EvenTest {

	@Test
	void test() {
		Lab11 obj=new Lab11();
		boolean output=obj.isEven(5);
		assertEquals(false, output);
	}
}
