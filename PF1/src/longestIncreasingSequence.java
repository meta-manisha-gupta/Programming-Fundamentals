/**
 * Class name-longestIncreasingSequence
 *
 *@version 1.0
 *author Manisha Gupta
 */
 
 /*
  * A class to find longest increasing sequence from an array of n integer values.
  */
public class longestIncreasingSequence {
	/*
	 *The function returns the longest increasing subsequence in input[]
	*/
	int[] longestSequence(int input[]){
		
		int sequenceStart = 0, count = 0, sequenceLength = 0;
		for(int counter = 1; counter < input.length; counter++){
			if(input[counter] > input[counter-1])
				count++;							//Increment count if the current element is greater than the previous one
			
			else{
				count = 0;							//Re-Initialize count
			}
			if(count > sequenceLength){				//If we have found subsequence longer thgan any we've found yet, update sequenceLength
				sequenceStart = counter;
				sequenceLength = count;
			}
		}
		int output[] = new int[sequenceLength+1];
		//Reconstruct the longest increasing subsequence
		for(int counter = (sequenceStart-sequenceLength),c = 0; counter <= sequenceStart; counter++){
			output[c++] = input[counter];
		}
			
		return output;
	}
}