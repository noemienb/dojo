package co.jallain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Unit test for simple App.
 */
class LeapTest {
	/**
	 * Rigorous Test.
	 */
	@Test
	void checkFalse() {
		assertFalse(LeapYears.check(2014));
	}

	@Test
	void checkTrue2020() {
		assertTrue(LeapYears.check(2020));
	}

	@Test
	void checkTrue2000() {
		assertTrue(LeapYears.check(2000));
	}
}
