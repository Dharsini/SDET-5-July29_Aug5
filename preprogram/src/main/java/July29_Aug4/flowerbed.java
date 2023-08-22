package July29_Aug4;

/*
 *input int arr and int 
 * output boolean
 * traverse through the array
 * chek if the current , previous and element are zero
 * if yes, return zero
 * increase the count until count is lsesser than n
 * return false
 * 
 */

import org.junit.Assert;
import org.junit.Test;

public class flowerbed {
	
	@Test
	public void test1() {
	boolean actual = flowers(new int[] {1,0,0,0,1}, 1 );
	Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2() {
	boolean actual = flowers(new int[] {1,0,0,0,1}, 2 );
	Assert.assertEquals(false, actual);
	}
	
	
	
	public boolean flowers ( int[] arr, int n)
	 
	{
		
		
		
		for (int i = 0 ; i<= arr.length-1 ; i++)
		{
			int count=0;
			
			
				if (( arr[i-1]==0) && (arr[i+1] ==0)&& (arr[i]==0))
				{
					count ++ ;
					if ( count == n)
					{
						return true; 
					}
					
				}
				
				
				
				
				
				
			}
			
		
		
		return false;
		
	}

}
