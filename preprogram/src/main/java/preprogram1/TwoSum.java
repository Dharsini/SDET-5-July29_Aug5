package preprogram1;
/*
 * input - int arr
 * output - int arr
 * traverse through the 2 for loops
 * if nums [i] + num [j] = target
 * index1 = i
 * index2 = j
 * return arr [ index1, index2]
 * 
 */

import org.junit.Assert;
import org.junit.Test;

public class TwoSum {
	@Test
	public void test1() {
		int[] actual = sumTwo(new int[] {2,7,11,15},9);
		Assert.assertEquals(new int[] {0,1}, actual);
	}
	
	public int[] sumTwo (int [] arr, int target)
	
	{
		for (int i = 0; i < arr.length;i++)
		{
			for ( int j=i+1; j<arr.length;j++)
			{
				if(arr[i]+arr[j]== target)
				{
					return new int[] {i,j};
					
				}
				
			}
		}
		return new int[] {};
		
	}
	
	
	
	
	
	

}
