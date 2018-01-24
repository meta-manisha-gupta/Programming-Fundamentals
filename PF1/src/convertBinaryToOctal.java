/**
 * Class name-convertBinaryToOctal
 *
 *@version 1.0
 *author Manisha Gupta
 */
 
 /*
  * A class to convert a binary number to its  
  * equivalent octal number.
  */
public class convertBinaryToOctal {
	/*
	 * Below function first converts the given binary number to its equivalent
	 * decimal number by multiplying each digit in the number with 2^n and adding it to previous result,
	 * then the resultant decimal number is converted into octal number by dividing by 8 and the remainder 
	 * is added to get the equivalent octal number.
	*/
	public int convertBinToOct(long binaryNum){
		
		int octalNum = 0, decimalNum = 0, counter = 0;
		//binary to decimal
		while(binaryNum != 0){
			
			decimalNum += (binaryNum % 10) * Math.pow(2, counter++);			//multiply each digit with 2^n.
			binaryNum /= 10;													
			
		}
		counter = 1;
		
		//decimal to octal
		while(decimalNum != 0){
			
			octalNum += (decimalNum % 8) * counter;								
			decimalNum /= 8;
			counter *= 10;
			
		}
		
		return octalNum;
	}

}
