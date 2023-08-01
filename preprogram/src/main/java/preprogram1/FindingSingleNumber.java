package preprogram1;

import org.junit.Test;

import junit.framework.Assert;

public class FindingSingleNumber 
{

	
		
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
			int actual = Singlenumber(new int[] {2,2,1});
			Assert.assertEquals(1, actual);
			
		}
		
		@Test
		public void test2() {
			int actual = Singlenumber((new int[] {4,1,2,1,2}));
			Assert.assertEquals(4, actual);
		}
		
		@Test
		public void test3() {
			int actual = Singlenumber((new int[] {1}));
			Assert.assertEquals(1, actual);
		}
        
		public int Singlenumber(int[] nums) {
			for (int i=0;i<=nums.length;i++) {
				
				int count= 0;
				
				for (int j=0;j<nums.length;j++) {
					
					if(nums[i]==nums[j]) {
					count++ ; 
					
						
			
		}
				}
				if (count==1) {
					return nums[i];
				}
				
				
					
					

			}
			return -1;
		}}

		
			