/**
 * Class name-removeDuplicate
 *
 *@version 1.0
 *author Manisha Gupta
 */

 
 /*
  * A class to remove duplicate elements from 
  * a given arrray of integers which may be sorted or unsorted.
  */
public class removeDuplicate {
	
	/*
	 * Below function removes all occurences of duplicate elements.
	 * The function loops through all elements of array and
	 * compares current element with previous element and 
	 * removes the duplicacy.
	*/
	public int[] removeDuplicate(int input[]){
		
		
		int inputSize = input.length;
		if(inputSize == 0 || inputSize == 1)       										// To check wheather the given array is empty or contains 
			return input;																// single elment.
		
		for(int counter1 = 0; counter1 < inputSize; counter1++){
			for(int counter2 = counter1+1; counter2 < inputSize; counter2++){
				if(input[counter1] == input[counter2]){									// Compares the current element with the previous one.
						for(int counter3 = counter2; counter3 < inputSize-1; counter3++){
							input[counter3] = input[counter3+1];						// Assign the next element on the duplicate element.
						}
						inputSize--;													//to decrease the size of array after removal of duplicate elements.
						counter2--;														//to avoid the condition when two or more consecutive numbers are same.
					}
				
				}
			}
		int output[] = new int[inputSize];
		System.arraycopy(input, 0, output, 0, inputSize);								// used to copy elements of input array to output array.
		return output;																	//returns new array without duplicacy.
	}
}
