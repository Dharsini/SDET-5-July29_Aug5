package preprogram1;

import org.junit.Assert;
import org.junit.Test;

/*
 * input - int array
 * output - boolean
 * Traverse through the array using two for loops
 * if arr[i]=arr[j],return true
 * else return false.
 * 
 * 
 */
public class JulyFindingRecurringNonRecurring {
	
	@Test
	public void test1() {
		boolean actual = Recurring(new int[] {1,2,3,1});
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2() {
		boolean actual = Recurring(new int[] {1,2,3,4});
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test3() {
		boolean actual = Recurring(new int[] {1,1,1,3,3,4,3,2,4,2});
		Assert.assertEquals(true, actual);
	}
	
	
	
	
	
	public boolean Recurring(int[] arr) {
		
		
		for (int i=0;i<arr.length;i++) {
			
		
			for ( int j = i+1; j<arr.length;j++)
			{
				 if (arr[i]==arr[j])
				 {
					 
				 return true;
				 }
				 
				
				
		
		}}
	
		return false;
		
		
	}

}
