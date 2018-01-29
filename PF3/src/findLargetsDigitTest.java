import static org.junit.Assert.*;

import org.junit.Test;


public class findLargetsDigitTest {
	findLargestDigit find = new findLargestDigit();
	@Test
	public void test1() {
		int expected = 2;
		int returnedValue = find.largestDigit(2);
		assertEquals(expected, returnedValue);
	}
	
	@Test
	public void test2() {
		int expected = 9;
		int returnedValue = find.largestDigit(1257639);
		assertEquals(expected, returnedValue);
	}
	
	@Test
	public void test3() {
		int expected = 4;
		int returnedValue = find.largestDigit(444);
		assertEquals(expected, returnedValue);
	}

}
