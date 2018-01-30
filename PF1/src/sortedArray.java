/**
 * Class name-sortedArray
 *
 *@version 1.0
 *author Manisha Gupta
 */
 
 /*
  * A class to check given array is sorted order or not.  
  */
public class sortedArray {
	/*
	 * Below function checks the sorting order of given array.
	 * It returns 1 if array is in asscending order,
	 * 2 if array is in descending order and
	 * 0 if array is unsorted.
	*/
	public int checkSortedOrder(int input[]){
		int count1 = 1, count2 = 1;
		for(int counter = 1; counter < input.length; counter++){
			if(input[counter] > input[counter-1]){			//checks for asscending order
				count1++;
			}
			else if(input[counter] < input[counter-1]){		//checks for descending order
				count2++;
			}
		}
		if(count1 == input.length){
			return 1;										//Array is in asscending order
		}else if(count2 == input.length)
			return 2;										//Array is in descending order
		else
			return 0;										//Array is unsorted
	
	}
}
