package preprogram1;

import org.junit.Assert;
import org.junit.Test;

public class JulyFindOccurences {
	
	/*
	 * intput - int array
	 * output - int
	 * count = 0
	 * traverse through the given array using two for loops
	 * if arr[i] == arr[j]
	 * count ++
	 * return count
	 * 
	 */
	@Test
	public void test1() {
		int actual = Frequency(new int[] {1,2,3,1}, 1);
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test2() {
		int actual = Frequency(new int[] {1,1,3,1,3,1}, 1);
		Assert.assertEquals(4, actual);
	}
	
	public int Frequency(int[] arr, int x) {
		
		
		
		
		
	
	
	int count = 0;
	for (int i=0;i<arr.length;i++) {
		
		
			 if (x==arr[i])
			 {
				 
			 count ++ ;
			 }
			 
			
			
	
	}
	return count;
	}
	

}

