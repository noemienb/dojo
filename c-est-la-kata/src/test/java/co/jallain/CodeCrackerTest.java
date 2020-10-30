package co.jallain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeCrackerTest {

	@Test
	void manipulerMot() {
		assertEquals("bebek", CodeCracker.manipulerMot(")£)£@", true));
		assertEquals("\"dj>aa£", CodeCracker.manipulerMot("couille", false));
	}

}
