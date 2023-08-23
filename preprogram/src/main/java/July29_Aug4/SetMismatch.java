package July29_Aug4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/*
 * input arr
 * output arr
 * Traverse through the array from 1 to <=n
 * again traverse through the array from 0 to n 
 * i = nums[j], increase the count 
 * if the count is 2 , the element is present twice
 * if the count is zero , th element is missing. 
 * return the result array. 
 * 
 * 
 * 
 */

public class SetMismatch {
	
	@Test
	public void test1() {
	int[] actual = mismatchSet(new int[] {1,2,2,4});
	Assert.assertEquals(new int[] {2,3}, actual);
	}
	
	public int[] mismatchSet(int[] nums)
	
	
	{   
		int[] arr = new int[nums.length];
		int[] result = new int[2];
		
		int count = 0;
		for ( int i = 1; i<= nums.length;i++) {
			
			for (int j= 0 ; i < nums.length ; j++ )
			{
				i=nums[j];
				count ++;
				
				if ( count == 2)
				{
					result[0]= i ;
				}
				
				if ( count == 0)
				{
					result[1] = i;
				}
			}
			
		}
		
		
		return result;
		
				
				
				
				
				
				
				 
				
				
				
				
				
			
		
		
	}
	
	

}
