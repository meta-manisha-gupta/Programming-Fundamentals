import static org.junit.Assert.*;

import org.junit.Test;


public class sortedArrayTest {
	sortedArray checkSortOrder = new sortedArray();

	@Test
	public void test1() {
		int inputArray[] = {1,4,6,8,9};
		assertEquals(1,checkSortOrder.checkSortedOrder(inputArray));
	}
	
	@Test
	public void test2() {
		int inputArray[] = {122,100,99,65,56,45,43,30};
		assertEquals(2,checkSortOrder.checkSortedOrder(inputArray));
	}
	@Test
	public void test3() {
		int inputArray[] = {1,4,6,8,100,45,99,76,87,102};
		assertEquals(0,checkSortOrder.checkSortedOrder(inputArray));
	}
	@Test
	public void test4() {
		int inputArray[] = {1,1,1,1,1};
		assertEquals(0,checkSortOrder.checkSortedOrder(inputArray));
	}
}
