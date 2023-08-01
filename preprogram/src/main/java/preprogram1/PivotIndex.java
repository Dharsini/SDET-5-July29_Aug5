package preprogram1;
/*
 * intout int array
 * output int
 * total , sum 0
 * find the sum of the elemetns of the array
 * traverse through the array  and check leftSum == total - leftSum - nums [i]
 * if it is true, return i
 * otherwise return -1
 */

import org.junit.Assert;
import org.junit.Test;

public class PivotIndex {
	
	@Test
	public void test1() {
		int actual = pivot(new int[] {1,7,3,6,5,6});
		Assert.assertEquals(3, actual);
	}
	
	public int pivot( int[]nums)
	{
		int total = 0;
		int leftSum = 0;
		for ( int x: nums) 
			total = total + x;
		for ( int i=0; i < nums.length ; i ++) {
			if ( leftSum == total - leftSum - nums [i])
				return i;
		leftSum += nums[i];
	}
		return - 1 ;
		
	
		
	}

}
