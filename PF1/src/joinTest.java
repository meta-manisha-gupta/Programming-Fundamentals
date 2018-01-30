import static org.junit.Assert.*;

import org.junit.Test;


public class joinTest {
	join joinArr = new join();
	
	@Test
	public void test1() {
		int a[] = {4,8,9,12,31};
		int b[] = {1,2,3,5,6,7,10};
		int expected[] = {1,2,3,4,5,6,7,8,9,10,12,31};
		int asize = a.length;
		int bsize = b.length;
		int c[] = new int[asize+bsize];
		assertArrayEquals(expected,joinArr.join(a, asize, b, bsize, c));
	}
	

}
