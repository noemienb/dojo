package co.jallain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
	/**
	 * Rigorous Test.
	 */
	@Test
	void test3() {
		assertEquals("FooFoo", App.FooBarQix("3"));
	}

	@Test
	void test33() {
		assertEquals("FooFoo", App.getHasChiffreString("33"));

	}

	@Test
	void test555() {
		assertEquals("BarBarBar", App.getHasChiffreString("555"));

	}

	@Test
	void test375() {
		assertEquals("FooQixBar", App.getHasChiffreString("375"));

	}

	@Test
	void testAll375() {
		assertEquals("FooBarFooQixBar", App.FooBarQix("375"));
	}

	@Test
	void multiple8() {
		assertEquals("", App.getMultipleString("8"));

	}

	@Test
	void testAll() {
		assertEquals("8", App.FooBarQix("8"));

	}

	@Test
	void testAllgrgergr() {
		assertEquals("*", App.FooBarQix("0"));

	}
}
