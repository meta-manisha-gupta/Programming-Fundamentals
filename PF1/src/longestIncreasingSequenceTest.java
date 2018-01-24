import static org.junit.Assert.*;

import org.junit.Test;


public class longestIncreasingSequenceTest {
	longestIncreasingSequence LIC = new longestIncreasingSequence();

	@Test
	public void test1() {
		int inputArray[] = {1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		int outputArray[] = {1,2,4,5,6,7,8,9};
		assertArrayEquals(outputArray, LIC.longestSequence(inputArray));
		
	}
	
	@Test
	public void test2() {
		int inputArray[] = {5,9,13,15,6,10,12,20,2,8};
		int outputArray[] = {6,10,12,20};
		assertArrayEquals(outputArray, LIC.longestSequence(inputArray));
		
	}

}
