/**
 * 
 * Class name-linearSearch
 * 
 * version 1.0
 * @author Manisha Gupta
 *
 */
public class linearSearch {
	
	/**
	 * This function searches a given value in an array using Linear Search approach.
	 * loc gives us the location in the array from which we want to start searching.
	 * The function returns 1 when the element is found and returns -1 otherwise.
	 * @param a
	 * @param x
	 * @param loc
	 * @return
	 */
	int search(int a[], int x, int loc){
		
		if(loc >= a.length){
			return -1;
		}
		else{
			if(a[loc] == x){
				return 1;
			}
			else{
				return search(a,x,loc+1);
			}
		}
	}

}
