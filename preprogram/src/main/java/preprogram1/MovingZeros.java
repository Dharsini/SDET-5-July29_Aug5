package preprogram1;

import org.junit.Assert;
import org.junit.Test;



/*input is array 
 * output is array
 * Traverse through the array and find the count of non zero elements
 * if arr[i] is not equal to zero, update the value of arr at indx count to arr[i]
 * Update all elements ar index >=count with value 0 
 */



public class MovingZeros {
	

	@Test
	public void test1() {
		int[] actual = MoveZeros((new int[] {1, 2,0,3,0}));
		Assert.assertArrayEquals(new int[] {1,2,3}, actual);
		
	}

	
	public int[] MoveZeros ( int[] arr)
	{
		int count = 0;
		
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
				arr[count++]=arr[i];
		}
		for (int i=count ; i<arr.length;i++)
		{
			arr[i]=0;
		}
		return arr;
			
			
			
	}

}
