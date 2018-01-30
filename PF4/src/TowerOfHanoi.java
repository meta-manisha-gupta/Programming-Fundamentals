import java.util.ArrayList;
/**
 * 
 * Class name-TowerOfHanoi
 * 
 * version 1.0
 * @author Manisha Gupta
 *
 */

public class TowerOfHanoi {
	ArrayList<String> discs = new ArrayList<String>();
	/**
	 * This function consist of three Rods or Towers with n disks placed one over the other.
	 * The function follows the following rules:
	 * 1. Only one disk can be moved at a time.
	 * 2. No disk can be placed on top of the smaller disk.
	 * 
	 * 1. Move the top n - 1 disks to auxiliary Rod.
	 * 2. Move the n-1 disks from auxiliary Rod to destination Rod.
	 * 3. If numOfDisks = 1, move it from initial Rod to the destination Rod.
	 * @param sourceRod - for fromRod
	 * @param destinationRod -for toRod
	 * @param auxiliaryRod -for secondaryRod
	 * @param numOfDisks -total number of disks
	 * @return -returns the movement of disks.
	 */
	
	public ArrayList<String> implementTowerOfHanoi(String sourceRod, String destinationRod, String auxiliaryRod, int numOfDisks){
		
		if(numOfDisks == 1){							
			String solution1 = "Move Disk " + numOfDisks + " from " + sourceRod + " to " + destinationRod;
			discs.add(solution1);
			return discs;
		}
		
		
		implementTowerOfHanoi(sourceRod, auxiliaryRod, destinationRod, numOfDisks - 1);
		String solution2 = "Move Disk " + numOfDisks + " from " + sourceRod + " to " + destinationRod;
		discs.add(solution2);
		
		
		return implementTowerOfHanoi(auxiliaryRod, destinationRod, sourceRod, numOfDisks - 1);
	}
}
