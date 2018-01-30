/**
 * Class name-join
 *@version 1.0
 *author Manisha Gupta
 */
 
 /*
  * A class to join two sorted arrays and
  * generate third sorted array.
  */
public class join {
	/*
	 * The function maintains three pointers, one
	 * for each of the two arrays and one for maintaining the current index of final sorted array.
	 * It checks if we have reached the end of any of the arrays?
	 * If No: Compare current elements of both arrays
	 * copy smaller element into sorted array
	 * move pointer of element containing smaller element
	 * If Yes: copy all remaining element of both arrays.
	*/
	 int[] join(int a[], int asize, int b[], int bsize, int c[]){
		 
		
		 int i = 0;									//Initial index of first array
		 int j = 0;									//Initial index of second array
		 int k = 0;									//Initial index of merged array
		 while(i < asize && j < bsize){
			 if(a[i] < b[j]){						//to check whose element is smaller?
				 c[k] = a[i++];
			}
			 else{
				c[k] = b[j++];
			 }
			 k++;
		 }
		 //Copy the remaining elements of b[], if there are any.
		 if(i >= asize){
			 while(j < bsize){
				 c[k++] = b[j++];
			 }
		 }
		 //Copy the remaining elements of a[], if there are any.
		 if(j >= bsize){
			 while(i < asize){
				 c[k++] = a[i++];
			 }
		 }
		return c;
	}

}
