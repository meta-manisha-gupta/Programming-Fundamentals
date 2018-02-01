/*
 *  Class name-triangularPattern
 * 
 * @version 1.0
 * @author Manisha Gupta
 */

/* 
 * This file contains the class NumberPattern to print pattern
 */
/**
 * Class contains 3 methods
 * First method returns the string containing spaces
 * Second method returns the string containing numbers
 * Last method returns the string containing final pyramid
 */
public class triangularPattern 
{
    /**
     * This function returns String of spaces
     * @param row
     * @param n
     * @return str
     */
    String spaces(int row,int n)
    {
        String str="";
        int spaces=n-row;
        for(int i=0;i<spaces;i++)
        {
            str+=" ";
        }
        return str;
    }
    /**
     * This function returns String of numbers
     * @param row
     * @param n
     * @return str
     */
    String numbers(int row,int n)
    {
        String str="";
        int i,j;
        for(i=1;i<=row;i++)
        {
            str+=i;
        }
        return str;
    }
    /**
     * This function returns final pattern
     * @param n
     * @return pattern
     */
    String[] print(int n)
    {
        int j=0;
        String pattern[] = new String[n];
        for(int i=n;i>0;i--)
        {
            pattern[j]=(spaces(i,n)+numbers(i,n));
            j++;
        }
        return pattern;                                    //returns final pattern
    }    
}
