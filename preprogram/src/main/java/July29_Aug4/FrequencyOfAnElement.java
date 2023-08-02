package July29_Aug4;

import org.junit.Assert;
import org.junit.Test;

/*
 * input -> array, int 
 * output -> int
 * count = 0
 * Traverse through the array and
 * check if x is present in the array
 * If present , increment the count
 * return the count at the end 
 */

public class FrequencyOfAnElement {
	
	@Test
	public void test1() {
	int actual = frequencyElement(new int[] {1, 1, 2, 2, 2, 2, 3}, 2);
	Assert.assertEquals(4, actual);
	}
	
	public int frequencyElement(int[] arr, int x)
	{
		int count = 0;
		
		for ( int i = 0; i<arr.length;i++) {
			if (arr[i]==x)
			{
				count =count +1;
			}
			
		}
		
		return count;
		
	}

}
