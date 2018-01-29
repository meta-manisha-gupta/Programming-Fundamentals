import static org.junit.Assert.*;

import org.junit.Test;


public class remainderTest {
	remainder find = new remainder();
	@Test
	public void test1() {
		int expected = 0;
		assertEquals(expected,find.rem(2, 1));
	}
	
	@Test
	public void test2() {
		int expected = 1;
		assertEquals(expected,find.rem(100, 3));
	}
	
	@Test
	public void test3() {
		int expected = 2;
		assertEquals(expected,find.rem(2, 0));
	}

}
