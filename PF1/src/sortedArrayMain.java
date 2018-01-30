
public class sortedArrayMain {
	public static void main(String []args){
		
	sortedArray checkSortOrder = new sortedArray();
	int inputArray[] = {3,7,9,15,17,55};
	
	int returnValue = checkSortOrder.checkSortedOrder(inputArray);
	
	if(returnValue == 1)
		System.out.println("Given Array is sorted in Asscending Order");
	else if(returnValue == 2)
		System.out.println("Given Array is sorted in Descending Order");
	else
		System.out.println("Given Array is not sorted");
	
	}
}