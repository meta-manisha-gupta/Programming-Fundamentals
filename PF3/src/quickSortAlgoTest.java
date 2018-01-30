import static org.junit.Assert.*;

import org.junit.Test;


public class quickSortAlgoTest 
{
	quickSortAlgo qs = new quickSortAlgo();

	@Test
	public void test() 
	{
		int expected[] = new int[]{2,5,8,9,10,11,55,77};
		int input[] = new int[]{2,5,8,9,10, 77, 55, 11};
		int m = input.length -1;
		int resultantOutput[] = qs.quickSort(input,0,m);
		
		assertArrayEquals(expected, resultantOutput);
	}

}
