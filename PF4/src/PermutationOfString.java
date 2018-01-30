import java.util.ArrayList;
import java.util.List;
/**
 * 
 * Class name-PermutationOfString
 * 
 * version 1.0
 * @author Manisha Gupta
 *
 */

public class PermutationOfString {
    ArrayList<String> permutations = new ArrayList<String>();
    /**
     * Below function swaps characters at two positions.
     * @param x
     * @param i
     * @param j
     * @return swapped string
     */
    public String swap(String x, int i, int j){
        char temp;
        char [] charArray = x.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
        
    }
    /**
     * Below function returns all permutations of string using backtracking.
     * Assuming each character of string is unique.
     * @param str
     * @param start
     * @param end
     * @return all permutations of string.
     */
    public ArrayList<String> generatePermutations(String str, int start, int end){
        
        if(start == end){
            permutations.add(str);
        }
        else{
            for(int i = start; i <= end; i++){
                str = swap(str,start,i);
                generatePermutations(str, start+1, end);
                str = swap(str,start,i);
                
            }
        }
        return permutations;
        
    }

}
