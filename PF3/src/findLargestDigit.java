/**
 * 
 * Class name-findLargestDigit
 * 
 * version 1.0
 * @author Manisha Gupta
 *
 */
public class findLargestDigit {
	/**
	 * This function returns the largest digit of a given number.
	 * @param x
	 * @return
	 */
	int largestDigit(int x){
		int digit, newNumber;
		if(x == 0){
			return 0;
		}
		else{
			digit = x % 10;
			newNumber = largestDigit(x / 10);
			if(newNumber > digit){
				return newNumber;
			}
			else{
				return digit;
			}
		}
	}

}
