package July29_Aug4;
/*
 * input arr
 * output int
 * sort the array
 * traverse through the array by i+2 
 * res is res + nums[i]
 * return the res
 */



import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartition_ {
	@Test
	public void test1() {
	int actual = arrayPartitionSum(new int[] {1,4,3,2});
	Assert.assertEquals(4 , actual);
	}
	@Test
	public void test2() {
	int actual = arrayPartitionSum(new int[] {6,2,6,5,1,2});
	Assert.assertEquals(9 , actual);
	}
	
	public int arrayPartitionSum ( int[] nums)
	{
		Arrays.sort(nums);
		int res = 0;
		for ( int i =0; i < nums.length ; i+=2)
		{
			res = res + nums[i];
		}
		return res;
	}

}
