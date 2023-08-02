package July29_Aug4;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FindTheMissingNumber {
	
	@Test
	public void test1() {
	int actual = missingNumber(5,new int[] {1,2,3,5});
	Assert.assertEquals(4, actual);
	}
	
	public int missingNumber ( int N , int[] arr)
	{
		Arrays.sort(arr);
		for (int i=0; i < N;i++)
		{
			if(arr[i]!=i+1)
			{
				return i+1;
			}
		}
		return -1;
		
	}

}
