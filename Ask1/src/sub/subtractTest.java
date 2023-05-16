package sub;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class subtractTest {

	@Test
	void testSubtractTwoIntegers() {
		subtract tester = new subtract();
		assertEquals("POSITIVE", tester.subtractTwoIntegers(5, 2), "5 - 2 must be POSITIVE");
		assertEquals("NEGATIVE", tester.subtractTwoIntegers(5, 10), "5 - 10 must be NEGATIVE");
	}

}
