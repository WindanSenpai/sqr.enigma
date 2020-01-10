package enigma;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReflectorTest {

	@Test
	public void test() {
		forwardTest();
	}
	
	@Test
	public void forwardTest()
	{
		int[] cipher = new int[26];
		for (int i = 0; i< 26; i++){
			cipher[i] = i;
		}
		Reflector refTest = new Reflector(cipher);
		int testHead = refTest.convertForward(25);
		assertEquals(testHead, 25);
	}

}
