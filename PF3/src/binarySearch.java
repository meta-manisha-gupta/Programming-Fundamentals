/**
 * 
 * Class name-binarySearch
 * 
 * version 1.0
 * @author Manisha Gupta
 *
 */
public class binarySearch {
	/**
	 * This function searches a given value in an array using binary Search approach.
	 * low and high tells us the start an end and index.
	 * The function returns 1 when the element is found and returns -1 otherwise.
	 * @param a
	 * @param low
	 * @param high
	 * @param x
	 * @return
	 */
	public int search(int a[], int low, int high, int x){
		int mid;
		if(high >= low){
			mid = low + (high - low)/2;
			if(a[mid] == x){
				return 1;
			}
			if(a[mid] < x){
				return search(a, mid+1, high, x);
			}
			
				return search(a, low, mid-1, x);
		}
		return -1;
		}
}
