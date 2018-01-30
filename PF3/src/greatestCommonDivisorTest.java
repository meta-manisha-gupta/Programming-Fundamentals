import static org.junit.Assert.*;

import org.junit.Test;


public class greatestCommonDivisorTest {
	greatestCommonDivisor find = new greatestCommonDivisor();
	@Test
	public void test1() {
		int expected = 6;
		assertEquals(expected,find.gcd(12, 18));
	}
	
	@Test
	public void test2() {
		int expected = 1;
		assertEquals(expected,find.gcd(2, 1));
	}
	
	@Test
	public void test3() {
		int expected = 1;
		assertEquals(expected,find.gcd(100, 3));
	}

}
