import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class TowerOfHanoiTest {
	TowerOfHanoi tower = new TowerOfHanoi();
	@Test
	public void testImplementTowerOfHanoiForOneDisk() {
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Move Disk 1 from A to B");
		ArrayList<String> resultantOutput = new ArrayList<String>();
		
		resultantOutput = tower.implementTowerOfHanoi("A", "B", "C", 1);
		assertEquals(expected, resultantOutput);
		
	}
	
	@Test
	public void testImplementTowerOfHanoiForTwoDisk() {
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Move Disk 1 from A to C");
		expected.add("Move Disk 2 from A to B");
		expected.add("Move Disk 1 from C to B");
		ArrayList<String> resultantOutput = new ArrayList<String>();
		
		resultantOutput = tower.implementTowerOfHanoi("A", "B", "C", 2);
		assertEquals(expected, resultantOutput);
		
	}
	
	@Test
	public void testImplementTowerOfHanoiForThreeDisk() {
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Move Disk 1 from A to B");
		expected.add("Move Disk 2 from A to C");
		expected.add("Move Disk 1 from B to C");
		expected.add("Move Disk 3 from A to B");
		expected.add("Move Disk 1 from C to A");
		expected.add("Move Disk 2 from C to B");
		expected.add("Move Disk 1 from A to B");
		ArrayList<String> resultantOutput = new ArrayList<String>();
		
		resultantOutput = tower.implementTowerOfHanoi("A", "B", "C", 3);
		assertEquals(expected, resultantOutput);
		
	}


}
