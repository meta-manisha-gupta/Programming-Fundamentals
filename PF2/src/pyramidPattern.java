/**
 * 
 * Class name-pyramidPattern
 * 
 * version 1.0
 * @author Manisha Gupta
 *
 */
public class pyramidPattern {
	/**
	 * This function returns number of spaces according to row number.
	 * @param row
	 * @param n
	 * @return
	 */
	public String spaces(int row, int n){
		int noOfSpaces = n - row;
		String spaces = "";
		
		for(int i = 0; i < noOfSpaces; i++){
			spaces += " ";
		}
		
		return spaces;
	}
	/**
	 * This function returns a string of numbers according to row number.
	 * @param row
	 * @param n
	 * @return
	 */
	String numbers(int row, int n){
		
		String str = "";
		int i ,j;
		for(i = 1; i <= row; i++){
				str += i;
		}
		for(j = row-1; j > 0; j-- ){
			str += j;
		}
		
		
		return str;
	}
	/**
	 * Below function concatenates the output of above two functions and returns the expected pattern.
	 * @param n
	 * @return
	 */
	String[] printPyramid(int n){
		String pattern[] = new String[(2*n)-1];
		int i;
		for( i = 0; i < n; i++){
			pattern[i] = (spaces(i+1,n) + numbers(i+1,n) + spaces(i+1,n));
			
			
		}
		 int k=1;
	        for(int j=i;j<2*n-1;j++)
	        {
	            pattern[j]=(spaces(n,j+1)+numbers(n-k,n)+spaces(n,j+1));
	            k++;
	        }
		
		
		return pattern;
	}
}
