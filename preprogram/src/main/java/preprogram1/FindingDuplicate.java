package preprogram1;



import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class FindingDuplicate {
	
	/*@Test
	public void test1() {
		
		List<Boolean> myList = Arrays.asList(true);
		int[] arr =  Booleans.toArray(myList);
		  
		Assert.assertEquals(arr,IsDuplicate (new int[] {1,2,3,1}));
	}
	
	@Test
	public void test2() {
		
	
		List<Boolean> myList = Arrays.asList(true);
		int[] arr1 =  Booleans.toArray(myList);
		Assert.assertEquals(arr1 ,IsDuplicate (new int[] {1,2,3,1}));
		
	}*/
	
	/* 1. input is int array
	 * 2. Output is boolean
	 * for (i=0,i<=nums.length, i++)
	 * for (j=0;j<=nums.length, j++)
	 * if nums[i]=nums[j] and i!=j
	 * return true 
	 * 
	 */
	
	@Test
	public void test1() {
		boolean actual = IsDuplicate(new int[] {1,2,3,1});
		Assert.assertEquals(true, actual);
		
	}
	
	@Test
	public void test2() {
		boolean actual = IsDuplicate((new int[] {1,2,3,4}));
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test3() {
		boolean actual = IsDuplicate((new int[] {1,1,1,3,3,4,3,2,4,2}));
		Assert.assertEquals(true, actual);
	}

	public boolean IsDuplicate (int[] nums) {
		for (int i=0;i<nums.length;i++)
			for (int j=0;j<nums.length;j++) {
				if(nums[i]==nums[j] && i!=j) {
					return true;
			}
		
	}

	return false;

	} }

		

