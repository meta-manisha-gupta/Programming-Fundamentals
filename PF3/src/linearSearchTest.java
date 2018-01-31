import static org.junit.Assert.*;

import org.junit.Test;


public class linearSearchTest {

	linearSearch ls = new linearSearch();
	@Test
	public void test1() {
		int a[] = {2,5,8,9,10, 77, 55, 11};
		int expected = 1;
		int returndValue = ls.search(a, 77, 0);
		assertEquals(expected,returndValue);
	}
	@Test
	public void test2() {
		int a[] = {2,5,8,9,10, 77, 55};
		int expected = -1;
		int returndValue = ls.search(a, 88, 0);
		assertEquals(expected,returndValue);
	}

}
