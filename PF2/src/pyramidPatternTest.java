import static org.junit.Assert.*;

import org.junit.Test;


public class pyramidPatternTest {
	pyramidPattern printPattern = new pyramidPattern();
	@Test
	public void test1() {
		int n = 5;
		String expected[] = {"    1    ",
				             "   121   ",
				             "  12321  ",
				             " 1234321 ",
				             "123454321",
				             " 1234321 ",
				             "  12321  ",
				             "   121   ",
				             "    1    "};
		String actual[] = printPattern.printPyramid(n);
		
		assertArrayEquals(expected,actual);
		
	}
	@Test
	public void test2() {
		String expected = "  ";
		String actual = printPattern.spaces(3,5);
		
		assertEquals(expected,actual);
	}

	@Test
	public void test3() {
		String expected = "1234321";
		String actual = printPattern.numbers(4,5);
		
		assertEquals(expected,actual);
	}
}
