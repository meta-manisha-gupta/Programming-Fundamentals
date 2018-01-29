import static org.junit.Assert.*;

import org.junit.Test;


public class binarySearchTest {

	binarySearch bs = new binarySearch();
	@Test
	public void test1() {
		int a[] = {2, 5, 8, 9, 10, 77, 55, 11};
		int expected = 1;
		int returndValue = bs.search(a, 0, a.length-1, 77);
		assertEquals(expected,returndValue);
	}
	@Test
	public void test2() {
		int a[] = {2, 5, 8, 9, 10, 77, 55};
		int expected = -1;
		int returndValue = bs.search(a, 0, a.length-1, 88);
		assertEquals(expected,returndValue);
	}

}
