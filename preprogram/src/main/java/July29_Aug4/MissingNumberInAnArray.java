package July29_Aug4;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * input array 
 * output int
 * sort the given array
 * traverse through the array
 * and check if the next element is increment of first element
 * else return the next element.
 * 
 */
public class MissingNumberInAnArray {
	
	@Test
	public void test1() {
	int actual = missingNumber(new int[] {3,0,1});
	Assert.assertEquals(2, actual);
	}
	
	public int missingNumber (int[] nums)
	{
	 Arrays.sort(nums);
	 
	 for ( int i = 0; i < nums.length ; i ++ )
		 
		 if ( nums[i+1] != nums[i]+1)
		 {
			return nums[i+1];
		 }
	return 0 ;
	 
		
		
	}

}
