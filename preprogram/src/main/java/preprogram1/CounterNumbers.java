package preprogram1;

import org.junit.Test;

import junit.framework.Assert;

public class CounterNumbers {
	
	/* input = int array
	 * output = int
	 * count=0;
	 * Iterate over the each number
	 * store element in int x
	 * x+1 in int newx
	 * result=false;
	 * Run loop to search for x + 1
	 * 
	 * after the current element
	 * for loop
	 * if arr[j] = newx;
	 * result=true;
	 * 
	 * 
	 * before the current element 
	 * for loop
	 * if arr[j] = newx;
	 * result = true;
	 * increment the count if result=true;
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void test1() {
		int actual = countingNumbers(new int[] {1, 2, 3});
		Assert.assertEquals(2, actual);
		
	}
	
	@Test
	public void test2() {
		int actual = countingNumbers((new int[] {1, 1, 3, 3, 5, 5, 7, 7}));
		Assert.assertEquals(0, actual);
	}
	
	@Test
	public void test3() {
		int actual = countingNumbers((new int[] {1, 1, 2}));
		Assert.assertEquals(2, actual);
	}
	
	public static int countingNumbers(int[] arr)
	{
	     
	    
	    int count = 0;
	     
	    
	    for (int i = 0; i < arr.length; i++)
	    {
	     
	        
	        int x = arr[i];
	        int newx = x + 1;
	        boolean result = false;
	     
	        for (int j = i + 1; j < arr.length; j++)
	        {
	            if (arr[j] == newx)
	            {
	                result = true;
	                break;
	            }
	        }
	     
	        for (int k = i - 1; !result && k >= 0; k--)
	        {
	            if (arr[k] == newx)
	            {
	                result = true;
	                break;
	            }
	        }
	     
	        if (result == true)
	        {
	            count++;
	        }
	    }
	        return count;
	}

}
