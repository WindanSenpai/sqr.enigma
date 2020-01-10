package enigma;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotorTest {

	@Test
	public void test() {
		testAdvance();
	}
	@Test
	public void testAdvance() {
		int[] cipher = new int[26];
		for (int i = 0; i< 26; i++){
			cipher[i] = i+1;
		}
		Rotor rotorTest = new Rotor(cipher, -1);
		int old_value = rotorTest.getPosition();
		rotorTest.advance();
		assertEquals(old_value, rotorTest.getPosition()-1);
	}

}
