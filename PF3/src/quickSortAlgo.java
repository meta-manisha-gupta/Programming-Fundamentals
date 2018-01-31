/**
 * 
 * Class name-quickSortAlgo
 *  
 * version 1.0
 * @author Manisha Gupta
 *
 */
public class quickSortAlgo {
	/**
	 * This function selects a pivot element and partitions all elements less than the pivot 
	 * in the left part and greater than the pivot in right part.
	 * @param a
	 * @param start
	 * @param end
	 * @return
	 */
	public int partition(int a[], int start, int end){
		int pivot = a[end];
		int pIndex = start;					//Set partition index as start initially.
		for(int i = start; i < end; i++){
			if(a[i] <= pivot){
				//Swap if the element is lesser than the pivot;
				int temp = a[i];
				a[i] = a[pIndex];
				a[pIndex] = temp;
				pIndex++;
			}
		}
		//Swap the element at pIndex with pivot.
		int temp = a[pIndex];
		a[pIndex] = a[end];
		a[end] = temp;
		return pIndex;
	}
	public int[] quickSort(int a[], int start, int end){
		if(start < end){
			int pIndex = partition(a,start, end);		//Calling partition function.
			quickSort(a, start, pIndex-1);
			quickSort(a, pIndex+1, end);
		}
		return a;
	}

}
