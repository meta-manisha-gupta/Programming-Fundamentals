/**
 * 
 * Class name-remainder
 * 
 * version 1.0
 * @author Manisha Gupta
 *
 */
public class remainder {
	/**
	 * Below function finds the remainder of two numbers assuming x as dividend and y as divisor
	 * where x >= 0 and y > 0.
	 * @param x
	 * @param y
	 * @return
	 */
	public int rem(int x, int y){
		int r = 0;
		if(y == 0){
			return x;
		}
		else{
			r = x - y;
			if(r < y){
				return r;
			}
			else{
				return rem(r, y);
			}
		}
	}
	
}

