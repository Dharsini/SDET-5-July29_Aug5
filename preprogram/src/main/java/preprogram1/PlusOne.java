package preprogram1;

import org.junit.Test;

import junit.framework.Assert;

/*
 * input is int array
 * output is int array
 * iterate through the array from las t index using for loop
 * if the number at the current index is smaller than  9 , ass one to the 
 * number and return the array else set the number to zero
 * if all the numbers were 9, then increase the size of the array by one and
 * assign 1 to 0th index.
 * return the array.
 */

public class PlusOne {
	
	
	@Test
	public void test1() {
		int[] actual = plusOne(new int[] {1,2,3});
		Assert.assertEquals(new int[] {1,2,4}, actual);
		
	}
	
	public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }else {
            digits[i] = 0;
            }
        }
        int[] newNumber = new int [n+1];
        newNumber[0] = 1;   
        return newNumber;
    }
}
