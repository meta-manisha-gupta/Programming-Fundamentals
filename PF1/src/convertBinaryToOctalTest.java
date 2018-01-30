import static org.junit.Assert.*;

import org.junit.Test;


public class convertBinaryToOctalTest {
	
		convertBinaryToOctal binToOct = new convertBinaryToOctal();
	@Test
	public void test1() {
		
		assertEquals(372,binToOct.convertBinToOct(11111010));
		
	}
	
	@Test
	public void test2(){
		
		assertEquals(45,binToOct.convertBinToOct(100110));
		
	}
	

}
