package preprogram1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

/* 
 * input is array
 * ouput is number
 * sort the given array.
 * add the array elements into an ArrayList using for for each loop
 * using for loop , check
 * if(sum.get(i)!=i, return i 
 * i.e, if the element in the list of index i is not equal i, then i is the missing number
 * if the missing number exists at the end of list, sum.size() is the missing number
 * so return that at the end. 
 *
 */

public class MissingNumber {
	
	@Test
	public void test1() {
		int actual = findTheMissingNumber(new int[] {0,3,1});
		Assert.assertEquals(2, actual);
	}
	
	public int findTheMissingNumber(int[] nums)
	
	
	

	
	{
		Arrays.sort(nums);
		List<Integer> sum = new ArrayList<>();
		for ( Integer num: nums)
		{
			sum.add(num);
			
		}
		for ( int i =0; i<sum.size();i++)
		{
			if(sum.get(i)!=i) {
				return i;
			}
		}
		return  sum.size();
		
	}
}
