import static org.junit.Assert.*;

import org.junit.Test;


public class removeDuplicateTest {
	
		removeDuplicate removeDup = new removeDuplicate();
	@Test
	public void test1() {
		int inputArray[] = {2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		int outputArray[] = {2,5,4,6,3,8,9,0};
		assertArrayEquals(outputArray, removeDup.removeDuplicate(inputArray));
	}
	
	@Test
	public void test2(){
		int inputArray[] = {2,2};
		int outputArray[] = {2};
		assertArrayEquals(outputArray, removeDup.removeDuplicate(inputArray));
	}
	
	@Test
	public void test3(){
		int inputArray[] = {1};
		int outputArray[] = {1};
		assertArrayEquals(outputArray, removeDup.removeDuplicate(inputArray));


	}

}
