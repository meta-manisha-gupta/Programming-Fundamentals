/**
 * 
 * Class name-greatestCommonDivisor
 * 
 * version 1.0
 * @author Manisha Gupta
 *
 */
public class greatestCommonDivisor {
	/**
	 * Below function finds the greatest common divisor of two numbers assuming 
	 *  x > 0 and y > 0. 
	 *  The function returns -1 if any of those is negative.
	 * @param x
	 * @param y
	 * @return
	 */
	int gcd(int x, int y){
		if(x > 0 && y > 0){
			if(x % y == 0){
				return y;
			}
			else{
				return gcd(y, x % y);
			}
		}
		else{
			return -1;							//return -1 if x or y is negative.
		}
	}
}
